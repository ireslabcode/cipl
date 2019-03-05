package com.cipl.demo.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.cipl.demo.entity.TrainFrequencyMst;
/**
 * @author Santosh Mahto
 *
 */
public interface TrainFrequencyMstRepository extends PagingAndSortingRepository<TrainFrequencyMst, Long>{
//public List<TrainFrequencyMst> findAll();
}
