package com.project.CMS.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.CMS.entity.Candidate;

@Repository
public interface CandidateRepository extends MongoRepository<Candidate,Long>{

}
