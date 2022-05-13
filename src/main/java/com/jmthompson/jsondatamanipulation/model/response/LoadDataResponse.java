package com.jmthompson.jsondatamanipulation.model.response;

import com.jmthompson.jsondatamanipulation.model.Data;

import java.util.List;

public class LoadDataResponse {

    private List<Data> dataList;

    public LoadDataResponse() {
    }

    public LoadDataResponse(List<Data> dataList) {
        this.dataList = dataList;
    }

    private LoadDataResponse(Builder builder) {
        this.dataList = builder.dataList;
    }

    public List<Data> getDataList() {
        return dataList;
    }

    public void setDataList(List<Data> dataList) {
        this.dataList = dataList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private List<Data> dataList;

        private Builder() {}

        public Builder withDataList(List<Data> dataList) {
            this.dataList = dataList;
            return this;
        }

        public LoadDataResponse build() {
            return new LoadDataResponse(this);
        }
    }
}
