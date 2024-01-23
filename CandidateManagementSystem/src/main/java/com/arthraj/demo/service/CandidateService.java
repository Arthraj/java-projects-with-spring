package com.arthraj.demo.service;

import java.util.List;

import com.arthraj.demo.entity.Candidate;

public interface CandidateService{
	
	Candidate addCandidate(Candidate candidate);
	Candidate getCandidate(Long id);
	List<Candidate> getAllCandidates();
	Candidate updateCandidate(Candidate candidate,Long id);
	void deleteCandidate(long id);
}
