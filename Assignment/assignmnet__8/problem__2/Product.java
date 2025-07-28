package assignment.assignmnet__8.problem__2;

public class Product {
	private String name;
	private double price;
	private int stock;
	
	
	public Product(String name,double price, int stock)
	{
		this.name=name;
		this.price=price;
		this.stock=stock;
	}
	
	public void purchase(int quantity ) throws OutOfStockException {
		if  (quantity<=0) {
			throw new IllegalArgumentException("Quantity must be greater than zero.");
		}
		if (quantity>stock) {
			throw new OutOfStockException ("Requested quantity exceeds available stock.");
		}
		stock -= quantity;
        System.out.println("Purchased " + quantity + " unit(s) of " + name + " for ₹" + (quantity * price));
        
        
        
        
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the stock
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * @param stock the stock to set
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	

}
