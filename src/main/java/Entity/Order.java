package Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Order_TBL")
public class Order {

    @Id
    @GeneratedValue
    private int id;
    private String datem;
    private String purchasedBy;
    private String purchasedItem;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDate() {
		return datem;
	}
	public void setDate(String datem) {
		this.datem = datem;
	}
	public String getPurchasedBy() {
		return purchasedBy;
	}
	public void setPurchasedBy(String purchasedBy) {
		this.purchasedBy = purchasedBy;
	}
	
	public String getPurchasedItem() {
		return purchasedItem;
	}
	public void setPurchasedItem(String purchasedItem) {
		this.purchasedItem = purchasedItem;
	}
	public Order(int id,String datem, String purchasedBy, String purchasedItem) {
		super();
		this.id = id;
		this.datem = datem;
		this.purchasedBy = purchasedBy;
		this.purchasedItem = purchasedItem;
	}
	
	public Order() {
		
	}
}
 