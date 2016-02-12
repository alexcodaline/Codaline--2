package com.example.alex.home_codaline2.activity;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.example.alex.home_codaline2.R;
import com.example.alex.home_codaline2.fragments.SecondFragment;

public class MainActivity extends FragmentActivity {
    private android.support.v4.app.FragmentManager manager;
    private android.support.v4.app.FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        manager = getSupportFragmentManager();
        initFragmentSecond();

    }

    private void initFragmentSecond() {
        transaction = manager.beginTransaction();
        transaction.add(R.id.container, new SecondFragment());
        transaction.commit();
    }

}


