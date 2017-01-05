package com.yokoro.daggertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    DatabaseHelper databaseHelper;
    NetworkUtils networkUtils;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        databaseHelper = MyApplication.getComponent().getDatabaseHelper();
        networkUtils = MyApplication.getComponent().getNetworkUtils();
    }
}
