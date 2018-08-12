package com.asterisklab.myxylophone;

import android.content.res.Resources;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    // Declare and assign the variables to the button

        final Button firstbutton,secondbutton,thirdbutton,fourthbutton,fifthbutton,sixthbutton,seventhbutton;
        firstbutton = findViewById(R.id.Cnote);
        secondbutton = findViewById(R.id.Dnote);
        thirdbutton = findViewById(R.id.Enote);
        fourthbutton = findViewById(R.id.Fnote);
        fifthbutton = findViewById(R.id.Gnote);
        sixthbutton = findViewById(R.id.Anote);
        seventhbutton = findViewById(R.id.Bnote);

        // Create media player component for each note

        final MediaPlayer firstNote = MediaPlayer.create(this, R.raw.note1_c);
        final MediaPlayer secondNote = MediaPlayer.create(this, R.raw.note2_d);
        final MediaPlayer thirdNote = MediaPlayer.create(this, R.raw.note3_e);
        final MediaPlayer fourthNote = MediaPlayer.create(this, R.raw.note4_f);
        final MediaPlayer fifthNote = MediaPlayer.create(this, R.raw.note5_g);
        final MediaPlayer sixthNote = MediaPlayer.create(this, R.raw.note6_a);
        final MediaPlayer seventhNote = MediaPlayer.create(this, R.raw.note7_b);

        // play note when button is pressed

        firstbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstNote.start();
            }
        });

        secondbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                secondNote.start();
            }
        });

        thirdbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                thirdNote.start();
            }
        });

        fourthbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fourthNote.start();
            }
        });

        fifthbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fifthNote.start();
            }
        });

        sixthbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sixthNote.start();
            }
        });

        seventhbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                seventhNote.start();
            }
        });
    }
}
