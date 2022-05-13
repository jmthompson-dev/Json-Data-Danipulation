package com.jmthompson.jsondatamanipulation.activity;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jmthompson.jsondatamanipulation.model.Data;
import com.jmthompson.jsondatamanipulation.model.request.LoadDataRequest;
import com.jmthompson.jsondatamanipulation.model.response.LoadDataResponse;

import javax.inject.Inject;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class LoadDataActivity {

    private ObjectMapper mapper;

    public LoadDataActivity() {
    }

    @Inject
    public LoadDataActivity(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    public LoadDataResponse execute(LoadDataRequest loadDataRequest) throws IOException {
        List<Data> dataList;
        try {
            dataList = mapper.readValue(new File(loadDataRequest.getPath()), new TypeReference<List<Data>>() {
            });
        } catch (Exception e) {
            throw new IOException(String.format("404 ERROR! Json file is not available.\n%s", e.getMessage()));
        }
        return LoadDataResponse.builder().withDataList(dataList).build();
    }
}
