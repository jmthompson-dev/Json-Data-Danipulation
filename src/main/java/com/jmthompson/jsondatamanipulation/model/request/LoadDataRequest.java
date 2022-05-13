package com.jmthompson.jsondatamanipulation.model.request;

public class LoadDataRequest {
    private String path;

    public LoadDataRequest() {
    }

    private LoadDataRequest(Builder builder) {
        this.path = builder.path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String path;

        public Builder() {
        }

        public Builder withPath(String path) {
            this.path = path;
            return this;
        }

        public LoadDataRequest build() {
            return new LoadDataRequest(this);
        }
    }

}
