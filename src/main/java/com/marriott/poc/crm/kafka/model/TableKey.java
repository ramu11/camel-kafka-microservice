package com.marriott.poc.crm.kafka.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.marriott.poc.crm.model.kafka.submodel.STRING_TYPE;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class TableKey {
	
	@JsonProperty
	private String ROW_ID;

}
