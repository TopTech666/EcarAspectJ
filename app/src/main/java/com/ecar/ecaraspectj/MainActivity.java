package com.ecar.ecaraspectj;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.ecar.ecaraspectj.anotation.DebugLog;
import com.ecar.ecaraspectj.tests.TestMain;


public class MainActivity extends AppCompatActivity {

    @Override
    @DebugLog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity","start-------------------");
        TestMain.TestAll();
        Log.d("MainActivity","End-------------------");

    }
}
