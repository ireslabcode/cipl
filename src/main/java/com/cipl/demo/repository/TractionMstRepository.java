package com.cipl.demo.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.cipl.demo.entity.TransationMst;
/**
 * @author Santosh Mahto
 *
 */
public interface TractionMstRepository extends PagingAndSortingRepository<TransationMst, Long>{
	
	public List<TransationMst> findAll();

}
