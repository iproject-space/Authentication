package com.projectspace.authentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projectspace.authentication.entities.User;

@Repository
public interface CredentialsRepository extends JpaRepository<User, Integer>{

	User findByEmailAndPassword(String email,String password);
}
