package com.cipl.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cipl.demo.entity.TrainTypeMst;
import com.cipl.demo.model.UserResponse;
import com.cipl.demo.repository.TrainTypeMstRepository;
import com.cipl.demo.service.TrainTypeMstService;
/**
 * @author Santosh Mahto
 *
 */

@Service
public class TrainTypeMstserviceImpl implements TrainTypeMstService{
	
	@Autowired
	private TrainTypeMstRepository trainTypeRepo;
	
	
	@Override
	public UserResponse getAllTrainTypeMst() {
		
		List<TrainTypeMst> trainTypeList = trainTypeRepo.findAll();
		UserResponse userResponse = new UserResponse();
		userResponse.setTrainTypeList(trainTypeList);
		return userResponse;
	}

}
