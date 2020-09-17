package com.cib.arise.usage;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import org.apache.kafka.connect.json.JsonSerializer;

import com.cib.arise.usage.beans.DataSets;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonProducer {

	public static void main(String[] args) throws InterruptedException {

		final KafkaProducer<String, JsonNode> producer = CreateProducer();
		//Create jackson object to convert json file to json object
		ObjectMapper objectMapper = new ObjectMapper();
		
		DataSets jsonObject = buildJsonFromFile(objectMapper);
		
		JsonNode value = objectMapper.valueToTree(jsonObject);

		ProducerRecord<String, JsonNode> record = new ProducerRecord<>("json_stream", "key",  value);

		producer.send(record);

		producer.close();

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * Create producer
	 * 
	 * @return
	 */
	private static KafkaProducer<String, JsonNode> CreateProducer() {
		Properties props = new Properties();
		props.put("bootstrap.servers", "sandbox-hdp.hortonworks.com:6667");
		props.put("key.serializer", StringSerializer.class.getName());
		props.put("value.serializer", JsonSerializer.class.getName());
		props.put("acks", "1");

		final KafkaProducer<String, JsonNode> producer = new KafkaProducer<String, JsonNode>(props);
		return producer;
	}

	/**
	 * Load json file and convert it to JSON Object
	 * 
	 * @param objectMapper
	 * @return
	 */
	private static DataSets buildJsonFromFile(ObjectMapper objectMapper) {
		File file = new File("json/dataSetsFile.json");
		DataSets dataSet = null;
		try {
			dataSet = objectMapper.readValue(file, DataSets.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return dataSet;
	}
}