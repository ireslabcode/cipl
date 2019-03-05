package com.cipl.demo.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cipl.demo.controller.DashBoardController;
import com.cipl.demo.dto.TrainFrequencyMstDto;
import com.cipl.demo.dto.TrainTypeMstDto;
import com.cipl.demo.entity.TrainFrequencyMst;
import com.cipl.demo.entity.TrainTypeMst;
import com.cipl.demo.entity.TransationMst;
import com.cipl.demo.model.DashboardResponse;
import com.cipl.demo.model.TractionMstDto;
import com.cipl.demo.model.UserResponse;
import com.cipl.demo.service.CommonService;
import com.cipl.demo.service.TractionMstService;
import com.cipl.demo.service.TrainFrequencyMstService;
import com.cipl.demo.service.TrainTypeMstService;
import com.fasterxml.jackson.databind.ObjectWriter;
/**
 * @author Santosh Mahto
 *
 */
@Service
public class CommonServiceImpl implements CommonService {

	private static final Logger log = LoggerFactory.getLogger(DashBoardController.class);

	@Autowired
	private ObjectWriter objectWriter;

	@Autowired
	private TrainTypeMstService trainTypeMstService;

	@Autowired
	private TractionMstService tractionMstService;
	
	
	@Autowired
	private TrainFrequencyMstService trainFrequencyMstService;

	@Override
	public DashboardResponse getDashboardData() {

		UserResponse allTrainTypeMst = trainTypeMstService.getAllTrainTypeMst();
		List<TrainTypeMstDto> trainTypeMstDtosList = new ArrayList<TrainTypeMstDto>();

		UserResponse allTractionMst = tractionMstService.getAllTractionMst();
		List<TractionMstDto> tractionMstDtoList = new ArrayList<TractionMstDto>();
		
		UserResponse allTrainFrequencyList = trainFrequencyMstService.getAllTrainFrequencyList();
		List<TrainFrequencyMstDto> trainFrequencyMstDtosList  = new ArrayList<TrainFrequencyMstDto>();
		
		DashboardResponse dashboardResponse = new DashboardResponse();
		if (allTrainTypeMst.getTrainTypeList() != null) {

			for (TrainTypeMst trainTypeMst : allTrainTypeMst.getTrainTypeList()) {
				TrainTypeMstDto typeMstDto = new TrainTypeMstDto();
				typeMstDto.setTrainTypeCd(trainTypeMst.getTrainTypeCd());
				typeMstDto.setTrainTypeDesc(trainTypeMst.getTrainTypeDesc());
				trainTypeMstDtosList.add(typeMstDto);
			}
		}

		if (allTractionMst.getTractionList() != null) {

			for (TransationMst tractionTypeMst : allTractionMst.getTractionList()) {
				TractionMstDto tractionMstDto = new TractionMstDto();
				tractionMstDto.setTractionType(tractionTypeMst.getTractionType());
				tractionMstDto.setTractionDesc(tractionTypeMst.getTractionDesc());
				tractionMstDtoList.add(tractionMstDto);
			}
		}
		
		
		
		if (allTrainFrequencyList.getTrainFrequencyList() != null) {

			for (TrainFrequencyMst tractionFrequency : allTrainFrequencyList.getTrainFrequencyList()) {
				TrainFrequencyMstDto trainFrequencyMstDto = new TrainFrequencyMstDto();
				trainFrequencyMstDto.setTrainFrequencyCd(tractionFrequency.getTrainFrequencyCd());
				trainFrequencyMstDto.setDescreption(tractionFrequency.getDescreption());
				trainFrequencyMstDtosList.add(trainFrequencyMstDto);
				
			}
		}

		dashboardResponse.setTrainTypeMstList(trainTypeMstDtosList);
		dashboardResponse.setTractionMstList(tractionMstDtoList);
		dashboardResponse.setTrainFrequencyMstDtosList(trainFrequencyMstDtosList);
		return dashboardResponse;
	}

}
