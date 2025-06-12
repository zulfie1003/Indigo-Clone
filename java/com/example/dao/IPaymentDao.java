package com.example.dao;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;

import java.util.*;
import org.springframework.stereotype.Repository;

import com.example.entity.*;

@Repository
public interface IPaymentDao extends JpaRepository<Payment, Long> {
	List<Payment> findByUser(Register user);

	@Query("SELECT p FROM Payment p ORDER BY p.id DESC LIMIT 6")
	List<Payment> findLatestPayments();
}