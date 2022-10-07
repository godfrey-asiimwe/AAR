/**
 * 
 */
package com.AAPI.AAR.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AAPI.AAR.Model.User;

/**
 * @author godfrey
 *
 */
public interface UserRepository extends JpaRepository<User, Integer> {

}
