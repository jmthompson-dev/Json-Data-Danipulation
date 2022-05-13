package com.jmthompson.jsondatamanipulation.dagger;

import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jmthompson.jsondatamanipulation.dao.DataDao;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class DaoModule {
    @Provides
    public ObjectMapper provideObjectMapper() {
        return new ObjectMapper();
    }

    @Provides
    public DataDao provideDataDao(DynamoDBMapper mapper) {
        return new DataDao(mapper);
    }

    @Singleton
    @Provides
    public DynamoDBMapper provideDynamoDBMapper() {
        return new DynamoDBMapper((AmazonDynamoDB)((AmazonDynamoDBClientBuilder)((AmazonDynamoDBClientBuilder)
                        AmazonDynamoDBClientBuilder.standard().withCredentials(DefaultAWSCredentialsProviderChain.getInstance()))
                        .withRegion(Regions.DEFAULT_REGION)).build());
    }
}
