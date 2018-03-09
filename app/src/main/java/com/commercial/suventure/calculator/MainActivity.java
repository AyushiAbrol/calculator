package com.commercial.suventure.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button add;
    private Button sub;
    private Button mul;
    private Button divi;
    private Button equal;
    private Button dot;
    private Button clear;
    private Button percent;
    private TextView info;
    private TextView result;
    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char MULTIPLICATION = '*';
    private final char DIVIISON = '/';
    private final char PERCENTAGE = '%';
    private final char EQU = 0;
    private double val1 = Double.NaN;
    private double val2;
    private char ACTION;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIView();
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "9");
            }
        });
        
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + ".");
            }
        });



        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = SUBTRACTION;
                result.setText(String.valueOf(val1) + " - ");
                info.setText(null);

            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = ADDITION;
                result.setText(String.valueOf(val1) + " + ");
                info.setText(null);

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = MULTIPLICATION;
                result.setText(String.valueOf(val1) + " * ");
                info.setText(null);

            }
        });

        divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = DIVIISON;
                result.setText(String.valueOf(val1) + " / ");
                info.setText(null);

            }
        });
        percent.setOnClickListener(new View.OnClickListener() {
            @Override

              public void onClick(View view) {
              compute();
              ACTION = PERCENTAGE;
              result.setText(String.valueOf(val1) + " % ");
              info.setText(null);
              }
              });

            equal.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       compute();
                       ACTION = EQU;
                       result.setText(result.getText().toString() + String.valueOf(val2) + "\n Result = " + String.valueOf(val1));
                       // 5 + 4 = 9
                       info.setText(null);

                   }
               });

            clear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (info.getText().length() > 0){
                        CharSequence name = info.getText().toString();
                        info.setText(name.subSequence(0, name.length()-1));
                    }
                    else {
                        val1 = Double.NaN;
                        val2 = Double.NaN;
                        info.setText(null);
                        result.setText(null);
                    }
                }
            });






    }
    private void setupUIView(){
        one = findViewById(R.id.btn1);
        zero = findViewById(R.id.btn0);
        two = findViewById(R.id.btn2);
        three = findViewById(R.id.btn3);
        four = findViewById(R.id.btn4);
        five = findViewById(R.id.btn5);
        six = findViewById(R.id.btn6);
        seven = findViewById(R.id.btn7);
        eight = findViewById(R.id.btn8);
        dot = findViewById(R.id.btndot);
        nine = findViewById(R.id.btn9);
        add = findViewById(R.id.btnadd);
        sub = findViewById(R.id.btnsub);
        mul = findViewById(R.id.btnmul);
        divi = findViewById(R.id.btndivi);
        equal = findViewById(R.id.btnequal);
        percent = findViewById(R.id.btn10);
        info = findViewById(R.id.tvControl);
        result = findViewById(R.id.tvResult);
        clear = findViewById(R.id.btnclear);


    }

    private void compute(){
        if (!Double.isNaN(val1)){
            val2 = Double.parseDouble(info.getText().toString());

            switch (ACTION){
                case ADDITION:
                    val1 = val1 + val2;
                    break;

                case SUBTRACTION:
                    val1 = val1 - val2;
                    break;

                case MULTIPLICATION:
                    val1 = val1 * val2;
                    break;

                case DIVIISON:
                    val1 = val1 / val2;
                    break;

                  case PERCENTAGE:
                  val1 = ((val1 / val2)*100);
                  break;


                case EQU:
                    break;




            }



        }
        else {
            val1 = Double.parseDouble(info.getText().toString());
        }
    }

            }


    /*
    private void setupUIView() {
    }
    */

