package com.tts.tips.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tts.tips.model.DailyTipOut;
import com.tts.tips.repository.DailyTipOutRepository;

@Service
public class DailyTipOutServiceImpl implements DailyTipOutServiceInt{
	@Autowired
	DailyTipOutRepository dailyTipOutRepository;

	//1
	@Override
	public ArrayList<DailyTipOut> getAll() {
		return dailyTipOutRepository.findAll();
	}
	
	//2
	@Override
	public DailyTipOut getDailyTipOutUsingId(Long id) {
		return dailyTipOutRepository.findDailyTipOutById(id);
	}

	//3
	@Override
	public void saveDailyTipOut(DailyTipOut dailyTipOut) {
//		dailyTipOut.calcAmountSaved();
		dailyTipOutRepository.save(dailyTipOut);
	}

	//4
	@Override
	public void deleteDailyTipOutUsingId(Long id) {
		dailyTipOutRepository.deleteById(id);
	}

	@Override
	public void updateDailyTipOut(Long id, DailyTipOut dailyTipOutChanges) {
		DailyTipOut currentDailyTipOut = dailyTipOutRepository.findDailyTipOutById(id);

		String date = dailyTipOutChanges.getDate();
		Float savingsRate = dailyTipOutChanges.getSavingsRate();
		Integer tipAmount = dailyTipOutChanges.getTipAmount();
		Integer amountSaved = dailyTipOutChanges.getAmountSaved();
		
		currentDailyTipOut.setDate(date);
		currentDailyTipOut.setSavingsRate(savingsRate);
		currentDailyTipOut.setTipAmount(tipAmount);
		currentDailyTipOut.setAmountSaved(amountSaved);
		
		System.out.println(currentDailyTipOut);

		dailyTipOutRepository.save(currentDailyTipOut);	
	}
	
	@Override
	public void deleteAllDailyTipOuts() {
		dailyTipOutRepository.deleteAll();
	}
}

