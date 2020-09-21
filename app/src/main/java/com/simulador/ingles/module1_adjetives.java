package com.simulador.ingles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.developer.kalert.KAlertDialog;

import java.util.ArrayList;
import java.util.List;

public class module1_adjetives extends AppCompatActivity {
    private EditText uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, diez, once, doce;
    private Button send;
    private TextView  valoresTXT1,valoresTXT2,valoresTXT3,valoresTXT4,valoresTXT5,valoresTXT6,valoresTXT7,valoresTXT8,valoresTXT9,valoresTXT10,valoresTXT11,valoresTXT12;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module1_adjetives);
        uno = findViewById(R.id.editTextimageView1);
        dos = findViewById(R.id.editTextimageView2);
        tres = findViewById(R.id.editTextimageView3);
        cuatro = findViewById(R.id.editTextimageView4);
        cinco = findViewById(R.id.editTextimageView5);
        seis = findViewById(R.id.editTextimageView6);
        siete = findViewById(R.id.editTextimageView7);
        ocho = findViewById(R.id.editTextimageView8);
        nueve = findViewById(R.id.editTextimageView9);
        diez = findViewById(R.id.editTextimageView10);
        once = findViewById(R.id.editTextimageView11);
        doce = findViewById(R.id.editTextimageView12);

        send = findViewById(R.id.buttonAdjetives);

        /*public void validarCampos (View view){
            int aciertoValorUno = 1;
            if (valorUno.toString() == aciertoValorUno) {
                new KAlertDialog(this, KAlertDialog.SUCCESS_TYPE)
                        .setTitleText("Good Job!")
                        .setContentText("You write the right answers!")
                        .show();
            } else {
                new KAlertDialog(this, KAlertDialog.WARNING_TYPE)
                        .setTitleText("Are you sure?")
                        .setContentText("Check your answers again!")
                        .setConfirmText("Yes, i tried again")
                        .show();
            }
        }*/
    }

    public void onClick(View view) {
        String valorUno = uno.getText().toString();
        String valorDos = dos.getText().toString();
        String valorTres = tres.getText().toString();
        String valorCuatro = cuatro.getText().toString();
        String valorCinco = cinco.getText().toString();
        String valorSeis = seis.getText().toString();
        String valorSiete = siete.getText().toString();
        String valorOcho = ocho.getText().toString();
        String valorNueve = nueve.getText().toString();
        String valorDiez = diez.getText().toString();
        String valorOnce = once.getText().toString();
        String valorDoce = doce.getText().toString();

        String aciertoValorUno = "1";
        String aciertoValorDos = "2";
        String aciertoValorTres = "3";
        String aciertoValorCuatro = "4";
        String aciertoValorCinco = "5";
        String aciertoValorSeis = "6";
        String aciertoValorSiete = "7";
        String aciertoValorOcho = "8";
        String aciertoValorNueve = "9";
        String aciertoValorDiez = "10";
        String aciertoValorOnce = "11";
        String aciertoValorDoce = "12";

        if (
                aciertoValorUno.equals(valorUno)
                && aciertoValorDos.equals(valorDos)
                && aciertoValorTres.equals(valorTres)
                && aciertoValorCuatro.equals(valorCuatro)
                && aciertoValorCinco.equals(valorCinco)
                && aciertoValorSeis.equals(valorSeis)
                && aciertoValorSiete.equals(valorSiete)
                && aciertoValorOcho.equals(valorOcho)
                && aciertoValorNueve.equals(valorNueve)
                && aciertoValorDiez.equals(valorDiez)
                && aciertoValorOnce.equals(valorOnce)
                && aciertoValorDoce.equals(valorDoce)
        )
        {
            //*OPCIONAL> EJECUTAR ALGUN TIPO DE CONSULTA PARA GUARDAR DATOS
            new KAlertDialog(this, KAlertDialog.SUCCESS_TYPE)
                    .setTitleText("Good Job!")
                    .setContentText("You write the right answers!")
                    .show();
        } else {
            new KAlertDialog(this, KAlertDialog.WARNING_TYPE)
                    .setTitleText("Are you sure?")
                    .setContentText("Check your answers again!")
                    .setConfirmText("Ok here we go again")
                    .show();
        }

    }


     /*   */
