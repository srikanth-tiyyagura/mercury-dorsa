package com.honeybadger.mercury.enums;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public enum ElectionStatus {
	
	ACTIVE(1, "active"), 
	PENDING(2, "pending"), 
	INACTIVE(3, "inactive");
	
	private Integer code; 
	private String value; 
	private static final Map<Integer, ElectionStatus> LOOKUP = new HashMap<>();
	
	ElectionStatus(Integer code, String value) {
		this.code = code; 
		this.value = value; 
	}
	
	public Integer getCode() {
		return code;
	}
	
	public String getValue() {
		return value;
	}
	
	public static ElectionStatus fromCode(Integer code) {
		return LOOKUP.get(code);
	}
	
	static {
		for(ElectionStatus status : values()) {
			LOOKUP.put(status.getCode(), status);
		}
		Collections.unmodifiableMap(LOOKUP);
	}

}
