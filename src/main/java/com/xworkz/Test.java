package com.xworkz;

public class Test {
	
	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		laptop.setName("Lenovo");
		laptop.setPrice(1212121);
		laptop.setRam(8);
		
		LaptopDao dto = new LaptopDao();
		dto.saveDetails(laptop);
	}
}
                  