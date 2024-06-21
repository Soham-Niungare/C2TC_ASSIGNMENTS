package com.assignment_02;

public class GSNormalAcc extends NormalAcc{

	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges, deliveryCharges);
	}
	
	@Override
	public void bookProduct(float a) {
		// code
	}

	@Override
	public String toString() {
		return "GSNormalAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}


	
	
}
