package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.*;
import org.springframework.stereotype.Repository;

import com.example.entity.*;

@Repository
public interface IRegisterDao extends JpaRepository<Register, String> {
	Register findByLogin(Login login);
	Register findByLoginUserName(String userName);
	
	@Query("SELECT r FROM Register r ORDER BY r.fullName DESC LIMIT 6")
	List<Register> findLatestUsers();
}
