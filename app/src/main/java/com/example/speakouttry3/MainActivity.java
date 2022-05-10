package com.example.speakouttry3;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton sus_button_test;
    ImageButton apple;
    ImageButton toilet;
    ImageButton orange;
    ImageButton letter_I;
    ImageButton want_button;
    MediaPlayer mediaPlayerSus;
    MediaPlayer mediaPlayerApple;
    MediaPlayer mediaPlayerToilet;
    MediaPlayer mediaPlayerOrange;
    MediaPlayer mediaPlayerLetter_I;
    MediaPlayer mediaPlayerWant_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sus_button_test = findViewById(R.id.sus_button_test);
        mediaPlayerSus = MediaPlayer.create(MainActivity.this, R.raw.emergency_meeting_sound_effect);
        apple = findViewById(R.id.apple);
        mediaPlayerApple = MediaPlayer.create(MainActivity.this, R.raw.apple_sound_effect);
        toilet = findViewById(R.id.toilet);
        mediaPlayerToilet = MediaPlayer.create(MainActivity.this, R.raw.toilet_sound_effect);
        orange = findViewById(R.id.orange);
        mediaPlayerOrange = MediaPlayer.create(MainActivity.this, R.raw.orange_sound_effect);
        letter_I = findViewById(R.id.letter_I);
        mediaPlayerLetter_I = MediaPlayer.create(MainActivity.this, R.raw.letter_i_sound_effect);
        want_button = findViewById(R.id.want_button);
        mediaPlayerWant_Button = MediaPlayer.create(MainActivity.this, R.raw.want_sound_effect);

        sus_button_test.setOnClickListener(view -> mediaPlayerSus.start());

        apple.setOnClickListener(view -> mediaPlayerApple.start());

        toilet.setOnClickListener(view -> mediaPlayerToilet.start());

        orange.setOnClickListener(view -> mediaPlayerOrange.start());

        letter_I.setOnClickListener(view -> mediaPlayerLetter_I.start());

        want_button.setOnClickListener(view -> mediaPlayerWant_Button.start());
    }
}