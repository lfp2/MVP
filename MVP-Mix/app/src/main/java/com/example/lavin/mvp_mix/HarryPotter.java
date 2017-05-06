package com.example.lavin.mvp_mix;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class HarryPotter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harry_potter);

    }
    public void startSecondActivity(View view){
        Intent intent = new Intent(this,HarryPotter2.class);
        startActivity(intent);
    }
}
