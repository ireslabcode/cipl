package com.cipl.demo.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.cipl.demo.entity.DivisionMst;
import com.cipl.demo.entity.StationMst;
/**
 * @author Santosh Mahto
 *
 */
public interface StationMstRepository extends PagingAndSortingRepository<StationMst, Long> {
//public List<StationMst> findByDivisionMst(Integer divID);
//public List<StationMst> findByDivisionMst(DivisionMst divID);
	
	public List<StationMst> findByDivisionMstAndLobbyFlag(DivisionMst divisionMst, String flag);

}
