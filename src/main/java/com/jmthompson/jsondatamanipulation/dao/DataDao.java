package com.jmthompson.jsondatamanipulation.dao;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.jmthompson.jsondatamanipulation.model.Data;

import javax.inject.Inject;

public class DataDao {

    private DynamoDBMapper mapper;

    @Inject
    public DataDao(DynamoDBMapper mapper) {
        this.mapper = mapper;
    }
    public void create(Data data) {
        mapper.save(data);
    }
}
