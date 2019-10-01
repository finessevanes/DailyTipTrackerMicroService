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
	public Integer savingsRate;
	public Integer tipAmount;
	public Integer amountSaved;
	
	public DailyTipOut() {}

	public DailyTipOut(Long id, String date, Integer savingsRate, Integer tipAmount, Integer amountSaved) {
		this.id = id;
		this.date = date;
		this.savingsRate = savingsRate;
		this.tipAmount = tipAmount;
		this.amountSaved = amountSaved;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Integer getSavingsRate() {
		return savingsRate;
	}

	public void setSavingsRate(Integer savingsRate) {
		this.savingsRate = savingsRate;
	}

	public Integer getTipAmount() {
		return tipAmount;
	}

	public void setTipAmount(Integer tipAmount) {
		this.tipAmount = tipAmount;
	}

	public Integer getAmountSaved() {
		return amountSaved;
	}

	public void setAmountSaved(Integer amountSaved) {
		this.amountSaved = amountSaved;
	}

	@Override
	public String toString() {
		return "DailyTipOut [date=" + date + ", savingsRate=" + savingsRate + ", tipAmount=" + tipAmount
				+ ", amountSaved=" + amountSaved + "]";
	}
	
	

	
}
