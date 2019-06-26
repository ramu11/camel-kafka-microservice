package com.marriott.poc.crm.processor;

import lombok.extern.slf4j.Slf4j;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

@Slf4j
public class ExceptionProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		Exception cause = exchange.getProperty(
				Exchange.EXCEPTION_CAUGHT, Exception.class);
		
		log.info("Logging error.......");
		log.error(cause.toString());
		
	}

}
