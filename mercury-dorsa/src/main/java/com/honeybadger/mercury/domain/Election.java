package com.honeybadger.mercury.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.honeybadger.mercury.enums.ElectionStatus;

@Entity
public class Election {
	
	@Id
	private String id; 
	private ElectionStatus electionStatus;
	private Date date;
	private Date effectiveDate; 
	private String memberId;
	
	@OneToMany
	private List<Dependent> dependents;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public ElectionStatus getElectionStatus() {
		return electionStatus;
	}
	public void setElectionStatus(ElectionStatus electionStatus) {
		this.electionStatus = electionStatus;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public List<Dependent> getDependents() {
		return dependents;
	}
	public void setDependents(List<Dependent> dependents) {
		this.dependents = dependents;
	} 
	
}
