package com.cipl.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.cipl.demo.entity.User;
/**
 * @author Santosh Mahto
 *
 */
@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

public	User findByUid(String uid);
//public	User findBy

}
