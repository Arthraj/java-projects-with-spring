package com.project.CMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.CMS.entity.Candidate;
import com.project.CMS.repository.CandidateRepository;
import com.project.CMS.service.CandidateServiceImpl;

@RestController
@RequestMapping("/api/candidate")
public class CandidateController {
	
	@Autowired
	private CandidateServiceImpl candiService;
	
	@GetMapping("/getAll")
	public List<Candidate> getAllCandidates(){
		return candiService.getAllCandidate();
	}
}
