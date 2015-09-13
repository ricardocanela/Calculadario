package br.modesteam.calculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.NavUtils;
import android.widget.*;
import android.view.*;
import android.app.*;

import java.io.FileNotFoundException;
import java.util.Timer;
import java.util.TimerTask;

public class CalculatorActivity extends Activity {

    EditText answear;
    Button but1,but2,but3,but4,but5,but6,but7,but8,but9,but10,but11,but12,but13,but14,but15,but16,but17,but18;

    int numDimitri=1;
    int numDario=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        answear = (EditText) findViewById(R.id.answear);
        but1 = (Button) findViewById(R.id.button2);
        but2 = (Button) findViewById(R.id.button3);
        but3 = (Button) findViewById(R.id.button4);
        but4 = (Button) findViewById(R.id.button5);
        but5 = (Button) findViewById(R.id.button6);
        but6 = (Button) findViewById(R.id.button7);
        but7 = (Button) findViewById(R.id.button8);
        but8 = (Button) findViewById(R.id.button9);
        but9 = (Button) findViewById(R.id.button10);
        but10 = (Button) findViewById(R.id.button11);
        but11 = (Button) findViewById(R.id.button12);
        but12 = (Button) findViewById(R.id.button13);
        but13 = (Button) findViewById(R.id.button14);
        but14 = (Button) findViewById(R.id.button15);
        but15 = (Button) findViewById(R.id.button16);
        but16 = (Button) findViewById(R.id.button17);
        but17 = (Button) findViewById(R.id.button18);
        but18 = (Button) findViewById(R.id.button19);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                answear.setText(answear.getText() + "1");
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                answear.setText(answear.getText() + "2");
            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                answear.setText(answear.getText() + "3");
            }
        });
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                answear.setText(answear.getText() + "4");
            }
        });
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                answear.setText(answear.getText() + "5");
            }
        });
        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                answear.setText(answear.getText() + "6");
            }
        });
        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                answear.setText(answear.getText() + "7");
            }
        });
        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                answear.setText(answear.getText() + "8");
            }
        });
        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                answear.setText(answear.getText() + "9");
            }
        });
        but10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                answear.setText(answear.getText() + ".");
            }
        });
        but11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                answear.setText(answear.getText() + "0");
            }
        });
        but12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                answear.setText(" ");
            }
        });
        but13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                answear.setText(answear.getText() + "+");
            }
        });
        but14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                answear.setText(answear.getText() + "-");
            }
        });
        but15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                answear.setText(answear.getText() + "*");
            }
        });
        but16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                answear.setText(answear.getText() + "/");
            }
        });
        but17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                numDario = (int) (Math.random() * 20) + 1;
                if(answear.getText().toString().contains("."))
                    answear.setText("24");
                else
                {
                    switch (numDario)
                    {
                        case 1:answear.setText("24"); break;
                        case 2:answear.setText("BATATA"); break;
                        case 3:answear.setText("Vodka"); break;
                        case 4:answear.setText("Gordinhas"); break;
                        case 5:answear.setText("Almofadinha"); break;
                        case 6:answear.setText("Macaco"); break;
                        case 7:answear.setText("Homo-Sapiens"); break;
                        case 8:answear.setText("Ceifador"); break;
                        case 9:answear.setText("Prechecudo"); break;
                        case 10:answear.setText("Dromedario"); break;
                        case 11:answear.setText("Dario Naharis"); break;
                        case 12:answear.setText("Tomador de Extrato de Vodka"); break;
                        case 13:answear.setText("Bumbum Guloso"); break;
                        case 14:answear.setText("Asteroide"); break;
                        case 15:answear.setText("Travesdario"); break;
                        case 16:answear.setText("Dario Gay"); break;
                        case 17:answear.setText("Presidente da ACB"); break;
                        case 18:answear.setText("Naked man"); break;
                        case 19:answear.setText("Dalyssa"); break;
                        case 20:answear.setText("Dario Descartes");
                    }
                }
            }
        });
        but18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {


                for(int i=0; i<11; i++)
                {

                    AlertDialog.Builder alerta = new AlertDialog.Builder(CalculatorActivity.this);
                    alerta.setTitle("ERROR num:24242424");
                    switch (i)
                    {
                        case 1:alerta.setMessage("Aablizibizav abnazavie zbirov"); break;
                        case 2:alerta.setMessage("Ó"); break;
                        case 3:alerta.setMessage("Entao!"); break;
                        case 4:alerta.setMessage("Aliens"); break;
                        case 5:alerta.setMessage("Lasers"); break;
                        case 6:alerta.setMessage("Vodiroska"); break;
                        case 7:alerta.setMessage("ENFORCAR!"); break;
                        case 8:alerta.setMessage("CUIDADO..."); break;
                        case 9:alerta.setMessage("MUITOSCARRROOOSS!!"); break;
                        case 10:alerta.setMessage("Seu celular auto-explodirá em 3 segundos...");



                    }

                    alerta.setNeutralButton("Vodka!", null);
                    alerta.show();

                }

                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);

                //ABRIR SITE PORNO!!




            }
        });
    }
}
