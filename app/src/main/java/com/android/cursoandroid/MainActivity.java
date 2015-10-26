package com.android.cursoandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    //@Bind(R.id.toolbar) Toolbar toolbar;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        //toolbar.setTitle("Primera Aplicación");
        // toolbar.setLogo(R.mipmap.ic_launcher);

        //setSupportActionBar(toolbar);

    }

    @OnClick(R.id.btn_guardar)
    public void nuevo(View view){
        Intent starter = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(starter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_msg:
                Toast.makeText(MainActivity.this, "Esto es un Toast", Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }



    public void finalizarActivity(View view){
        finish();

    }

}

