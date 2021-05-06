package com.br.sds3.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.br.sds3.entities.Sale;

public class SaleDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private long id;
	private Integer visited;
	private Integer deals;
	private double amount;
	private LocalDate date;
	
	private SellerDTO seller;
	
	public SaleDTO() {
		
	}

	public SaleDTO(long id, Integer visited, Integer deals, double amount, LocalDate date, SellerDTO seller) {
		this.id = id;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
		this.seller = seller;
	}
	
	public SaleDTO(Sale entity) {
		id = entity.getId();
		visited = entity.getVisited();
		deals = entity.getDeals();
		amount = entity.getAmount();
		date = entity.getDate();
		seller = new SellerDTO(entity.getSeller());
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getVisited() {
		return visited;
	}

	public void setVisited(Integer visited) {
		this.visited = visited;
	}

	public Integer getDeals() {
		return deals;
	}

	public void setDeals(Integer deals) {
		this.deals = deals;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public SellerDTO getSeller() {
		return seller;
	}

	public void setSeller(SellerDTO seller) {
		this.seller = seller;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
