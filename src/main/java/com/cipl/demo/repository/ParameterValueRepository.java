package com.cipl.demo.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.cipl.demo.entity.ParameterValue;
/**
 * @author Santosh Mahto
 *
 */
public interface ParameterValueRepository extends PagingAndSortingRepository<ParameterValue, Long>{
	public List<ParameterValue> findByLinkId(Integer linkId);
}
