package com.cipl.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.cipl.demo.entity.Parameter;
/**
 * @author Santosh Mahto
 *
 */
public interface ParameterRepository extends PagingAndSortingRepository<Parameter, Long> {
public 	Parameter findById(Integer parameterId);
}
