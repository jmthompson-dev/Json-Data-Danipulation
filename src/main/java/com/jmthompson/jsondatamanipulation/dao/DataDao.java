package com.jmthompson.jsondatamanipulation.dao;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.jmthompson.jsondatamanipulation.model.Data;

import javax.inject.Inject;

public class DataDao {

    private DynamoDBMapper mapper;

    public DataDao() {
    }

    @Inject
    public DataDao(DynamoDBMapper mapper) {
        this.mapper = mapper;
    }
    public void create(Data data) {
        try {
            mapper.save(data);
        } catch (UnsupportedOperationException e) {
            System.out.println("ERROR: Item not save to the database.");
        }
    }
}
