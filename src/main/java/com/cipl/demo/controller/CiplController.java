package com.cipl.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cipl.demo.entity.ConnectionEntity;
import com.cipl.demo.entity.DivisionMst;
import com.cipl.demo.entity.ZoneMst;
import com.cipl.demo.model.DivisionMstDto;
import com.cipl.demo.model.UserRequest;
import com.cipl.demo.model.UserResponse;
import com.cipl.demo.repository.ConnectionEntityRepository;
import com.cipl.demo.repository.DivisionMstRepository;
import com.cipl.demo.repository.ZoneMstRepository;
import com.cipl.demo.service.CpilUserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectWriter;
/**
 * @author Santosh Mahto
 *
 */
@RestController
@CrossOrigin(origins = { "*" })

public class CiplController {

	private static final Logger log = LoggerFactory.getLogger(CiplController.class);

	@Autowired
	private ObjectWriter objectWriter;

	@Autowired
	private CpilUserService cpilUserService;
	
	@Autowired
	private ZoneMstRepository zoneMstRepository;
	
	@Autowired
	private DivisionMstRepository divisionMstRepository;
	
	@Autowired
	private ConnectionEntityRepository conRepo;
	
	
	
	@RequestMapping(value = "/div", method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UserResponse> getDivList() throws JsonProcessingException {

		// TODO: Request and response logging
		log.info("Login request received..:");

		// TODO: generate and save security code to database

		UserResponse userDataResponse = null;

		return new ResponseEntity<>(userDataResponse, HttpStatus.OK);

	}
	
	
	
	@RequestMapping(value = "/stationList", method = RequestMethod.POST, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UserResponse> stationList(@RequestBody UserRequest userRequest) throws JsonProcessingException {

		// TODO: Request and response logging
		log.info("station list request received..:");

		// TODO: generate and save security code to database

		//UserResponse userDataResponse = cpilUserService.getStationList(Integer.parseInt(userRequest.getDivisionId()));
		
		UserResponse userDataResponse = cpilUserService.getStationListByDivCode(userRequest.getDivisionCode());

		return new ResponseEntity<>(userDataResponse, HttpStatus.OK);

	}
	
	

	@RequestMapping(value = "/userData", method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UserResponse> getUserProfileData() throws JsonProcessingException {

		// TODO: Request and response logging
		log.info("Login request received..:");

		// TODO: generate and save security code to database

		UserResponse userDataResponse = null;

		return new ResponseEntity<>(userDataResponse, HttpStatus.OK);

	}

	@RequestMapping(value = "/getInfo", method = RequestMethod.POST)
	public ResponseEntity<UserResponse> createUserAccount(HttpServletRequest request,
			@RequestHeader(value = "zone", required = true) String zone,
			@RequestHeader(value = "div", required = true) String div,
			@RequestHeader(value = "traintype", required = true) String traintype, @RequestBody UserRequest userRequest)
			throws JsonProcessingException {
        System.out.println(zone +""+div +""+traintype );
		// TODO: Request and response logging
		log.info("User requested data " + objectWriter.writeValueAsString(userRequest));
		
		UserRequest userRequest2 = new UserRequest();
		userRequest2.setZone(zone);
		userRequest2.setDiv(div);
		userRequest2.setTraintype(traintype);
		
		UserResponse userResponse = cpilUserService.getUserData(userRequest2);

		return new ResponseEntity<>(userResponse, HttpStatus.OK);
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity<UserResponse> login(HttpServletRequest request, @RequestBody UserRequest userRequest)
			throws JsonProcessingException {

		// TODO: Request and response logging
		log.info("User login request received " + objectWriter.writeValueAsString(userRequest));

		UserResponse userResponse = cpilUserService.validateUser(userRequest);

		return new ResponseEntity<>(userResponse, HttpStatus.OK);
	}
	
		
	@GetMapping("/test")
	public String  test(HttpServletRequest request) {

	
		return "network testing...!!!";
	}
	
	
	@GetMapping("/testMapping")
	public String  testMapping(HttpServletRequest request) {
		List<ConnectionEntity> findAll = (List<ConnectionEntity>) conRepo.findAll();
	
		for (ConnectionEntity connectionEntityRepository : findAll) {
			System.out.println(connectionEntityRepository.getName());
			System.out.println(connectionEntityRepository.getStatus());
			System.out.println("--> "+connectionEntityRepository.getDate());
		}
		
		return "network testing...!!!";
	}
	
	

}
