
public class Main {

	public static void main(String[] args) {
		ProductManager productManger = new ProductManager();
		Product product = new Product(1,"Ahmet","people",1999,120);
		
		productManger.add(product);
		
		product.setName("Laptop");
		product.setId(15);
		product.setDescription("Asus Laptop");
		product.setPrice(1200);
		product.setStockAmounth(399);

		
		productManger.add(product);

	}

}
