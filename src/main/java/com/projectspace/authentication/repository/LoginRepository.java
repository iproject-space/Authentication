package com.projectspace.authentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projectspace.authentication.entities.Credentials;

@Repository
public interface LoginRepository extends JpaRepository<Credentials, Integer>{
	
}
