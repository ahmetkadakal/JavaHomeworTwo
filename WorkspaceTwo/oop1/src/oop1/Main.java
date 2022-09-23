package oop1;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product();
		//set value değer atama
		product1.setName("Delongi kahve makinesi");
		product1.setDiscount(7);
		product1.setUnıtePrice(5);
		product1.setUnitsInStock(32);
		product1.setImageUrl("benbilmem.png");
		//get değer okuma 
		
		//System.out.println(product1.name);
		
		Product product2 = new Product();
		product2.setName("vestel kahve makinesi");
		product2.setDiscount(75);
		product2.setUnıtePrice(15);
		product2.setUnitsInStock(42);
		product2.setImageUrl("benbilmem1.png");
		
		
		Product product3 = new Product();
		product3.setName("beko kahve makinesi");
		product3.setDiscount(22);
		product3.setUnıtePrice(6);
		product3.setUnitsInStock(132);
		product3.setImageUrl("benbilmem1.png");
	
		
		Product[] products = {
				product1,product2,product3
		}; 
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>"+product.getName()+"</li>");
		}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setCustomerNumber("052222");
		individualCustomer.setCustomerNumber("asd");
		individualCustomer.setName("ahmet");
		individualCustomer.setSurName("kadakal");
		
		CorpretCustomer corpredCustomer = new CorpretCustomer();
		corpredCustomer.setId(2);
		corpredCustomer.setCompanyName("kodlama.io");
		corpredCustomer.setPhoneNumber("053165651");
		corpredCustomer.setTaxNumber("23");
		corpredCustomer.setCustomerNumber("1231");
		
	}

}
