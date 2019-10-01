package com.tts.tips.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DailyTipOut {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	public Long id;
	public String date;
	public Float savingsRate;
	public Integer tipAmount;
	public Integer amountSaved;
	
	public DailyTipOut() {}

	public DailyTipOut(String date, Float savingsRate, Integer tipAmount) {
		this.date = date;
		this.savingsRate = savingsRate;
		this.tipAmount = tipAmount;
		this.amountSaved = new Integer ((int)Math.ceil(tipAmount*savingsRate));
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Float getSavingsRate() {
		return savingsRate;
	}

	public void setSavingsRate(Float savingsRate) {
		this.savingsRate = savingsRate;
	}

	public Integer getTipAmount() {
		return tipAmount;
	}

	public void setTipAmount(Integer tipAmount) {
		this.tipAmount = tipAmount;
	}

	
	public Integer getAmountSaved() {
		return new Integer ((int)Math.ceil(tipAmount*savingsRate));
	}
	
//	public Integer getAmountSaved() {
//		return amountSaved;
//	}

//	public void setAmountSaved(Integer amountSaved) {
//		this.amountSaved = amountSaved;
//	}
	
//	public void calcAmountSaved() {
//		this.amountSaved = this.savingsRate*tipAmount;
//	}

	@Override
	public String toString() {
		return "DailyTipOut [date=" + date + ", savingsRate=" + savingsRate + ", tipAmount=" + tipAmount
				+ ", amountSaved=" + amountSaved + "]";
	}	
}
