package com.windsing.fcapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Intent intent;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void startBaidu(View view){
        intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.baidu.com"));
        startActivity(intent);
    }

    //带数据的intent
    public void startTheSecond(View view){
        editText = (EditText) findViewById(R.id.editText2);
        String text = editText.getText().toString();
        intent = new Intent(getApplicationContext(),Main2Activity.class);

//        intent.putExtra("name",text);
        intent.putExtra(Intent.EXTRA_TEXT,text);

        startActivity(intent);

    }
}
