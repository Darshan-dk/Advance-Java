package com.darshan.currancyDTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="currency_table")
public class CurrencyDTO {
	public CurrencyDTO() {
		System.out.println(this.getClass().getSimpleName() + "created");
	}

	@Id
	@Column(name="currency_id")
	private int currencyId;
	@Column(name="currency_name")
	private String currencyName;
	@Column(name="currency_country")
	private String country;
	@Column(name="exchange_rate_wrt_us_dollar")
	private double exchangeRateWRTUSDollar;

	public int getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(int currencyId) {
		this.currencyId = currencyId;
	}

	public String getCurrencyName() {
		return currencyName;
	}

	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public double getExchangeRateWRTUSDollar() {
		return exchangeRateWRTUSDollar;
	}

	public void setExchangeRateWRTUSDollar(double exchangeRateWRTUSDollar) {
		this.exchangeRateWRTUSDollar = exchangeRateWRTUSDollar;
	}

}