/*

        /*valoresTXT1.setText(valorUno);
        valoresTXT2.setText(valorDos);
        valoresTXT3.setText(valorTres);
        valoresTXT4.setText(valorCuatro);
        valoresTXT5.setText(valorCinco);
        valoresTXT6.setText(valorSeis);
        valoresTXT7.setText(valorSiete);
        valoresTXT8.setText(valorOcho);
        valoresTXT9.setText(valorNueve);
        valoresTXT10.setText(valorDiez);
        valoresTXT11.setText(valorOnce);
        valoresTXT12.setText(valorDoce);*/



        /**VALIDACION DE CADA CAMPO DE LA ACTIVITY

        if(valorDos.toLowerCase() != aciertoValorDos){
            Toast toast = Toast.makeText(getApplicationContext(),"Incorrect or Some fields are empty, please try again", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.TOP|Gravity.LEFT, 75, 700);
            toast.show();
        } else{
            Toast toast = Toast.makeText(getApplicationContext(),"SE HACE SQL 2", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.TOP|Gravity.LEFT, 75, 700);
            toast.show();
            //EJECUTAR CONSULTA SQL PARA GUARDAR DATOS DEL USUARIO
        }
        if(valorTres.toLowerCase() != aciertoValorTres){
            Toast toast = Toast.makeText(getApplicationContext(),"Incorrect or Some fields are empty, please try again", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.TOP|Gravity.LEFT, 75, 700);
            toast.show();
        } else{
            Toast toast = Toast.makeText(getApplicationContext(),"SE HACE SQL 2", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.TOP|Gravity.LEFT, 75, 700);
            toast.show();
            //EJECUTAR CONSULTA SQL PARA GUARDAR DATOS DEL USUARIO
        }
        if(valorCuatro.toLowerCase() != aciertoValorCuatro){
            Toast toast = Toast.makeText(getApplicationContext(),"Incorrect or Some fields are empty, please try again", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.TOP|Gravity.LEFT, 75, 700);
            toast.show();
        } else{
            Toast toast = Toast.makeText(getApplicationContext(),"SE HACE SQL 2", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.TOP|Gravity.LEFT, 75, 700);
            toast.show();
            //EJECUTAR CONSULTA SQL PARA GUARDAR DATOS DEL USUARIO
        }
        if(valorCinco.toLowerCase() != aciertoValorCinco){
            Toast toast = Toast.makeText(getApplicationContext(),"Incorrect or Some fields are empty, please try again", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.TOP|Gravity.LEFT, 75, 700);
            toast.show();
        } else{
            Toast toast = Toast.makeText(getApplicationContext(),"SE HACE SQL 2", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.TOP|Gravity.LEFT, 75, 700);
            toast.show();
            //EJECUTAR CONSULTA SQL PARA GUARDAR DATOS DEL USUARIO
        }
        if(valorSeis.toLowerCase() != aciertoValorSeis){
            Toast toast = Toast.makeText(getApplicationContext(),"Incorrect or Some fields are empty, please try again", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.TOP|Gravity.LEFT, 75, 700);
            toast.show();
        } else{
            Toast toast = Toast.makeText(getApplicationContext(),"SE HACE SQL 2", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.TOP|Gravity.LEFT, 75, 700);
            toast.show();
            //EJECUTAR CONSULTA SQL PARA GUARDAR DATOS DEL USUARIO
        }
        if(valorSiete.toLowerCase() != aciertoValorSiete){
            Toast toast = Toast.makeText(getApplicationContext(),"Incorrect or Some fields are empty, please try again", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.TOP|Gravity.LEFT, 75, 700);
            toast.show();
        } else{
            Toast toast = Toast.makeText(getApplicationContext(),"SE HACE SQL 2", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.TOP|Gravity.LEFT, 75, 700);
            toast.show();
            //EJECUTAR CONSULTA SQL PARA GUARDAR DATOS DEL USUARIO
        }
        if(valorOcho.toLowerCase() != aciertoValorOcho){
            Toast toast = Toast.makeText(getApplicationContext(),"Incorrect or Some fields are empty, please try again", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.TOP|Gravity.LEFT, 75, 700);
            toast.show();
        } else{
            Toast toast = Toast.makeText(getApplicationContext(),"SE HACE SQL 2", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.TOP|Gravity.LEFT, 75, 700);
            toast.show();
            //EJECUTAR CONSULTA SQL PARA GUARDAR DATOS DEL USUARIO
        }
        if(valorNueve.toLowerCase() != aciertoValorNueve){
            Toast toast = Toast.makeText(getApplicationContext(),"Incorrect or Some fields are empty, please try again", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.TOP|Gravity.LEFT, 75, 700);
            toast.show();
        } else{
            Toast toast = Toast.makeText(getApplicationContext(),"SE HACE SQL 2", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.TOP|Gravity.LEFT, 75, 700);
            toast.show();
            //EJECUTAR CONSULTA SQL PARA GUARDAR DATOS DEL USUARIO
        }
        if(valorDiez.toLowerCase() != aciertoValorDiez){
            Toast toast = Toast.makeText(getApplicationContext(),"Some fields are empty, please write your anwser", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.TOP|Gravity.LEFT, 75, 700);
            toast.show();
        } else{
            Toast toast = Toast.makeText(getApplicationContext(),"SE HACE SQL 2", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.TOP|Gravity.LEFT, 75, 700);
            toast.show();
            //EJECUTAR CONSULTA SQL PARA GUARDAR DATOS DEL USUARIO
        }
        if(valorOnce.toLowerCase() != aciertoValorOnce){
            Toast toast = Toast.makeText(getApplicationContext(),"Incorrect or Some fields are empty, please try again", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.TOP|Gravity.LEFT, 75, 700);
            toast.show();
        } else{
            Toast toast = Toast.makeText(getApplicationContext(),"SE HACE SQL 2", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.TOP|Gravity.LEFT, 75, 700);
            toast.show();
            //EJECUTAR CONSULTA SQL PARA GUARDAR DATOS DEL USUARIO
        }
        if(valorDoce.toLowerCase() != aciertoValorDoce){
            Toast toast = Toast.makeText(getApplicationContext(),"Incorrect or Some fields are empty, please try again", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.TOP|Gravity.LEFT, 75, 700);
            toast.show();
        } else{
            Toast toast = Toast.makeText(getApplicationContext(),"SE HACE SQL 2", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.TOP|Gravity.LEFT, 75, 700);
            toast.show();
            //EJECUTAR CONSULTA SQL PARA GUARDAR DATOS DEL USUARIO
        }
*/
    }
