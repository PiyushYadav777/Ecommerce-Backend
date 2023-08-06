# Ecommerce-Backend

E-commerce Backend API Documentation

Introduction:
This document provides the API documentation for the E-commerce backend application. The application is built using Spring Boot and follows the RESTful principles to manage products, orders, and consumer. The data is stored in a MySQL database. Below are the details of each endpoint and the corresponding operations.

API Endpoints:

1. Product Endpoints
- Create a new product: (POST) `/addProduct`
  - Request Body: Product object (JSON)
  - Response: Returns the newly created Product object.

- Create multiple products: (POST) `/addProducts`
  - Request Body: List of Product objects (JSON)
  - Response: Returns a list of the newly created Product objects.

- Get all products: (GET) `/products`
  - Response: Returns a list of all products.

- Get product by ID: (GET) `/productById/{id}`
  - Path Variable: `id` (Integer) - ID of the product
  - Response: Returns the Product object with the given ID.

- Get product by name: (GET) `/product/{name}`
  - Path Variable: `name` (String) - Name of the product
  - Response: Returns the Product object with the given name.

- Update product: (PUT) `/update`
  - Request Body: Product object (JSON)
  - Response: Returns the updated Product object.

- Delete product by ID: (DELETE) `/delete/{id}`
  - Path Variable: `id` (Integer) - ID of the product to delete
  - Response: Returns a success message after deleting the product.

2. Order Endpoints
- Create a new order: (POST) `/addOrder`
  - Request Body: Order object (JSON)
  - Response: Returns the newly created Order object.

- Create multiple orders: (POST) `/addOrders`
  - Request Body: List of Order objects (JSON)
  - Response: Returns a list of the newly created Order objects.

- Get all orders: (GET) `/orders`
  - Response: Returns a list of all orders.

- Get order by ID: (GET) `/orderById/{id}`
  - Path Variable: `id` (Integer) - ID of the order
  - Response: Returns the Order object with the given ID.

- Get orders by consumer name: (GET) `/orderByConsumer/{consumer}`
  - Path Variable: `consumer` (String) - Name of the consumer
  - Response: Returns a list of orders made by the given consumer.

- Get orders by product name: (GET) `/orderByProduct/{product}`
  - Path Variable: `product` (String) - Name of the product
  - Response: Returns a list of orders for the given product.

- Get orders by date: (GET) `/orderBydatem/{datem}`
  - Path Variable: `datem` (String) - Date in the format 'yyyy-MM-dd'
  - Response: Returns a list of orders made on the given date.

- Update order: (PUT) `/order/update`
  - Request Body: Order object (JSON)
  - Response: Returns the updated Order object.

- Delete order by ID: (DELETE) `/order/delete/{id}`
  - Path Variable: `id` (Integer) - ID of the order to delete
  - Response: Returns a success message after deleting the order.

3. Consumer Endpoints
- Create a new consumer: (POST) `/addConsumer`
  - Request Body: Consumer object (JSON)
  - Response: Returns the newly created Consumer object.

- Create multiple consumers: (POST) `/addConsumers`
  - Request Body: List of Consumer objects (JSON)
  - Response: Returns a list of the newly created Consumer objects.

- Get all consumers: (GET) `/consumers`
  - Response: Returns a list of all consumers.

- Get consumer by ID: (GET) `/consumerById/{id}`
  - Path Variable: `id` (Integer) - ID of the consumer
  - Response: Returns the Consumer object with the given ID.

- Get consumer by name: (GET) `/consumer/{name}`
  - Path Variable: `name` (String) - Name of the consumer
  - Response: Returns the Consumer object with the given name.

- Update consumer: (PUT) `/consumer/update`
  - Request Body: Consumer object (JSON)
  - Response: Returns the updated Consumer object.

- Delete consumer by ID: (DELETE) `/consumer/delete/{id}`
  - Path Variable: `id` (Integer) - ID of the consumer to delete
  - Response: Returns a success message after deleting the consumer.

API Testing:
We can test the APIs using tools like Postman or any API testing tool of our choice. Below is the Postman collection link that contains all the endpoints with sample requests and responses:

[Postman Collection](https://www.postman.com/collections/your-postman-collection-link)

Running the Application Locally:

To run the application locally, follow the steps below:
1. Install MySQL and create a database named "Ecommerce_Database".
2. Update the `application.properties` file with your MySQL database configuration.
3. Build the project using Maven:   mvn clean install
4. Run the Spring Boot application:   mvn spring-boot:run
5. The application will start on `http://localhost:2023/`.

That's it! we now have the e-commerce backend application running locally, and we can use the provided API documentation to interact with the endpoints.

