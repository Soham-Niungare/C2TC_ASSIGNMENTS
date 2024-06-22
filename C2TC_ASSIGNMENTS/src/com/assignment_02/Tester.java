package com.assignment_02;

public class Tester {
	public static void main(String[] args) {
		
		ShopFactory sf = new GSShopFactory();
		
		PrimeAcc pa = sf.getNewPrimeAcc(121, "Soham", 10, true);
		
		NormalAcc na = sf.getNewNormalAcc(51, "Arya", 20, 50);
		
		pa.bookProduct(5);
		
		na.bookProduct(10);
		
		System.out.println(pa);
		System.out.println(na);
	}
}
