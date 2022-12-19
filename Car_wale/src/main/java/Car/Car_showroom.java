package Car;

//1st day of Hibernate lec 14feb ,it was assignment

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.Table;

@Entity
@Table
public class Car_showroom {

	@Id
	private int id;
	private String Name;
	private String color;
	private double milage;
	private double price;
	private int model_year;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getMilage() {
		return milage;
	}

	public void setMilage(double milage) {
		this.milage = milage;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getModel_year() {
		return model_year;
	}

	public void setModel_year(int model_year) {
		this.model_year = model_year;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car_showroom showroom = new Car_showroom();
		showroom.setId(103);
		showroom.setName("BMW");
		showroom.setColor("BLACK");
		showroom.setPrice(3500000);
		showroom.setMilage(350);
		showroom.setModel_year(2020);

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("BMW");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		transaction.begin();
		manager.persist(showroom);
		transaction.commit();

	}

}
