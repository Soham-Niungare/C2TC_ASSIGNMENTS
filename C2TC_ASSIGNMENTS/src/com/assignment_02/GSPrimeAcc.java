package com.assignment_02;

public class GSPrimeAcc extends PrimeAcc{
	private static final float Charges = 0;

	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
	}
	
	@Override
	public void bookProduct(float a) {
		// code
	}

	@Override
	public String toString() {
		return "GSPrimeAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	
	
	
}
