package com.assignment_02;

public abstract class ShopAcc {
	private final  int accNo;
	private String accNm;
	private final float charges;
	
	public ShopAcc(int accNo, String accNm, float charges) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}
	
	public void bookProduct(float books) {
		//code
	}
	
	public void items(float i) {
		// code
	}

	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + "]";
	}
	
	
	
	
}
