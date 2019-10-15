package com.tts.tips.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tts.tips.model.DailyTipOut;
import com.tts.tips.service.DailyTipOutServiceImpl;

@RestController
public class MainController {
	@Autowired
	DailyTipOutServiceImpl dailyTipOutServiceImpl;
	
	
	@GetMapping("/")
	public String index() {
		return "<h1>Daily Tip Out Example</h1>";
	}
	
	//1
	@CrossOrigin//(origins = "http://localhost:3000")
	@GetMapping("/tips")
	public ArrayList<DailyTipOut> showAllTips() {
		return dailyTipOutServiceImpl.getAll();
	}
	//2
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/tip/{id}")
	public DailyTipOut getTipOut(@PathVariable Long id) {
		return dailyTipOutServiceImpl.getDailyTipOutUsingId(id);
	}	
	//3
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/tip")
	public void saveTip(@RequestBody DailyTipOut dailyTipOut) {
		dailyTipOutServiceImpl.saveDailyTipOut(dailyTipOut);
	}	
	//4
	@CrossOrigin(origins = "http://localhost:3000")
	@DeleteMapping("/tip/{id}")
	public void deleteDailyTipOut(@PathVariable Long id) {
		dailyTipOutServiceImpl.deleteDailyTipOutUsingId(id);
	}	
	
	// delete all dogs
	@CrossOrigin(origins = "http://localhost:3000")
	@DeleteMapping("/tips")
	public void deleteDailyTipOuts() {
		dailyTipOutServiceImpl.deleteAllDailyTipOuts();
	}
//	//5
	@CrossOrigin(origins = "http://localhost:3000")
	@PutMapping("tips/update{id}")
	public void updateDailyTipOut(@PathVariable Long id, @RequestBody DailyTipOut dailyTipOut) {
		dailyTipOutServiceImpl.updateDailyTipOut(id, dailyTipOut);
	}	
}
