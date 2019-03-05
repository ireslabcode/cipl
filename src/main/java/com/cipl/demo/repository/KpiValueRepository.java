package com.cipl.demo.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.cipl.demo.entity.KpiValue;
/**
 * @author Santosh Mahto
 *
 */
public interface KpiValueRepository  extends PagingAndSortingRepository<KpiValue, Long>{

	public List<KpiValue> findByLinkId(Integer linkId);
	
}
