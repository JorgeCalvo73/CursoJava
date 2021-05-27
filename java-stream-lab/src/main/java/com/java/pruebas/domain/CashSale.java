package com.java.pruebas.domain;

public class CashSale {

	private String billId;
	private Double total;

	public CashSale() {

	}

	public CashSale(String billId, Double total) {
		super();
		this.billId = billId;
		this.total = total;
	}

	public String getBillId() {
		return billId;
	}

	public void setBillId(String billId) {
		this.billId = billId;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "CashSale [billId=" + billId + ", total=" + total + "]";
	}

}