//    public void actAdjetives(View view) {
//        LinearLayout linearLayout = findViewById(R.id.layoutAdjetivesConLosEditAValidar);
//        int countLineaLAdjetives = linearLayout.getChildCount();
//        boolean isAllFill = true;
//        for (int i = 0; i < countLineaLAdjetives; i++){
//            EditText editText = (EditText) linearLayout.getChildAt(i);
//            if (editText.getText().toString().isEmpty()){
//                isAllFill = false;
//                break;
//            }
//        }
//        if (isAllFill){
//            Log.i("module1_adjetives","onCreate -> else -> Todos los EditText estan llenos");
//        }else {
//            Log.i("module1_adjetives","onCreate -> else -> Todos los EditText estan llenos");
//        }
//    }
//    public void validarCampos (View view){
//
//        String valorFallos = "Vaya, intentalo nuevamente";
//        Toast toast = Toast.makeText(getApplicationContext(),"Some fields are empty, please write your anwser", Toast.LENGTH_LONG);
//        toast.setGravity(Gravity.TOP|Gravity.LEFT, 0,0);
//        if (valorUno.isEmpty() && valorDos.isEmpty() && valorTres.isEmpty() && valorCuatro.isEmpty() && valorCinco.isEmpty() && valorSeis.isEmpty() && valorSiete.isEmpty() && valorOcho.isEmpty() && valorNueve.isEmpty() && valorDiez.isEmpty()){
//            Toast toast = Toast.makeText(getApplicationContext(),"Some fields are empty, please write your anwser", Toast.LENGTH_LONG);
//            toast.setGravity(Gravity.TOP|Gravity.LEFT, 0,0);
//        }else {
//            Toast toast = Toast.makeText(getApplicationContext(),"Ok OK OK OK OK OK OK OK ", Toast.LENGTH_LONG);
//        }

