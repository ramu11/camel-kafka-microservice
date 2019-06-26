package com.marriott.poc.crm.route;

import lombok.extern.slf4j.Slf4j;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.apache.camel.model.dataformat.AvroDataFormat;
import org.apache.kafka.common.serialization.ByteArrayDeserializer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.stereotype.Component;

import com.marriott.poc.crm.kafka.avro.serializer.CustomKafkaAvroDeserializer;
import com.marriott.poc.crm.kafka.avro.serializer.KEYCustomKafkaAvroDeSerializer;
import com.marriott.poc.crm.kafka.avro.serializer.KEYCustomKafkaAvroSerializer;
import com.marriott.poc.crm.kafka.model.S_DOC_QUOTE_IN;
import com.marriott.poc.crm.processor.CamelProcessorS_DOC_QUOTE;
import com.marriott.poc.crm.processor.ExceptionProcessor;
import com.marriott.poc.crm.utils.KafkaEventHandlerUtil;

@Component
@Slf4j
public class MsgRouter_CamelRouteConfig extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		log.info("ENTER CamelRouteConfiguration : configure method ");

//		# Consumer properties
//		#Message router Translator	Message 	S_DOC_QUOTE
//		producer.topic.S_DOC_QUOTE=kafkarep.s_doc_quote.router.translator.s_doc_quote
//		#Message Translator	Message Enricher	S_DOC_QUOTE
//		consumer.topic.S_DOC_QUOTE=kafkarep.docquote.sourcedb.siebel.s_doc_quote

		// JSON Data Format
				JacksonDataFormat jsonSDocQuote = new JacksonDataFormat(
						value.SOURCEDB.SIEBEL.S_DOC_QUOTE.class);
				

		// JSON Data Format
	   from("kafka:{{consumer.topic.S_DOC_QUOTE}}?brokers={{kafka.host}}:{{kafka.port}}"
                 + "&maxPollRecords={{consumer.maxPollRecords}}"
                 + "&consumersCount={{consumer.consumersCount}}"
                 + "&seekTo={{consumer.seekTo}}"
                 + "&groupId={{consumer.group}}"
                 + "&keyDeserializer="+ KEYCustomKafkaAvroDeSerializer.class.getName() 
               + "&valueDeserializer="+CustomKafkaAvroDeserializer.class.getName()
                 )
              // .doTry()
                .routeId("FromKafka-S_DOC_QUOTE")
                .bean(new KafkaEventHandlerUtil(),"printRawKafkaMessage")
                .process(new CamelProcessorS_DOC_QUOTE())
                .bean(new KafkaEventHandlerUtil(), "printJsonValues")
                .log("after processing")	
                .marshal(jsonSDocQuote)
				//.to("file:C:/Users/kyoga309/Documents/poc-crm/code-base/test_data/s_doc_quote_in.json")

				.log("After marshal OUT")	
                .to("kafka:{{producer.topic.S_DOC_QUOTE}}?brokers={{kafka.host}}:{{kafka.port}}"
                		)
                		
              // .doCatch(Exception.class).process(new ExceptionProcessor());
	     ; 
	     
	  
////	#Message router Translator	Message 	S_QUOTE_TNTX
////	producer.topic.S_QUOTE_TNTX=kafkarep.s_quote_tntx.router.translator.s_quote_tntx
//
////	#Message Translator	Message Enricher	S_QUOTE_TNTX
////	consumer.topic.S_QUOTE_TNTX=kafkarep.qtntx.sourcedb.siebel.s_quote_tntx
	   from("kafka:{{consumer.topic.S_QUOTE_TNTX}}?brokers={{kafka.host}}:{{kafka.port}}"
		        + "&maxPollRecords={{consumer.maxPollRecords}}"
		        + "&consumersCount={{consumer.consumersCount}}"
		        + "&seekTo={{consumer.seekTo}}"
		        + "&groupId={{consumer.group}}"
		        + "&keyDeserializer="+ KEYCustomKafkaAvroDeSerializer.class.getName() 
		        + "&valueDeserializer="+CustomKafkaAvroDeserializer.class.getName()
		        )
		      // .doTry()
		       .routeId("FromKafka-S_QUOTE_TNTX")
		       .bean(new KafkaEventHandlerUtil(),"printRawKafkaMessage")
		       .to("kafka:{{producer.topic.S_QUOTE_TNTX}}?brokers={{kafka.host}}:{{kafka.port}}");
		     //  .doCatch(Exception.class).process(new ExceptionProcessor());


