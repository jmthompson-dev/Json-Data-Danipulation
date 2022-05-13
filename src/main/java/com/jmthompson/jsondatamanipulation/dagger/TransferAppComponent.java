package com.jmthompson.jsondatamanipulation.dagger;

import com.jmthompson.jsondatamanipulation.activity.LoadDataActivity;
import com.jmthompson.jsondatamanipulation.activity.TransferDataActivity;

import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(modules = {DaoModule.class})
public interface TransferAppComponent {

    LoadDataActivity provideLoadDataActivity();

    TransferDataActivity provideTransferDataActivity();
}
