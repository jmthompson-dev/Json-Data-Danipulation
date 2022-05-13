package com.jmthompson.jsondatamanipulation;

import com.jmthompson.jsondatamanipulation.dagger.DaggerTransferAppComponent;
import com.jmthompson.jsondatamanipulation.dagger.TransferAppComponent;
import com.jmthompson.jsondatamanipulation.model.Data;
import com.jmthompson.jsondatamanipulation.model.request.LoadDataRequest;
import com.jmthompson.jsondatamanipulation.model.request.TransferDataRequest;
import com.jmthompson.jsondatamanipulation.model.response.LoadDataResponse;
import com.jmthompson.jsondatamanipulation.model.response.TransferDataResponse;

import java.io.IOException;

public class TransferApplication {

//    public static final TransferAppComponent component = null; // Comment this line out after the project builds
    public static final TransferAppComponent component = DaggerTransferAppComponent.create(); // Uncomment this after the building the project successfully
    public static void main(String[] args) throws IOException { // After building the project please uncomment lines 18 to 31
//        LoadDataRequest loadRequest = LoadDataRequest.builder().withPath("src/main/java/com/jmthompson/jsondatamanipulation/json/MOCK_DATA.json").build();
//        LoadDataResponse loadResponse = component.provideLoadDataActivity().execute(loadRequest);
//        TransferDataRequest dataRequest = TransferDataRequest.builder().withDataList(loadResponse.getDataList()).build();
//        TransferDataResponse dataResponse = component.provideTransferDataActivity().execute(dataRequest);
//
//        if (dataRequest.getDataList().isEmpty()) {
//            System.out.println("Successful transfer...");
//        } else {
//            System.out.printf("Unsuccessful transfer: %d item not transferred\n", dataResponse.getDataList().size());
//            System.out.println("Items include:");
//            for (Data currentData : dataResponse.getDataList()) {
//                System.out.println(currentData);
//            }
//        }
    }
}
