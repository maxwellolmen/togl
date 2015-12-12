package com.maxwellolmen.togl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class GameActivity4 extends GameActivity {
//LAYOUT: 3x3 square, cell#: tens = row, ones = column. (e.g. cell13 = 1st Row, 3rd column)
    public boolean[] on;

    @Override
    public boolean[] getOn() {
        return on;
    }

    @Override
    public void initLayout() {
        setContentView(R.layout.activity_game5);
    }

    @Override
    public void initBooleans() {
        on = new boolean[] {false, false, false, false, false, false, false, false, false};
    }

    @Override
    public ImageView[] initCells() {
        return new ImageView[]{(ImageView) findViewById(R.id.cell1),(ImageView) findViewById(R.id.cell2),(ImageView) findViewById(R.id.cell3),(ImageView) findViewById(R.id.cell11), (ImageView) findViewById(R.id.cell12), (ImageView) findViewById(R.id.cell13), (ImageView) findViewById(R.id.cell21), (ImageView) findViewById(R.id.cell22), (ImageView) findViewById(R.id.cell23)};
    }

    @Override
    public Integer[][] initListeners() {
        return new Integer[][]{{R.id.cell1, R.id.cell2, R.id.cell11}, {R.id.cell2, R.id.cell1, R.id.cell3, R.id.cell12}, {R.id.cell3, R.id.cell2, R.id.cell13}, {R.id.cell11, R.id.cell12, R.id.cell1, R.id.cell21}, {R.id.cell12, R.id.cell11, R.id.cell13, R.id.cell2, R.id.cell22}, {R.id.cell13, R.id.cell12, R.id.cell3, R.id.cell23}, {R.id.cell21, R.id.cell22, R.id.cell11}, {R.id.cell22, R.id.cell21, R.id.cell23, R.id.cell12}, {R.id.cell23, R.id.cell22, R.id.cell13}};
    }

    @Override
    public Intent getIntent() {
        return new Intent(GameActivity5.this, GoodJobActivity.class);
    }

    @Override
    public int getNextLevel() {
        return R.string.u6;
    }

    @Override
    public Bundle getBundle() {
        Bundle b = new Bundle();
        b.putInt("level", 5);

        return b;
    }
}

