package com.jmthompson.jsondatamanipulation.activity;

import com.jmthompson.jsondatamanipulation.dagger.DaggerTransferAppComponent;
import com.jmthompson.jsondatamanipulation.dagger.TransferAppComponent;
import com.jmthompson.jsondatamanipulation.model.Data;
import com.jmthompson.jsondatamanipulation.model.request.LoadDataRequest;
import com.jmthompson.jsondatamanipulation.model.response.LoadDataResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoadDataActivityTest {

    private LoadDataActivity activity;
//    public static final TransferAppComponent component = null; // Comment this line out after the project builds
    public static final TransferAppComponent component = DaggerTransferAppComponent.create(); // Uncomment this after the building the project successfully

    @BeforeEach
    @Inject
    void setup() {
        activity = component.provideLoadDataActivity();
    }

    @Test
    void execute_withValidRequest_returnsValidResult() throws IOException {
        // Given
        String validPath = "src/main/java/com/jmthompson/jsondatamanipulation/json/MOCK_DATA.json";

        // When
        LoadDataRequest request = LoadDataRequest.builder().withPath(validPath).build();
        LoadDataResponse response = activity.execute(request);
        List<Data> result = response.getDataList();

        // Then
        assertEquals(Data.class, result.get(0).getClass(), "Expected result to be a Data.java object but was false");
        assertEquals(1000, result.size());
    }

    @Test
    void execute_withInvalidRequest_throwsException() throws IOException {
        // Given
        String invalidPath = "invalid";

        // When
        LoadDataRequest request = LoadDataRequest.builder().withPath(invalidPath).build();
        // Then
        Assertions.assertThrows(IOException.class, ()-> activity.execute(request), "Expected an exception to be thrown but was false");
    }

}
