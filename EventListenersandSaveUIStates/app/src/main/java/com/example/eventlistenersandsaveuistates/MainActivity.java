package com.example.eventlistenersandsaveuistates;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText mEtBlank;
    private TextView mTvHello;
    private Button mBtnButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnButton=findViewById(R.id.btnButton);
        mEtBlank=(EditText) findViewById(R.id.etBlank);
        mTvHello=findViewById(R.id.tvHello);
        mBtnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTvHello.setText("Button clicked");
                String msg=mEtBlank.getText().toString();
                if (msg.length() >= 6) {
                    Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG).show();
                }
            }

        });

    }
}
