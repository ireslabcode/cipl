package com.cipl.demo.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.cipl.demo.entity.DivisionMst;
import com.cipl.demo.entity.ZoneMst;
/**
 * @author Santosh Mahto
 *
 */
public interface DivisionMstRepository extends PagingAndSortingRepository<DivisionMst, Long>{

	
	public DivisionMst findByDivisionCd(String dcd);
	
	public DivisionMst findById(Integer id);
	
	public List<DivisionMst> findByZoneMst(Integer zoneId);
	
	public List<DivisionMst> findByZoneMst(ZoneMst zoneMst);
	
	//public List<DivisionMst> findByDivisionCd(String div);
}
