package com.alibaba.com.helloworld;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by 0 on 2015/11/3.
 */
public class SecondActivity extends Activity {
	
	private TextView second;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
		second=(TextView)findViewById(R.id.second_activity);
    }
}
