package com.marriott.poc.crm.processor;

import lombok.extern.slf4j.Slf4j;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.component.kafka.KafkaConstants;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.marriott.poc.crm.kafka.model.*;
import com.marriott.poc.crm.utils.DataConversionUtils;

@Slf4j
public class CamelProcessorS_DOC_QUOTE implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		log.info("ENTER CamelProcessorSDOCQUOTE : process method ");

		String jsonInString = exchange.getIn().getBody(String.class);

		System.out.println("************************ CamelProcessorSDOCQUOTE : process method \n\n" +jsonInString );

		ObjectMapper mapper = new ObjectMapper();

//		S_DOC_QUOTE_IN sDOcQuoteIn = copyValuesToOdsPojoModel(sDocQuote_schema);
		S_DOC_QUOTE_IN sDOcQuoteIn = mapper.readValue(jsonInString, S_DOC_QUOTE_IN.class);

		exchange.getIn().setBody(sDOcQuoteIn);
       // exchange.getIn().setHeader(KafkaConstants.KEY, sDOcQuoteIn.getROW_ID());

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + exchange.getIn().getBody(S_DOC_QUOTE_IN.class));	
		

	log.info("EXIT CamelProcessorSDOCQUOTE : process method ");
	
}

}