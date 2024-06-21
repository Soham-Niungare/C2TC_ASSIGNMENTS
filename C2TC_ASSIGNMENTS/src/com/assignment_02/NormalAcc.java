package com.assignment_02;

public abstract class NormalAcc extends ShopAcc{
	private final float deliveryCharges;

	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges);
		this.deliveryCharges = deliveryCharges;
	}
	
	@Override
	public void bookProduct(float a) {
		// code
	}

	@Override
	public String toString() {
		return "NormalAcc [deliveryCharges=" + deliveryCharges + "]";
	}
	
	
	
}
