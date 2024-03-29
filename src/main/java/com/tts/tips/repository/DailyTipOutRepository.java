package com.tts.tips.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.tips.model.DailyTipOut;

@Repository
public interface DailyTipOutRepository extends CrudRepository<DailyTipOut, Long>{
	//1
	public ArrayList<DailyTipOut> findAll();
	//2
	public DailyTipOut findDailyTipOutById(Long id);
	//3
	// .save is included in Crud
	//4
	// .deleteById is included in Crud
	//5
	
	// deleteAll is also in crud
}
