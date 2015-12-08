package com.maxwellolmen.togl;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class GoodJobActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_good_job);

        final Bundle b = getIntent().getExtras();

        Button back = (Button) findViewById(R.id.back);
        Button replay = (Button) findViewById(R.id.replay);
        Button next = (Button) findViewById(R.id.next);

        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

        replay.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                switch (b.getInt("level")) {
                    case 1:
                        Intent intent = new Intent(GoodJobActivity.this, GameActivity1.class);
                        startActivity(intent);
                        finish();
                }
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                switch (b.getInt("level")) {
                    case 1:
                        Intent intent = new Intent(GoodJobActivity.this, GameActivity2.class);
                        startActivity(intent);
                        finish();
                }
            }
        });
    }
}
