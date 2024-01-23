package com.arthraj.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthraj.demo.entity.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate,Long>{

}
