package com.cipl.demo.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.cipl.demo.entity.ZoneMst;
/**
 * @author Santosh Mahto
 *
 */
public interface ZoneMstRepository extends PagingAndSortingRepository<ZoneMst, Long>{
	public List<ZoneMst> findByZone(String zone);
	public List<ZoneMst> findById(Integer id);
}
