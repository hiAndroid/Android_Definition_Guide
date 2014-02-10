package com.taobao.wuzhong.transmitdata;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import com.taobao.wuzhong.R;

/**
 * Created by wuzhong on 14-2-10.
 */
public class StartActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.transmit_data);

    }

    public void onClick_startActivity(View view){

        Intent intent = new Intent(this,ReturnActivity.class);
        intent.putExtra("key","hello 1234");
        startActivityForResult(intent,1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        Log.e("requestCode",requestCode + "");
        Log.e("resultCode",resultCode + "");
        Log.e("data",data.getExtras().get("key").toString());

    }
}
