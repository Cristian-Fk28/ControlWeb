package com.example.controlweb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText) findViewById(R.id.Etrespuesta);

    }

    public void navegar(View view) {
        Intent i=new Intent(this,MainActivity2.class);
        i.putExtra("SitioWeb",e1.getText().toString());
        startActivity(i);
    }
}