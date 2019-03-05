package com.cipl.demo.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.cipl.demo.entity.LinkPlan;
/**
 * @author Santosh Mahto
 *
 */
public interface LinkPlanRepository extends PagingAndSortingRepository<LinkPlan, Long>{
	
	public List<LinkPlan> findByLinkId(Integer linkId);
}
