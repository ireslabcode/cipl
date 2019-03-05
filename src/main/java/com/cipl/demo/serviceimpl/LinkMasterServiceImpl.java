package com.cipl.demo.serviceimpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cipl.demo.entity.LinkMaster;
import com.cipl.demo.model.LinkMasterRequest;
import com.cipl.demo.model.LinkMasterResponse;
import com.cipl.demo.repository.LinkMasterRepository;
import com.cipl.demo.service.LinkMasterService;
import com.fasterxml.jackson.databind.ObjectWriter;
/**
 * @author Santosh Mahto
 *
 */
@Service
public class LinkMasterServiceImpl implements LinkMasterService {

	private static final Logger log = LoggerFactory.getLogger(LinkMasterServiceImpl.class);

	@Autowired
	private ObjectWriter objectWriter;

	@Autowired
	private LinkMasterRepository linkMasterRepo;

	@Override
	public LinkMasterResponse searchLink(LinkMasterRequest linkMasterRequest) {
		// TODO write a logic to get all link master.

		// linkMasterRepo.findByLobbyStationIdAndTractionTypeAndTrainTypeCodeAndTrainFrequency(lobbyStationId,
		// tractionType, trainTypeCode, trainFrequency)
		
		LinkMasterResponse linkMasterResponse = new LinkMasterResponse();
		
		
		
		List<LinkMaster> linkMasterList = linkMasterRepo
				.findByLobbyStationIdAndTractionTypeAndTrainTypeCodeAndTrainFrequency(
						Long.parseLong(""+ linkMasterRequest.getLobbyStationId()),
						Long.parseLong(""+ linkMasterRequest.getTractionType()),
						Long.parseLong(""+ linkMasterRequest.getTrainTypeCode()),
						Long.parseLong(""+ linkMasterRequest.getTrainFrequency()));
		
		linkMasterResponse.setLinkMasterList(linkMasterList);

		return linkMasterResponse;
	}

}
