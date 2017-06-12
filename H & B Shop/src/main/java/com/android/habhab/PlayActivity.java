package com.android.habhab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.android.tonyvu.sc.demo.R;

public class PlayActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        btnPlay = (Button) findViewById(R.id.btnPlay);

        btnPlay.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnPlay) {
            Intent nextPage = new Intent(PlayActivity.this, MainActivity.class);
            startActivity(nextPage);
        } else {

        }
    }

}
