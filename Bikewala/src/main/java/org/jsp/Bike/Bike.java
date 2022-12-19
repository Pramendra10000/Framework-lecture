
package org.jsp.Bike;

//1st day of Hibernate lec 14feb 

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.Table;

@Entity
@Table
public class Bike {
   @Id
	private int id;
   private String name;
   private String color;
   private double price;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
   
public static void main(String[] args) {
	Bike bike= new Bike();
	bike.setId(105);
	bike.setColor("Blue");
	bike.setName("unicorn");
	bike.setPrice(1010000);
	
	bike.savedata(bike);
	
	
}

public void savedata( Bike bike) {
	
	EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("HONDA");
	EntityManager entityManager= entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	entityTransaction.begin();
	entityManager.persist(bike);
	entityTransaction.commit();
	
}
	
	
}














































