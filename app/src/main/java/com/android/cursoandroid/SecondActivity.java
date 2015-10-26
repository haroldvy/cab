package com.android.cursoandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;


public class SecondActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.informacion);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_eliminar)
    public void eliminar (View view){

        Toast.makeText(SecondActivity.this, "ELIMINAR", Toast.LENGTH_SHORT).show();
    }
    @OnClick(R.id.btn_editar)
    public void editar (View view){

        Toast.makeText(SecondActivity.this, "EDITAR", Toast.LENGTH_SHORT).show();
    }

}