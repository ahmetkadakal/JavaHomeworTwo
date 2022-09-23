
public class Product {

	public Product(int id, String name, String description, double price, int stockAmonth) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmounth = stockAmonth;

	}
	//overloading 
	public Product() {

	}

	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmounth;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmounth() {
		return stockAmounth;
	}

	public void setStockAmounth(int stockAmounth) {
		this.stockAmounth = stockAmounth;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	private String code;
}
