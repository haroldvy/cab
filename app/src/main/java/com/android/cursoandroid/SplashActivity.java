package com.android.cursoandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;


public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.informacion2);

        ButterKnife.bind(this);




       /*' int TIME = 3000;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashActivity.this, MainActivity.);
                startActivity(i);
                finish();
            }
        }, TIME);

        */
    }

    @OnClick(R.id.btn_nuevo)
    public void iniciarActivity (View view){
        Intent i = new Intent(SplashActivity.this, MainActivity.class);
        startActivity(i);
        finish();



    }
}
