package com.arthraj.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.arthraj.demo.entity.Candidate;

public interface CandidateRespository2 extends MongoRepository<Candidate,Long>{

}
