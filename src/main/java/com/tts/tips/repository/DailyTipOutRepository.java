package com.tts.tips.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.tts.tips.model.DailyTipOut;

public interface DailyTipOutRepository extends CrudRepository<DailyTipOut, Long>{
	public ArrayList<DailyTipOut> findAll();
}
