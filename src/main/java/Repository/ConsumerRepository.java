package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Entity.Consumer;


public interface ConsumerRepository extends JpaRepository<Consumer,Integer> {
    Consumer findByName(String name);
}
