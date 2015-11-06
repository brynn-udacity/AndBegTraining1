package com.example.android.andbegtraining1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by brynn on 11/6/15.
 */
public class GeneFlow extends MainActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gene_flow);
    }

    public void nextButtonClick(View view){
        Intent intent = new Intent(this, GeneticDrift.class);
        startActivity(intent);
    }
}