////		#Message Translator	Message Enricher	S_QUOTE_TNTXM
////		consumer.topic.S_QUOTE_TNTXM=kafkarep.qtntxm.sourcedb.siebel.s_quote_tntxm	  
////		#Message router Translator	Message 	S_QUOTE_TNTXM
////		producer.topic.S_QUOTE_TNTXM=kafkarep.s_quote_tntxm.router.translator.s_quote_tntxm
//
//     
  
	  from("kafka:{{consumer.topic.S_QUOTE_TNTXM}}?brokers={{kafka.host}}:{{kafka.port}}"
	          + "&maxPollRecords={{consumer.maxPollRecords}}"
	          + "&consumersCount={{consumer.consumersCount}}"
	          + "&seekTo={{consumer.seekTo}}"
	          + "&groupId={{consumer.group}}"
	          + "&keyDeserializer="+ KEYCustomKafkaAvroDeSerializer.class.getName() 
	         + "&valueDeserializer="+CustomKafkaAvroDeserializer.class.getName()
	          )
	       // .doTry()
	         .routeId("FromKafka-S_QUOTE_TNTXM")
	         .bean(new KafkaEventHandlerUtil(),"printRawKafkaMessage")
	         .to("kafka:{{producer.topic.S_QUOTE_TNTXM}}?brokers={{kafka.host}}:{{kafka.port}}"
	          );
	        //.//doCatch(Exception.class).process(new ExceptionProcessor());
	  
  
	//  log.info("Processing done.....");
	//	log.info("EXIT CamelRouteConfiguration : configure method ");

	}
}
	     //producer.topic.S_DOC_QUOTE=kafkarep.s_doc_quote.translator.enricher.s_doc_quote

//			#Message router Translator	Message 	S_DOC_QUOTE_X
//			producer.topic.S_DOC_QUOTE_X=kafkarep.s_doc_quote_x.router.translator.s_doc_quote_x
	     
//			#Message Translator	Message Enricher	S_DOC_QUOTE_X
//			consumer.topic.S_DOC_QUOTE_X=kafkarep.dquotex.sourcedb.siebel.s_doc_quote_x
	     
//	     from("kafka:{{consumer.topic.S_DOC_QUOTE_X}}?brokers={{kafka.host}}:{{kafka.port}}"
//                 + "&maxPollRecords={{consumer.maxPollRecords}}"
//                 + "&consumersCount={{consumer.consumersCount}}"
//                 + "&seekTo={{consumer.seekTo}}"
//                 + "&groupId={{consumer.group}}"
//                 + "&keyDeserializer="+ StringDeserializer.class.getName() 
//                 + "&valueDeserializer="+CustomKafkaAvroDeserializer.class.getName()
//                 )
//                .doTry()
//                .routeId("FromKafka")
//                .bean(new KafkaEventHandlerUtil(),"printRawKafkaMessage")
//                .to("kafka:{{producer.topic.S_DOC_QUOTE_X}}?brokers={{kafka.host}}:{{kafka.port}}")
//                .doCatch(Exception.class).process(new ExceptionProcessor());
//

//
////			#Message router Translator	Message 	S_QUOTE_CMTX	
////			producer.topic.S_QUOTE_CMTX=kafkarep.s_quote_cmtx.router.translator.s_quote_cmtx
//
////			#Message Translator	Message Enricher	S_QUOTE_CMTX	
////			consumer.topic.S_QUOTE_CMTX=kafkarep.qcmtx.sourcedb.siebel.s_quote_cmtx
//	     
//	     from("kafka:{{consumer.topic.S_QUOTE_CMTX}}?brokers={{kafka.host}}:{{kafka.port}}"
//                 + "&maxPollRecords={{consumer.maxPollRecords}}"
//                 + "&consumersCount={{consumer.consumersCount}}"
//                 + "&seekTo={{consumer.seekTo}}"
//                 + "&groupId={{consumer.group}}"
//                 + "&keyDeserializer="+ StringDeserializer.class.getName() 
//                 + "&valueDeserializer="+CustomKafkaAvroDeserializer.class.getName()
//                 )
//                .doTry()
//                .routeId("FromKafka")
//                .bean(new KafkaEventHandlerUtil(),"printRawKafkaMessage")
//                .to("kafka:{{producer.topic.S_QUOTE_CMTX}}?brokers={{kafka.host}}:{{kafka.port}}")
//                .doCatch(Exception.class).process(new ExceptionProcessor());
//

                
		