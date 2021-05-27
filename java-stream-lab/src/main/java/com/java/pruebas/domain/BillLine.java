package com.java.pruebas.domain;

public class BillLine {

	private Integer id;
	private Integer billId;
	private String articleId;
	private String description;
	private Double pvp;

	public BillLine(Integer id, Integer billId, String articleId, String description, Double pvp) {
		this.id = id;
		this.billId = billId;
		this.articleId = articleId;
		this.description = description;
		this.pvp = pvp;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getBillId() {
		return billId;
	}

	public void setBillId(Integer billId) {
		this.billId = billId;
	}

	public String getArticleId() {
		return articleId;
	}

	public void setArticleId(String articleId) {
		this.articleId = articleId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPvp() {
		return pvp;
	}

	public void setPvp(Double pvp) {
		this.pvp = pvp;
	}
}
