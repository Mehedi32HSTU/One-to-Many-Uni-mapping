package com.spring.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.rest.model.TeamLead;

@Repository
public interface TeamLeadRepository extends JpaRepository<TeamLead, Long> {
	

}
