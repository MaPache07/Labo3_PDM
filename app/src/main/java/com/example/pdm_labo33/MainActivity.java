package com.example.pdm_labo33;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.pdm_labo33.utils.AppConstants;

public class MainActivity extends AppCompatActivity {

    Button boton, boton2;
    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = findViewById(R.id.button);
        boton2 = findViewById(R.id.button2);
        texto = findViewById(R.id.chopper);

        boton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String t = texto.getText().toString();
                Intent mIntent = new Intent(MainActivity.this, Main2Activity.class);
                mIntent.putExtra(AppConstants.TEXT_KEY, t);
                startActivity(mIntent);
            }
        });

        boton2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String t = texto.getText().toString();
                Intent mIntent = new Intent();
                mIntent.setAction(Intent.ACTION_SEND);
                mIntent.setType("text/plain");
                mIntent.putExtra(Intent.EXTRA_TEXT, "t");
                startActivity(mIntent);
            }
        });
    }
}
