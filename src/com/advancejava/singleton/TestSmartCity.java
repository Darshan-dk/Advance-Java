package com.advancejava.singleton;

public class TestSmartCity {

	public static void main(String[] args) {

		SmartCity smartCity = SmartCity.getSmartCity();
		System.out.println(smartCity);
		SmartCity smartCity1 = SmartCity.getSmartCity();
		System.out.println(smartCity1);
		SmartCity smartCity2 = SmartCity.getSmartCity();
		System.out.println(smartCity2);
	}

}
