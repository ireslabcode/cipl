package com.cipl.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cipl.demo.entity.TrainFrequencyMst;
import com.cipl.demo.model.UserResponse;
import com.cipl.demo.repository.TrainFrequencyMstRepository;
import com.cipl.demo.service.TrainFrequencyMstService;
/**
 * @author Santosh Mahto
 *
 */
@Service
public class TarinFrequencyMstServiceImpl implements TrainFrequencyMstService{
	
	@Autowired
	private TrainFrequencyMstRepository frequencyMstRepository;
	
	@Override
	public UserResponse getAllTrainFrequencyList() {
		List<TrainFrequencyMst> trainFrequencyList = (List<TrainFrequencyMst>) frequencyMstRepository.findAll();
		UserResponse response = new UserResponse();
		response.setTrainFrequencyList(trainFrequencyList);
		return response;
	}

}
