package com.nt.document;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("Player_Info")
public class Player {
	
	@Id
	private Integer pid;
	private String pName;
	private String pAddr;
	private List<String> nickName;
	private Set<Long> contactNumbers;
	private String[] friends;
	private Map<String, String> impKnocks;
	private Properties idDetails;
}
