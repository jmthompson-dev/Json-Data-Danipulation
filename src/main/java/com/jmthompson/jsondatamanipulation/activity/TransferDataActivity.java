package com.jmthompson.jsondatamanipulation.activity;

import com.jmthompson.jsondatamanipulation.dao.DataDao;
import com.jmthompson.jsondatamanipulation.model.Data;
import com.jmthompson.jsondatamanipulation.model.request.TransferDataRequest;
import com.jmthompson.jsondatamanipulation.model.response.TransferDataResponse;

import javax.inject.Inject;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class TransferDataActivity {

    private DataDao dataDao;

    public TransferDataActivity() {
    }

    @Inject
    public TransferDataActivity(DataDao dataDao) {
        this.dataDao = dataDao;
    }

    public TransferDataResponse execute(TransferDataRequest request) {
        List<Data> notSaved = Collections.emptyList();
        ListIterator<Data> dataIterator = request.getDataList().listIterator();
        while (dataIterator.hasNext()) {
            Data currentData = dataIterator.next();
            try {
                dataDao.create(currentData);
            } catch (UnsupportedOperationException e) {
                System.out.println("Error: Item not saved to database!!!");
                notSaved.add(currentData);
            }
        }

        return TransferDataResponse.builder().withDataList(notSaved).build();
    }
}
