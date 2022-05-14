package com.jmthompson.jsondatamanipulation.activity;

import com.jmthompson.jsondatamanipulation.dao.DataDao;
import com.jmthompson.jsondatamanipulation.model.Data;
import com.jmthompson.jsondatamanipulation.model.request.TransferDataRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class TransferDataActivityTest {

    @Mock
    private DataDao dataDao;

    @InjectMocks
    private TransferDataActivity activity;

    @BeforeEach
    void setup() {
        activity = new TransferDataActivity(dataDao);
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void execute_withValidRequest_returnsValidResult() {
        // Given
        Data testData = new Data(
                1382940,
                "1641014008",
                "$385.44",
                "Shoes");
        List<Data> dataList = List.of(testData);
        TransferDataRequest request = TransferDataRequest.builder().withDataList(dataList).build();

        // When
        List<Data> result = activity.execute(request).getDataList();

        // Given
        assertTrue(result.isEmpty());
        verify(dataDao, times(1)).create(any(Data.class));
    }

    @Test
    void execute_withInvalidRequest_returnsListOfObjects() {
        // Given
        Data testData = new Data(
                1382940,
                "1641014008",
                "$385.44",
                "Shoes");
        List<Data> dataList = List.of(testData);
        TransferDataRequest request = TransferDataRequest.builder().withDataList(dataList).build();

        // When
        doThrow(UnsupportedOperationException.class).when(dataDao).create(any(Data.class));
        List<Data> result = activity.execute(request).getDataList();

        // Given
        assertDoesNotThrow(()-> result.get(0), "ERROR: Expected list to contain one item but was false.");
        assertEquals(testData, result.get(0));
        verify(dataDao, times(1)).create(any(Data.class));
    }
}
