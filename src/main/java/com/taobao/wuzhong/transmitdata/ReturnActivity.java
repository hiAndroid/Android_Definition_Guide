package com.taobao.wuzhong.transmitdata;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.taobao.wuzhong.R;

/**
 * Created by wuzhong on 14-2-10.
 */
public class ReturnActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.transmit_data);

    }

    public void onClick_returnActivity(View view){

        Intent intent = new Intent();
        intent.putExtra("key","hello 1234");
        setResult(2,intent);

        finish();

    }

}
