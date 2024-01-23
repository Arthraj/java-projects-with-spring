package com.arthraj.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arthraj.demo.entity.Candidate;
import com.arthraj.demo.exception.CandidateNotFoundException;
import com.arthraj.demo.repository.CandidateRepository;
import com.arthraj.demo.repository.CandidateRespository2;
import com.arthraj.demo.service.CandidateService;

@Service
public class CandidateServiceImpl implements CandidateService{
	
	
	private CandidateRespository2 CandidateRespository2;
	
	
	public CandidateServiceImpl(CandidateRespository2 CandidateRespository2) {
		super();
		this.CandidateRespository2 = CandidateRespository2;
	}

	@Override
	public Candidate addCandidate(Candidate candidate) {

		return CandidateRespository2.save(candidate);
	}

	@Override
	public Candidate getCandidate(Long id) {

		Optional<Candidate> optionalCandi= CandidateRespository2.findById(id);
		if(optionalCandi.isPresent()) {
			return optionalCandi.get();
		}
		else throw new CandidateNotFoundException("Candidate","Id",id);
	}

	@Override
	public List<Candidate> getAllCandidates() {
		return CandidateRespository2.findAll();
	}

	@Override
	public Candidate updateCandidate(Candidate candidate,Long id) {
		Candidate updatedCandidate=CandidateRespository2.findById(id).orElseThrow(()->new CandidateNotFoundException("Candidate","Id",id)) ;
			updatedCandidate.setDob(candidate.getDob());
			updatedCandidate.setEmail(candidate.getEmail());
			updatedCandidate.setFirstName(candidate.getFirstName());
			updatedCandidate.setLastName(candidate.getLastName());
			updatedCandidate.setResumeUrl(candidate.getResumeUrl());
			CandidateRespository2.save(updatedCandidate);
			return updatedCandidate;
	}

	@Override
	public void deleteCandidate(long id) {
		Candidate candidate=CandidateRespository2.findById(id).orElseThrow(()->new CandidateNotFoundException("Candidate","Id",id)) ;
		CandidateRespository2.deleteById(id);
	}

}
