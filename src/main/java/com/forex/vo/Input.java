package com.forex.vo;

public class Input {
	
	/**
	 * represents the from currency value
	 */
	private String fromCurrency;
	
	/**
	 * represents the to currency value
	 */
	private String toCurrency;
	
	/**
	 * represents the conversion amount
	 */
	private Double fromCurrencyAmount;

	
	public Input(String fromCurrency, String toCurrency, Double fromCurrencyAmount) {
		super();
		this.fromCurrency = fromCurrency;
		this.toCurrency = toCurrency;
		this.fromCurrencyAmount = fromCurrencyAmount;
	}

	@Override
	public String toString() {
		return "Input [fromCurrency=" + fromCurrency + ", toCurrency=" + toCurrency + ", fromCurrencyAmount="
				+ fromCurrencyAmount + "]";
	}

	public String getFromCurrency() {
		return fromCurrency;
	}

	public void setFromCurrency(String fromCurrency) {
		this.fromCurrency = fromCurrency;
	}

	public String getToCurrency() {
		return toCurrency;
	}

	public void setToCurrency(String toCurrency) {
		this.toCurrency = toCurrency;
	}

	public Double getFromCurrencyAmount() {
		return fromCurrencyAmount;
	}

	public void setFromCurrencyAmount(Double fromCurrencyAmount) {
		this.fromCurrencyAmount = fromCurrencyAmount;
	}



}
