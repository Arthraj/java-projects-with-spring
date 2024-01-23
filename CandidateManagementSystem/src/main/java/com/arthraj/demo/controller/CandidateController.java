package com.arthraj.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arthraj.demo.entity.Candidate;
import com.arthraj.demo.service.CandidateService;

@RestController
@RequestMapping("/api/candidate")
public class CandidateController {
	private CandidateService candidateService;

	public CandidateController(CandidateService candidateService) {
		super();
		this.candidateService = candidateService;
	}
	
	@PostMapping
	public ResponseEntity<Candidate> addCandidate(@RequestBody Candidate cad){
		return new ResponseEntity<Candidate>(candidateService.addCandidate(cad),HttpStatus.OK );
	}
	
	@GetMapping
	public List<Candidate> getAllCandidate(){
		return candidateService.getAllCandidates();
	}
	
	@GetMapping("{id}")
	public Candidate getCandidate(@PathVariable Long id){
		return candidateService.getCandidate(id);
	}
	
	@PutMapping("{id}")
	public Candidate updateCandidate(@RequestBody Candidate cad, @PathVariable Long id) {
		return candidateService.updateCandidate(cad, id);
	}
	
	@DeleteMapping
	public void deleteCandidate(@PathVariable Long id) {
		candidateService.deleteCandidate(id);
	}
}
