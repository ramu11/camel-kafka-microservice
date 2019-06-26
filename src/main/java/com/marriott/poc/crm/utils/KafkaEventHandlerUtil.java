package com.marriott.poc.crm.utils;

//import com.marriott.poc.crm.kafka.model.S_DOC_QUOTE_IN;
//import com.marriott.poc.crm.kafka.model.S_DOC_QUOTE_TNTXM_IN;

import java.io.ByteArrayOutputStream;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.BinaryDecoder;
import org.apache.avro.io.DecoderFactory;

import com.marriott.poc.crm.kafka.model.S_DOC_QUOTE_IN;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public  class KafkaEventHandlerUtil {
   
	/*
	 * right now just for printing purposes
	 */
	public void printRawKafkaMessage(String body) {
		log.info("ENTER KafkaEventHandler : printRawKafkaMessage method ");		
		System.out.println();
		
		System.out.println("printRawKafkaMessage result >>>>> " + body.toString());
		System.out.println();
		System.out.println();
		System.out.println();
		log.info("EXIT KafkaEventHandler : printRawKafkaMessage method ");

    }
	   

	
//	public void printS_QUOTE_TNTXM_OUT(S_DOC_QUOTE_TNTXM_OUT data){
//		log.info("ENTER KafkaEventHandler : printSDocQuoteTNTXMOut method ");
//		log.info("-----------------printSDocQuoteOut JSON Values-----------------");
//		System.out.println("S_DOC_QUOTE_TNTXM_OUT result >>>>> " + data.toString());
//		log.info("-----------------printSDocQuoteTNTXMOut JSON Values-----------------");
//		log.info("EXIT KafkaEventHandler : printSDocQuoteTNTXMOut method ");
//		
//	}
//	public void printSDocQuoteOut(S_DOC_QUOTE_OUT data){
//		log.info("ENTER KafkaEventHandler : printSDocQuoteOut method ");
//		log.info("-----------------printSDocQuoteOut JSON Values-----------------");
//		System.out.println("printSDocQuoteOut result >>>>> " + data.toString());
//		log.info("-----------------printSDocQuoteOut JSON Values-----------------");
//		log.info("EXIT KafkaEventHandler : printSDocQuoteOut method ");
//		
//	}
	public void printJsonValues(S_DOC_QUOTE_IN data) {
		log.info("ENTER KafkaEventHandler : printJsonValues method ");
		log.info("-----------------printJsonValues JSON Values-----------------");
		
		log.info("ROW_ID:" + data.getROW_ID());
		log.info("CREATED:" + data.getCREATED());
		
		
		//log.info("DB_LAST_UPD_SRC:" + data.getDB_LAST_UPD_SRC().getString());
		
		log.info("-------------------------------------------------------------");
		log.info("EXIT KafkaEventHandler : printJsonValues method ");

    }

}
