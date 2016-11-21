package com.ecar.ecaraspectj.tests;


import com.ecar.ecaraspectj.anotation.DebugLog;

/**
 * Created by 835127729qq.com on 16/7/22.
 */
@DebugLog
public class TestClass {
    public TestClass(){
        spendTimeNms4(4);
    }

    public void spendTimeNms(int n){
        try {
            Thread.sleep(n);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected void spendTimeNms2(int n){
        try {
            Thread.sleep(n);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void spendTimeNms3(int n){
        try {
            Thread.sleep(n);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void spendTimeNms4(int n){
        try {
            Thread.sleep(n);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
