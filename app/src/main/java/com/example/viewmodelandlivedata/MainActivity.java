package com.example.viewmodelandlivedata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText mEdt;
    Button mBtnGetText;
    TextView mTv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("BBB","onCreate");

        mBtnGetText = findViewById(R.id.button);
        mEdt = findViewById(R.id.edittext);
        mTv = findViewById(R.id.textView);
        mBtnGetText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = mEdt.getText().toString();
                if(text != null){
                    mTv.setText(text);
                }
            }
        });
    }
}