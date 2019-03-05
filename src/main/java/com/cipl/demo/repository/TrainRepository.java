package com.cipl.demo.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.cipl.demo.entity.Train;
/**
 * @author Santosh Mahto
 *
 */
@Repository
public interface TrainRepository extends PagingAndSortingRepository<Train, Long>{

	
	public List<Train> findByZoneAndDivAndTrainType(String zone, String div, String trainType);
	
}
