package com.tvmas.backend.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
/*
 * Created by Luan on 6/18/2016
 * This class contain information of mongo db credentials
 * Now it is for DEV only.
 */
@Configuration
public class MongoDBConfig extends AbstractMongoConfiguration {

	@Override
	public String getDatabaseName() {
		return "tvmas";
	}

	@Override
	@Bean
	public Mongo mongo() throws Exception {
		return new MongoClient("127.0.0.1");
	}
}

