package com.cipl.demo.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.cipl.demo.entity.TrainTypeMst;
/**
 * @author Santosh Mahto
 *
 */
public interface TrainTypeMstRepository extends PagingAndSortingRepository<TrainTypeMst, Long>{
	public List<TrainTypeMst> findAll();
}
