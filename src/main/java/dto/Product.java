package dto;

public class Product {

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", brand=" + brand + ", price=" + price + ", quantity="
				+ quantity + "]";
	}
	
	
	public Product() {
		super();
	}


	private int id;
	public Product(int id, String name, String brand, double price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
	}

	

	private String name;
	private String brand;
	private double price;
	private int quantity;
	
	//to generate getter and setter go to / source / generate getter and setter
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
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	
}
