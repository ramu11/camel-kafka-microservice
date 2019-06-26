package com.marriott.poc.crm.kafka.avro.serializer;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import io.confluent.common.config.ConfigException;
import io.confluent.kafka.schemaregistry.client.CachedSchemaRegistryClient;
import io.confluent.kafka.serializers.AbstractKafkaAvroDeserializer;
import io.confluent.kafka.serializers.KafkaAvroDeserializerConfig;

import org.apache.camel.component.properties.PropertiesComponent;
import org.apache.kafka.common.serialization.Deserializer;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Component;

import com.marriott.poc.crm.kafka.model.TableKey;


//@Component
@Slf4j
public class KEYCustomKafkaAvroDeSerializer extends AbstractKafkaAvroDeserializer
    implements Deserializer<Object> {
    private static final String SCHEMA_REGISTRY_URL = "http://lnxprd0742:8081";

  @Override
  public void configure(KafkaAvroDeserializerConfig config) {
		log.info("ENTER KEYCustomKafkaAvroSerializer  : configure method ");
		log.info("ENTER KEYCustomKafkaAvroSerializer  : SCHEMA_REGISTRY_URL " +SCHEMA_REGISTRY_URL);

    if (SCHEMA_REGISTRY_URL == null) {
      throw new org.apache.kafka.common.config.ConfigException("No schema registry provided");
    }
    try {

      final List<String> schemas = Collections.singletonList(SCHEMA_REGISTRY_URL);
      this.schemaRegistry = new CachedSchemaRegistryClient(schemas, Integer.MAX_VALUE);
      this.useSpecificAvroReader = true;

    } catch (ConfigException e) {
    	e.printStackTrace();
     // throw new org.apache.kafka.common.config.ConfigException(e.getMessage());
    }
	log.info("EXIT KEYCustomKafkaAvroSerializer  : configure method ");

  }

  @Override
  public void configure(Map<String, ?> configs, boolean isKey) {
    configure(null);
  }

  @Override
  public Object deserialize(String s, byte[] bytes) {
		log.info("ENTER KEYCustomKafkaAvroSerializer  : deserialize method ");
		log.info("KEYCustomKafkaAvroSerializer  deserialize(bytes).toString() " + deserialize(bytes));
		
		TableKey key_obj = new TableKey (deserialize(bytes).toString());
		log.info("KEYCustomKafkaAvroSerializer key row_id " +key_obj.getROW_ID());
		return key_obj.getROW_ID();
  }
  
  @Override
  public void close() {
  }
}