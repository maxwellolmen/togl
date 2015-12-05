package com.maxwellolmen.togl;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Calendar;

public class SelectorActivity extends AppCompatActivity {

    Context ctx;
    SharedPreferences sharedPref;
    SharedPreferences.Editor editor;

    ArrayList<Integer> rqc = new ArrayList<Integer>();

    boolean ip = false;

    Button[] bs = new Button[20];
    int[] ls = new int[19];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selector);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ctx = SelectorActivity.this;
        sharedPref = PreferenceManager.getDefaultSharedPreferences(ctx);

        ls[0] = R.string.u2;
        ls[1] = R.string.u3;
        ls[2] = R.string.u4;
        ls[3] = R.string.u5;
        ls[4] = R.string.u6;
        ls[5] = R.string.u7;
        ls[6] = R.string.u8;
        ls[7] = R.string.u9;
        ls[8] = R.string.u10;
        ls[9] = R.string.u11;
        ls[10] = R.string.u12;
        ls[11] = R.string.u13;
        ls[12] = R.string.u14;
        ls[13] = R.string.u15;
        ls[14] = R.string.u16;
        ls[15] = R.string.u17;
        ls[16] = R.string.u18;
        ls[17] = R.string.u19;
        ls[18] = R.string.u20;

        initButtons();
    }

    private void toggleAnimation(int cellId, AnimationDrawable cellAnimation) {
        ImageView cell0 = (ImageView) findViewById(cellId);
        if (getWhich(cellId)) {
            cell0 = (ImageView) findViewById(cellId);
            cell0.setImageResource(R.drawable.cell_off);
            cellAnimation = (AnimationDrawable) cell0.getDrawable();
            cellAnimation.start();

            toggleWhich(cellId);
        } else if (!getWhich(cellId)) {
            cell0 = (ImageView) findViewById(cellId);
            cell0.setImageResource(R.drawable.cell_on);
            cellAnimation = (AnimationDrawable) cell0.getDrawable();
            cellAnimation.start();

            toggleWhich(cellId);
        }
    }

    @Override
    public void onBackPressed() {
        if (ip) {
            setContentView(R.layout.activity_selector);
            ip = false;

            initButtons();
        } else {
            super.onBackPressed();
        }
    }

    public void initButtons() {
        if (!ip) {
            bs[0] = (Button) findViewById(R.id.lvl1);
            bs[1] = (Button) findViewById(R.id.lvl2);
            bs[2] = (Button) findViewById(R.id.lvl3);
            bs[3] = (Button) findViewById(R.id.lvl4);
            bs[4] = (Button) findViewById(R.id.lvl5);
            bs[5] = (Button) findViewById(R.id.lvl6);
            bs[6] = (Button) findViewById(R.id.lvl7);
            bs[7] = (Button) findViewById(R.id.lvl8);
            bs[8] = (Button) findViewById(R.id.lvl9);
            bs[9] = (Button) findViewById(R.id.lvl10);
            bs[10] = (Button) findViewById(R.id.lvl11);
            bs[11] = (Button) findViewById(R.id.lvl12);
            bs[12] = (Button) findViewById(R.id.lvl13);
            bs[13] = (Button) findViewById(R.id.lvl14);
            bs[14] = (Button) findViewById(R.id.lvl15);
            bs[15] = (Button) findViewById(R.id.lvl16);
            bs[16] = (Button) findViewById(R.id.lvl17);
            bs[17] = (Button) findViewById(R.id.lvl18);
            bs[18] = (Button) findViewById(R.id.lvl19);
            bs[19] = (Button) findViewById(R.id.lvl20);

            for (int i = 0; i < ls.length; i++) {
                if (sharedPref.getInt(getString(ls[i]), 0) == 0) {
                    bs[i + 1].setText("");
                    bs[i + 1].setBackgroundResource(R.mipmap.lock);
   
            }

            bs[0].setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (!ip) {
                        setContentView(R.layout.activity1);
                        ip = true;
                        rqc.clear();
                        rqc.add(1);
                        rqc.add(2);
                        rqc.add(3);
                        rqc.add(4);

                        initCells();
                    } else {
                        if (rqc.contains(0 + 1)) {

                        }
       
                }
         });
        }
    }

    public void initCells() {
        ImageView cell1 = (ImageView) findViewById(R.id.cell1);
        ImageView cell2 = (ImageView) findViewById(R.id.cell1);
        ImageView cell3 = (ImageView) findViewById(R.id.cell1);
        ImageView cell4 = (ImageView) findViewById(R.id.cell1);
    }

    public boolean getWhich(int cellId) {
        switch (cellId) {
            default:
                return false;
        }
    }

    public void toggleWhich(int cellId) {
        switch (cellId) {

        }
    }
}
