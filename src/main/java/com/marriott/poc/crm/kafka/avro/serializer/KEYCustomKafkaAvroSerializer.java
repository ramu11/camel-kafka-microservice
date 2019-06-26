package com.marriott.poc.crm.kafka.avro.serializer;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import io.confluent.common.config.ConfigException;
import io.confluent.kafka.schemaregistry.client.CachedSchemaRegistryClient;
import io.confluent.kafka.serializers.AbstractKafkaAvroDeserializer;
import io.confluent.kafka.serializers.AbstractKafkaAvroSerializer;
import io.confluent.kafka.serializers.KafkaAvroDeserializerConfig;
import io.confluent.kafka.serializers.KafkaAvroSerializerConfig;

import org.apache.camel.component.properties.PropertiesComponent;
import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serializer;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Component;


//@Component
@Slf4j
public class KEYCustomKafkaAvroSerializer extends AbstractKafkaAvroSerializer
    implements Serializer<Object> {
    private boolean useSpecificAvroReader = true;
	private static final String SCHEMA_REGISTRY_URL = "http://lnxprd0742:8081/subjects/kafkarep.docquote.sourcedb.siebel.s_doc_quote-key/versions/3";

	@Override
	public void close() {
		// TODO Auto-generated method stubs
		
	}


	@Override
	public byte[] serialize(String arg0, Object arg1) {
		// TODO Auto-generated method stub
		System.out.println("****************serialize*******************************");

		System.out.println("Serialize method: topic " + arg0);
		System.out.println("Serialize method: byte " + arg1);
		byte [] b = (byte[]) arg1;
		String orig_key= new String(b);
		System.out.println("Serialize method: byte to string "  +orig_key );
		System.out.println("******************serialize*****************************");
		//row_IDSerialize(arg1);		
		return orig_key.getBytes();
	}
	
	private String row_IDSerialize(Object arg1){
		return arg1.toString();
	}

	

  @Override
  public void configure(KafkaAvroSerializerConfig config) {
		log.info("ENTER CustomKafkaAvroDeserializer  : configure method ");
		log.info("ENTER CustomKafkaAvroDeserializer  : SCHEMA_REGISTRY_URL " +SCHEMA_REGISTRY_URL);

    if (SCHEMA_REGISTRY_URL == null) {
      throw new org.apache.kafka.common.config.ConfigException("No schema registry provided");
    }
    try {

      final List<String> schemas = Collections.singletonList(SCHEMA_REGISTRY_URL);
      this.schemaRegistry = new CachedSchemaRegistryClient(schemas, Integer.MAX_VALUE);
      this.useSpecificAvroReader = true;

    } catch (ConfigException e) {
    	e.printStackTrace();
      throw new org.apache.kafka.common.config.ConfigException(e.getMessage());
    }
	log.info("EXIT CustomKafkaAvroDeserializer  : configure method ");

  }


@Override
public void configure(Map<String, ?> arg0, boolean arg1) {
	// TODO Auto-generated method stub
	configure(null);
	
}

}