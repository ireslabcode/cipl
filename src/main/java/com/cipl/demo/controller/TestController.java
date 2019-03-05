package com.cipl.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cipl.demo.model.UserResponse;
import com.cipl.demo.service.TractionMstService;
import com.cipl.demo.service.TrainFrequencyMstService;
import com.cipl.demo.service.TrainTypeMstService;
import com.cipl.demo.serviceimpl.CpilUserServiceImpl;
/**
 * @author Santosh Mahto
 *
 */

@RestController
public class TestController {
	
	@Autowired
	private TrainFrequencyMstService trainFrequencyMstService;
	
	@Autowired 
	private TrainTypeMstService trainTypeMstService;
	
	@Autowired
	private TractionMstService tractionService;
	
	@Autowired 
	private CpilUserServiceImpl cpilService;
	
	
	@GetMapping("/divList")
	public UserResponse  testMapping(HttpServletRequest request) {
		// check all division list
		//UserResponse allDivisionList = cpilService.getAllDivisionList();
		
		// chect all traction list
		//UserResponse allTractionMst = tractionService.getAllTractionMst();
		//System.out.println("traction list size :"+allTractionMst.getTractionList().size());
		
		// check train type mst
		//UserResponse allTrainTypeMst = trainTypeMstService.getAllTrainTypeMst();
		
		// check train frequency list
		UserResponse allTrainFrequencyList = trainFrequencyMstService.getAllTrainFrequencyList();
		
		return allTrainFrequencyList;
	}

}
