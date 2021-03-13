import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Product {
	private String name;
	private double price;
	private int quantity;
	
	public Product() {}
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
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

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	public void getMostExpensive(Product prods[]) {
		double maxPrice = prods[0].getPrice();
		Product mostValuableProduct = prods[0];
		for(int i = 1;i < prods.length; i++ ) {
			if (prods[i].price > maxPrice) {
				maxPrice = prods[i].price;
				mostValuableProduct = prods[i];
			}
		}
		System.out.println("The most expensive is " + mostValuableProduct.name);
	}
	
	public void getBiggestQuantity(Product prods[]) {
		double maxQuantity = prods[0].getQuantity();
		Product mostCommonProduct = prods[0];
		for(int i = 1;i < prods.length; i++ ) {
			if (prods[i].quantity > maxQuantity) {
				maxQuantity = prods[i].quantity;
				mostCommonProduct = prods[i];
			}
		}
		System.out.println(mostCommonProduct.name + " is a product of with the biggest quantity");
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Product products[] = new Product[4];
		for (int i=0; i < 4; i++) {
			products[i] = new Product();
			System.out.println("name:");
			products[i].setName(br.readLine());
			System.out.println("price:");
			products[i].setPrice(Double.parseDouble(br.readLine()));
			System.out.println("quantity:");
			products[i].setQuantity(Integer.parseInt(br.readLine()));
		}
		products[0].getMostExpensive(products);
		products[0].getBiggestQuantity(products);
	}

}
