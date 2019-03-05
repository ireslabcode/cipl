package com.cipl.demo.service;

import com.cipl.demo.model.UserRequest;
import com.cipl.demo.model.UserResponse;
/**
 * @author Santosh Mahto
 *
 */
public interface CpilUserService {
	
	public UserResponse validateUser(UserRequest userRequest);
	public UserResponse getUserData(UserRequest userRequest);
	public UserResponse getStationListById(Integer divId);
	public UserResponse getStationListByDivCode(String divCode);
	public UserResponse getZoneAssociatedDivision(String zoneCode);
	public UserResponse getAllDivisionList();
	

}
