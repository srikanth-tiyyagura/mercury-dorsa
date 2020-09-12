package com.honeybadger.mercury.jdbc;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.honeybadger.mercury.domain.Election;
import com.honeybadger.mercury.enums.ElectionStatus;

@Repository
public interface ElectionManager extends CrudRepository<Election, String> {	
	
	List<Election> findAllByMemberId(String memberId);
		
	//void saveStatus(String id, ElectionStatus status);
}
