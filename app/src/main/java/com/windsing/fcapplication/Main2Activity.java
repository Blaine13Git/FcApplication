package com.windsing.fcapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editText = (EditText) findViewById(R.id.editText);

        if(getIntent() != null && getIntent().hasExtra(Intent.EXTRA_TEXT)){
            editText.setText(getIntent().getStringExtra(Intent.EXTRA_TEXT));
        }
    }
}
