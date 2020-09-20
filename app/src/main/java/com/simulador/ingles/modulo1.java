package com.simulador.ingles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class modulo1 extends AppCompatActivity {

    private Button btnModulo1Adjetives, btnModulo2IdentifyObjects, btnModulo3HearAndWrite, btnActivityAnimals;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modulo1);
        btnModulo1Adjetives = (Button)findViewById(R.id.btnModulo1Adjetives);
        btnModulo1Adjetives.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(modulo1.this, module1_adjetives.class);
                startActivity(intent);
            }
        });
        btnModulo2IdentifyObjects = (Button)findViewById(R.id.btnModulo2IdentifyObjects);
        btnModulo2IdentifyObjects.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(modulo1.this, module1_identify.class);
                startActivity(intent);
            }
        });
        btnModulo3HearAndWrite = (Button)findViewById(R.id.btnModulo3HearAndWrite);
        btnModulo3HearAndWrite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(modulo1.this, module1_hearAndWrite.class);
                startActivity(intent);
            }
        });
        btnActivityAnimals = (Button)findViewById(R.id.btnActivityAnimals);
        btnActivityAnimals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(modulo1.this, order_words.class);
                startActivity(intent);
            }
        });
    }

    public void actAnimals(View view) {
    }
}