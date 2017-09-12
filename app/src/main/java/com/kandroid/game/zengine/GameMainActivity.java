package com.kandroid.game.zengine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class GameMainActivity extends AppCompatActivity {
    private int greeting = "Hello Android";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_main);
    }
}
