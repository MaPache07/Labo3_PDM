package com.example.pdm_labo33;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.pdm_labo33.utils.AppConstants;

public class Main2Activity extends AppCompatActivity {

    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        texto = findViewById(R.id.tv_message);

        Intent mIntent = this.getIntent();

        if (mIntent != null){
            texto.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY));
        }
    }
}
