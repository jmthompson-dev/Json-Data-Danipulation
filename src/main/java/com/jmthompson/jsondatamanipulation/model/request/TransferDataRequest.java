package com.jmthompson.jsondatamanipulation.model.request;

import com.jmthompson.jsondatamanipulation.model.Data;

import java.util.List;

public class TransferDataRequest {

    private List<Data> dataList;

    public TransferDataRequest() {

    }

    public TransferDataRequest(List<Data> dataList) {
        this.dataList = dataList;
    }

    private TransferDataRequest(Builder builder) {
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

        public TransferDataRequest build() {
            return new TransferDataRequest(this);
        }
    }
}
