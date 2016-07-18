package com.utan.app.fastjsonrealm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.alibaba.fastjson.JSON;

/**
 * Created by quanke(http://quanke.name) on 2016/7/18.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user = new User();
        user.setAge(2);
        user.setName("http://quanke.name");

        String userStr = JSON.toJSONString(user);

        Log.d("userStr:",userStr);

        User userObj = JSON.parseObject(userStr,User.class);

        Log.d("userObj:",userObj+"");
    }
}
