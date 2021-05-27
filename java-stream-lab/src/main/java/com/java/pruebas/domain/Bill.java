package com.java.pruebas.domain;

import java.util.List;

public class Bill implements Comparable<Bill> {

	private Integer id;
	private String billId;
	private Client client;
	private Double total;
	private List<BillLine> billLines;
	
	public Bill() {
    }
	
    public Bill(String codigo) {
        this.billId = codigo;
    }
    
    

	public Bill(Integer id, String billId, Client client, Double total) {
		super();
		this.id = id;
		this.billId = billId;
		this.client = client;
		this.total = total;
	}

	public Bill(Integer id, String billId, Client client, Double total, List<BillLine> billLines) {
		super();
		this.id = id;
		this.billId = billId;
		this.client = client;
		this.total = total;
		this.billLines = billLines;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBillId() {
		return billId;
	}

	public void setBillId(String billId) {
		this.billId = billId;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public List<BillLine> getBillLines() {
		return billLines;
	}

	public void setBillLines(List<BillLine> billLines) {
		this.billLines = billLines;
	}

	@Override
	public String toString() {
		return "Bill [id=" + id + ", billId=" + billId + ", client=" + client + ", total=" + total + ", billLines="
				+ billLines + "]";
	}

	public int compareTo(Bill otherBill) {
	        return total.intValue()-otherBill.total.intValue();
	}
}
