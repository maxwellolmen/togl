package com.maxwellolmen.togl;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.app.Activity;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.maxwellolmen.togl.R;

import java.util.ArrayList;

public class GameActivity1 extends GameActivity {
    public boolean[] on;

    public void initBooleans() {
        on = new boolean[4];

        on[0] = false;
        on[1] = true;
        on[2] = false;
        on[3] = true;
    }

    @Override
    public ImageView[] initCells() {
        ImageView[] images = {(ImageView) findViewById(R.id.cell1),(ImageView) findViewById(R.id.cell2),(ImageView) findViewById(R.id.cell3),(ImageView) findViewById(R.id.cell4)};

        return images;
    }

    @Override
    public Integer[][] initListeners() {
        Integer[][] lists = {{R.id.cell1, R.id.cell2}, {R.id.cell1, R.id.cell2, R.id.cell3}, {R.id.cell2, R.id.cell3, R.id.cell4}, {R.id.cell3, R.id.cell4}};

        return lists;
    }

    @Override
    public boolean[] getOn() {
        return on;
    }

    @Override
    public void initLayout() {
        setContentView(R.layout.activity_game1);
    }

    public Intent getIntent() {
        return new Intent(GameActivity1.this, GoodJobActivity.class);
    }

    @Override
    public int getNextLevel() {
        return R.string.u2;
    }

    @Override
    public Bundle getBundle() {
        Bundle b = new Bundle();
        b.putInt("level", 1);

        return b;
    }
}
