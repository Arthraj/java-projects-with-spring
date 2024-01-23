package com.project.CMS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.CMS.entity.Candidate;
import com.project.CMS.repository.CandidateRepository;

@Service
public class CandidateServiceImpl {
	@Autowired
	public CandidateRepository candiRepo;
	public List<Candidate> getAllCandidate() {
        List<Candidate> productsList = candiRepo.findAll();
        if(productsList != null) {
            System.out.println(productsList);
            return productsList;
        }
        return null;
    }
	
}
