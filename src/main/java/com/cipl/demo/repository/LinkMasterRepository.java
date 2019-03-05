package com.cipl.demo.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.cipl.demo.entity.LinkMaster;
/**
 * @author Santosh Mahto
 *
 */
public interface LinkMasterRepository extends PagingAndSortingRepository<LinkMaster, Long>{

	
public  List<LinkMaster> findAll();

public List<LinkMaster>  findByLobbyStationIdAndTractionTypeAndTrainTypeCodeAndTrainFrequency(Long lobbyStationId, Long tractionType, Long trainTypeCode, Long trainFrequency);
	
	
}
