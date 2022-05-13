package com.jmthompson.jsondatamanipulation.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

@DynamoDBTable(tableName = "daily_sales")
public class Data {

    @JsonProperty("order_id")
    public String orderId;

    @DynamoDBHashKey(attributeName = "order_id")
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @JsonProperty("date_time")
    public String dateTime;

    @DynamoDBRangeKey(attributeName = "date_time")
    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    @JsonProperty("total")
    private String orderTotal;

    @DynamoDBAttribute(attributeName = "total")
    public String getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(String orderTotal) {
        this.orderTotal = orderTotal;
    }

    @JsonProperty("department")
    public String department;

    @DynamoDBAttribute(attributeName = "department")
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data = (Data) o;
        return getOrderId().equals(data.getOrderId()) && getDateTime().equals(data.getDateTime()) && getOrderTotal().equals(data.getOrderTotal()) && getDepartment().equals(data.getDepartment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOrderId(), getDateTime(), getOrderTotal(), getDepartment());
    }

    @Override
    public String toString() {
        return "Data{" +
                "orderId='" + orderId + '\'' +
                ", dateTime='" + dateTime + '\'' +
                ", orderTotal='" + orderTotal + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}