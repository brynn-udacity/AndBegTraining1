package com.example.android.andbegtraining1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by brynn on 11/6/15.
 */
public class NaturalSelection extends MainActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.natural_selection);
    }

    public void nextButtonClick(View view){
        Intent intent = new Intent(this, GeneFlow.class);
        startActivity(intent);
    }
}