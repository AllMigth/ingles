package com.simulador.ingles;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class module1_hearAndWrite extends AppCompatActivity {
    private Button btnBirds;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module1_hear_and_write);
//        btnBirds = findViewById(R.id.btnBirds);
//        mp = MediaPlayer.create(this, R.raw.birds);
//        btnBirds.setOnClickListener (new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mp.start();
//            }
//        });    }
        //!AQUI SE DECLARAN LOS BOTONS
        //mButton = findViewById(R.id.button_send);
        //mButton.setOnClickListener(this);
    }
    /*
    *AQUI CON UN SWITCH SE EJECUTA EL SONIDO PARA CADA BOTON

    @Override
    public void onClick(View view)
    {
        switch (view.getId()) {
            case R.id.button_send:
                // Do something
        }
    }*/
}