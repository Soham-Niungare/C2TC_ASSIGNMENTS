package com.assignment_02;

public abstract class PrimeAcc extends ShopAcc{

	private final boolean isPrime;
	private static final float deliveryCharges = 0;
	
	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
		this.isPrime = isPrime;
	}
	
	@Override
	public void bookProduct(float books) {
		//code
	}

	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + "]";
	}
	
	
	
	


	
}
