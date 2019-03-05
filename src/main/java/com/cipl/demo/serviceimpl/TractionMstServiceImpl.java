package com.cipl.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cipl.demo.entity.TransationMst;
import com.cipl.demo.model.UserResponse;
import com.cipl.demo.repository.TractionMstRepository;
import com.cipl.demo.service.TractionMstService;

/**
 * @author Santosh Mahto
 *
 */
@Service
public class TractionMstServiceImpl implements TractionMstService{

	
	@Autowired 
	private TractionMstRepository mstRepository;
	
	
	@Override
	public UserResponse getAllTractionMst() {
		
		UserResponse userResponse = new UserResponse();
		
		List<TransationMst> tractionList = mstRepository.findAll();
		
		userResponse.setTractionList(tractionList);
		
		return userResponse;
	}

}
