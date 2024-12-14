package Week15_8;

import java.io.Serializable;

public class Product implements Serializable {
	private static final long serialVersionUID = -61856931265126985L;
	private String name;
	private int price;
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String toString() { return name + ": " + price; }
}
