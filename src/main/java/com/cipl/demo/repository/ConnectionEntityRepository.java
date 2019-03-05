package com.cipl.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.cipl.demo.entity.ConnectionEntity;
/**
 * @author Santosh Mahto
 *
 */
@Repository
public interface ConnectionEntityRepository extends PagingAndSortingRepository<ConnectionEntity, Long>{

}
