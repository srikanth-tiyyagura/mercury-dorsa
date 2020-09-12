package com.honeybadger.mercury.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.google.common.base.Preconditions.checkNotNull;

import com.honeybadger.mercury.domain.Election;
import com.honeybadger.mercury.enums.ElectionStatus;

@Service
public class ElectionManagerServiceFacade {
	
	@Autowired private ElectionManager electionManager;
	
	public List<Election> getAllElections1(String memberId) {
		precondition(memberId);
		List<Election> elections = new ArrayList<>();
		electionManager.findById(memberId).ifPresent(elections::add);
		return elections;
	}
	
	public List<Election> getAllElections2(String memberId) {
		precondition(memberId);
		return electionManager.findAllByMemberId(memberId);
	}
	
	public Optional<Election> getElectionByStatus(String memberId, ElectionStatus status) {
		precondition(memberId);
		precondition(status.toString());
		return electionManager.findAllByMemberId(memberId)
				.stream()
				.filter(election -> status == election.getElectionStatus())
				.findAny();
	}
	
	public Election saveElection(Election election) {
		electionManager.save(election);
		return election;
	}
	
	/*
	public void updateElectionStatus(String id, ElectionStatus status) {
		precondition(id);
		//precondition(status);
		electionManager.saveStatus(id, status);
	}
	*/
	
	private void precondition(String stringName) {
		checkNotNull(stringName, stringName + " cannot be null.");
	}
	
}
