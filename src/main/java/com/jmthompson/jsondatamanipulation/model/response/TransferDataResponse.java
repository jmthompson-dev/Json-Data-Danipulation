package com.jmthompson.jsondatamanipulation.model.response;

import com.jmthompson.jsondatamanipulation.model.Data;

import java.util.List;

public class TransferDataResponse {

    private List<Data> dataList;

    public TransferDataResponse() {

    }

    public TransferDataResponse(List<Data> dataList) {
        this.dataList = dataList;
    }

    public TransferDataResponse(Builder builder) {
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

    public static class Builder {

        private List<Data> dataList;

        private Builder() {

        }

        public Builder withDataList(List<Data> dataList) {
            this.dataList = dataList;
            return this;
        }

        public TransferDataResponse build() {
            return new TransferDataResponse(this);
        }
    }
}
