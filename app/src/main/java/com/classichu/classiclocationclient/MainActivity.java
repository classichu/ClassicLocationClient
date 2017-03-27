package com.classichu.classiclocationclient;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.baidu.location.BDLocation;
import com.classichu.locationclient.ClassicLocationClientHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ClassicLocationClientHelper.initLocationClient(this);
        ClassicLocationClientHelper.startLocation(new ClassicLocationClientHelper.OnLocationCallBack() {
            @Override
            public void onLocation(BDLocation bdLocation) {
                Log.d("QQQ", "onLocation: "+bdLocation.getAddrStr());
            }
        });
        //ClassicLocationClientHelper.stopLocation();
    }
}
