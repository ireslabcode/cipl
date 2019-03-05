package com.cipl.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.cipl.demo.entity.KpiMst;
/**
 * @author Santosh Mahto
 *
 */
public interface KpiMstRepository extends PagingAndSortingRepository<KpiMst, Integer> {
	public KpiMst findByKpiId(Integer kpiid);
}
