package com.br.sds3.dto;

import java.io.Serializable;

import com.br.sds3.entities.Seller;

public class SalesSumDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String sellerName;
	private  double Sum;
	
	public SalesSumDTO() {
	}

	public SalesSumDTO(Seller seller, double sum) {
		this.sellerName = seller.getName();
		Sum = sum;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public double getSum() {
		return Sum;
	}

	public void setSum(double sum) {
		Sum = sum;
	}
}
