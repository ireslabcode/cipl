package com.cipl.demo.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cipl.demo.entity.DivisionMst;
import com.cipl.demo.entity.StationMst;
import com.cipl.demo.entity.Train;
import com.cipl.demo.entity.User;
import com.cipl.demo.entity.ZoneMst;
import com.cipl.demo.model.DivLobyDto;
import com.cipl.demo.model.StationMstDto;
import com.cipl.demo.model.UserRequest;
import com.cipl.demo.model.UserResponse;
import com.cipl.demo.model.ZoneDivDto;
import com.cipl.demo.repository.DivisionMstRepository;
import com.cipl.demo.repository.StationMstRepository;
import com.cipl.demo.repository.TrainRepository;
import com.cipl.demo.repository.UserRepository;
import com.cipl.demo.repository.ZoneMstRepository;
import com.cipl.demo.service.CpilUserService;
import com.fasterxml.jackson.databind.ObjectWriter;
/**
 * @author Santosh Mahto
 *
 */
@Service
public class CpilUserServiceImpl implements CpilUserService{
	private static final Logger log = LoggerFactory.getLogger(CpilUserServiceImpl.class);
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private TrainRepository trainRepository;
	
	@Autowired
	private ZoneMstRepository zoneMstRepository;
	
	
	  @Autowired private DivisionMstRepository divisionMstRepository;
	 
	
	
	  @Autowired private StationMstRepository stationRepo;
	 
	
	@Autowired
	private ObjectWriter objectWriter;
	
	@Override
	public UserResponse validateUser(UserRequest userRequest) {
		UserResponse response = new UserResponse();
		User user = userRepository.findByUid(userRequest.getUserId());
		
		if(user == null) {
			response.setCode(1000);
			response.setMessage("user not found");
		}else {
			response.setCode(1001);
			response.setMessage("login success");
		}
		
		return response;
	}

	@Override
	public UserResponse getUserData(UserRequest userRequest) {
		UserResponse  userResponse = new UserResponse();
		try {
		log.info("user request.... " + objectWriter.writeValueAsString(userRequest));
		}catch (Exception e) {
		}
		List<Train> trainList = trainRepository.findByZoneAndDivAndTrainType(userRequest.getZone(), userRequest.getDiv(), userRequest.getTraintype());
		
		if(trainList.size()>0) {
			userResponse.setTrainList(trainList);
			userResponse.setCode(1001);
			userResponse.setMessage("SUCCESS");
		}else {
			userResponse.setTrainList(trainList);
			userResponse.setCode(1002);
			userResponse.setMessage("No Data with give request");
		}
		return userResponse;
	}

	@Override
	public UserResponse getStationListById(Integer divId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserResponse getStationListByDivCode(String divCode) {
		
		UserResponse  response = new UserResponse();
		//DivisionMst divisionMst = (DivisionMst) divisionMstRepository.findByDivisionCd(divCode);
		
		//List<StationMst> stationList = stationRepo.findByDivisionMst(divisionMst);
		//response.setStationList(stationList);
		
		return response;
	}

	@Override
	public UserResponse getZoneAssociatedDivision(String zoneCode) {
		UserResponse userResponse = new UserResponse();
		
		List<ZoneMst> findByZone = (List<ZoneMst>) zoneMstRepository.findAll();
		List<ZoneDivDto> zoneDivDtos = new ArrayList<ZoneDivDto>();
		System.out.println("sssssssssssssssssss :"+findByZone.size());
		for (ZoneMst zoneMst : findByZone) {
			ZoneDivDto divDto =new ZoneDivDto();
			divDto.setZone(zoneMst.getZoneCd());
			
			List<DivisionMst> findByZoneMst = divisionMstRepository.findByZoneMst(zoneMst);
		
			divDto.setDiviList(findByZoneMst);
			zoneDivDtos.add(divDto);
			userResponse.setZoneDivDtos(zoneDivDtos);
		}
		
		
		return userResponse;
	}

	@Override
	public UserResponse getAllDivisionList() {
		
		UserResponse response = new UserResponse();
		
		
		List<DivisionMst> divisionList = (List<DivisionMst>) divisionMstRepository.findAll();
		
		List<DivLobyDto>  divLobyDto = new ArrayList<DivLobyDto>();
		
		for (DivisionMst division : divisionList) {
			List<StationMst> findByDivisionMstAndLobbyFlag = stationRepo.findByDivisionMstAndLobbyFlag(division, "Y");
			DivLobyDto divLoby = new DivLobyDto();
			divLoby.setDivisionCode(division.getDivisionCd());
			
			List<StationMstDto> list = new  ArrayList<StationMstDto>();
			
			for (StationMst divLobyDto2 : findByDivisionMstAndLobbyFlag) {
				StationMstDto dto = new StationMstDto();
				dto.setStationCode(divLobyDto2.getStationCode());
				dto.setStationName(divLobyDto2.getStationName());
				dto.setLobbyStationId(""+divLobyDto2.getId());
				list.add(dto);
			}
			divLoby.setStationMstList(list);
			
			divLobyDto.add(divLoby);
		
		}
		System.out.println("SIZEEEEEEE :"+divLobyDto.size());
		//List<DivisionMst> divisionList = (List<DivisionMst>) divisionMstRepository.findby
		
		//response.setDivisionList(divisionList);
		response.setDivLobyDto(divLobyDto);
		
		/*
		 * try { log.info("division request.... " +
		 * objectWriter.writeValueAsString(divisionList)); }catch (Exception e) { }
		 */
		
		
		return response;
	}

	
	
	
	

}
