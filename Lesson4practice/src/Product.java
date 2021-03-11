
public class Product {
	private String name;
	private double price;
	private int quantity;
	private static double maxPrice = 0;
	private static int maxQuantity = 0;
	
	private static Product mostExpensive = new Product();
	private static Product mostInStock = new Product();
	
	public Product() {}
	
	public Product(String name) {
		this.name = name;
	}
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public static void checkProduct(Product product) {
		if (product.price > maxPrice) {
			mostExpensive = product;
			maxPrice = product.price;
		}
		if (product.quantity > maxQuantity) {
			mostInStock = product;
			maxQuantity = product.quantity;
		}
	}
	
	public static void getMostExpensive() {
		System.out.println("The most expensive product is " + mostExpensive.getName() + ". There currently " + mostExpensive.getQuantity() + " items in stock.");
	}
	
	public static void getMostQuantity() {
		System.out.println("The product with the biggest quantity is " + mostInStock.getName() + ". It's price is " + mostInStock.getPrice() + ".");
	}
}
