package com.example.matt.assignment_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {
    //Setting up the variables for the buttons on the calculator
    private Button n01;
    private Button n02;
    private Button n03;
    private Button n04;
    private Button n05;
    private Button n06;
    private Button n07;
    private Button n08;
    private Button n09;
    private Button n00;
    private Button dec;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private Button eql;
    private Button bck;
    private Button plsMn;
    private Button clr;
    private TextView screen;
    private MathHappener calculate = new MathHappener();

    //All the operators you need to make math happen. Huh Huh
//    private final String addition = "+";
//    private final String subtraction = "-";
//    private final String multiplication = "*";
//    private final String division = "/";
//    private final String equals = "=";


    //Sets the first value to be not a number to avoid causing divide by zero problems
    private String value01 = " ";
    private String value02 = " ";
    private String operator = " ";
    private double result;
    private boolean operatorHit;
    private boolean hasDecimal;
    private boolean negative;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        //Calling the ol button functions when the app starts
        hookUpButtons();

        //Setting up the listeners for ALL the buttons. Hoo dolly.
        //This is also going to need to reference the strings.xml repository
        n01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Gets the prev tex on the screen and adds the value
                //from the strings repository


                //If the operator hasn't been hit and the value of value01 isn't empty
                if(!operatorHit)
                {
                    value01 += getString(R.string.n01);
//                    screen.setText(screen.getText().toString() + " " + value01);
                    screen.setText(value01);
                }
                else if(operatorHit == true)
                {
                    value02 += getString(R.string.n01);
//                    screen.setText(screen.getText().toString() + " " + value02);
                    screen.setText(value01 + " " + operator + " " + value02);
                }

            }
        });

        n02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                screen.setText(screen.getText().toString() + " " + getString(R.string.num02));

                if(!operatorHit)
                {
                    value01 += getString(R.string.n02);
//                    screen.setText(screen.getText().toString() + " " + value01);
                    screen.setText(value01);
                }
                else if(operatorHit == true)
                {
                    value02 += getString(R.string.n02);
//                    screen.setText(screen.getText().toString() + " " + value02);
                    screen.setText(value02);
                }
            }
        });

        n03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                screen.setText(screen.getText().toString()+ " "  + getString(R.string.n03));

                if(!operatorHit)
                {
                    value01 += getString(R.string.n03);
//                    screen.setText(screen.getText().toString() + " " + value01);
                    screen.setText(value01);
                }
                else if(operatorHit == true)
                {
                    value02 += getString(R.string.n03);
//                    screen.setText(screen.getText().toString() + " " + value02);
                    screen.setText(value02);
                }
            }
        });

        n04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                screen.setText(screen.getText().toString() + " " + getString(R.string.n04));
                if(!operatorHit)
                {
                    value01 += getString(R.string.n04);
//                    screen.setText(screen.getText().toString() + " " + value01);
                    screen.setText(value01);
                }
                else if(operatorHit == true)
                {
                    value02 += getString(R.string.n04);
//                    screen.setText(screen.getText().toString() + " " + value02);
                    screen.setText(value02);
                }
            }
        });

        n05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                screen.setText(screen.getText().toString() + " " + getString(R.string.n05));

                if(!operatorHit)
                {
                    value01 += getString(R.string.n05);
//                    screen.setText(screen.getText().toString() + " " + value01);
                    screen.setText(value01);
                }
                else if(operatorHit == true)
                {
                    value02 += getString(R.string.n05);
//                    screen.setText(screen.getText().toString() + " " + value02);
                    screen.setText(value01 + " " + operator + " " + value02);
                }
            }
        });

        n06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                screen.setText(screen.getText().toString() + " " + getString(R.string.n06));
                if(!operatorHit)
                {
                    value01 += getString(R.string.n06);
                    screen.setText(value01);
                }
                else if(operatorHit == true)
                {
                    value02 += getString(R.string.n06);

                    screen.setText(value01 + " " + operator + " " + value02);
                }
            }
        });

        n07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                screen.setText(screen.getText().toString() + " "  + getString(R.string.n07));

                if(!operatorHit)
                {
                    value01 += getString(R.string.n07);
                    screen.setText(value01);
                }
                else if(operatorHit == true)
                {
                    value02 += getString(R.string.n07);
                    screen.setText(value01 + " " + operator + " " + value02);
                }
            }
        });

        n08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                screen.setText(screen.getText().toString() + " "  + getString(R.string.n08));

                if(!operatorHit)
                {
                    value01 += getString(R.string.n08);
                    screen.setText(value01);
                }
                else if(operatorHit == true)
                {
                    value02 += getString(R.string.n08);
                    screen.setText(value01 + " " + operator + " " + value02);
                }
            }
        });
        n09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                screen.setText(screen.getText().toString() + " "  + getString(R.string.n09));

                if(!operatorHit)
                {
                    value01 += getString(R.string.n09);
                    screen.setText(value01);
                }
                else if(operatorHit == true)
                {
                    value02 += getString(R.string.n09);
                    screen.setText(screen.getText().toString() + " " + value02);
                }
            }
        });

        n00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                screen.setText(screen.getText().toString() + " " + getString(R.string.n00));

                if(!operatorHit)
                {
                    value01 += getString(R.string.n00);
                    screen.setText(value01);
                }
                else if(operatorHit == true)
                {
                    value02 += getString(R.string.n00);
                    screen.setText(value01 + " " + operator + " " + value02);
                }
            }
        });

        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                screen.setText(screen.getText().toString() + " " + getString(R.string.bDec));

                //Same as above except checking to ensure there's no decimal in the number already
                if(!operatorHit && !hasDecimal)
                {
                    value01 += getString(R.string.bDec);
                    screen.setText(screen.getText().toString() + " " + value01);
                    hasDecimal = true;
                }
                //Again ensuring there's no decimal already
                else if(operatorHit == true && !hasDecimal)
                {
                    value02 += getString(R.string.bDec);
                    screen.setText(screen.getText().toString() + " " + value02);
                    hasDecimal = true;
                }
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!operatorHit && !value01.equals(" "))
                {

                    operator = getString(R.string.bPlus);
                    operatorHit = true;
                    screen.setText(screen.getText().toString() + " " + operator);
                    hasDecimal = false;
                }

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!operatorHit && !value01.equals(" "))
                {

                    operator = getString(R.string.bSub);
                    screen.setText(screen.getText().toString() + " " + operator);
                    operatorHit = true;
                    hasDecimal = false;
                }

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!operatorHit && !value01.equals(" "))
                {
                    screen.setText(screen.getText().toString() + " " + getString(R.string.bMul));
                    operator = getString(R.string.bMul);
                    operatorHit = true;
                    hasDecimal = false;
                }

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!operatorHit && !value01.equals(" "))
                {

                    operator = getString(R.string.bDiv);
                    screen.setText(screen.getText().toString() + " " + operator);
                    operatorHit = true;
                    hasDecimal = false;
                }

            }
        });

        eql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operatorHit == true && !value01.equals(" ") && !value02.equals(" "))
                {
                    value01 = calculate.makeMathHappen(value01,operator,value02);

//                    screen.setText(screen.getText().toString() + " " + getString(R.string.bEql));
//                    screen.setText(" ");
                    screen.setText(value01);
                    value02 = " ";
                    operatorHit = false;
                }
;
            }
        });
        //This is going to delete the eqation by one
        bck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                screen.setText(screen.getText().toString() + getString(R.string.bBck));
                if(!operatorHit)
                {
                    value01 = " ";
                    screen.setText(value01);
                }
                else if(operatorHit == true)
                {
                    value02 = " ";
                    operatorHit = false;
                    operator = " ";
                    screen.setText(value01);
                }

            }
        });
        //This is going to clear everything that has been entered
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //There was no need to run the calculate method with null values, it only
                //executes when = is hit and then it passes the values on screen into it.
                //in theory this should work now.
                value01 = " ";
                value02 = " ";
                operator = " ";
                operatorHit = false;
                hasDecimal = false;
                screen.setText(" ");



            }
        });

        plsMn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!operatorHit && !negative)
                {
                    value01 = makePositiveOrNegative(value01);
                    screen.setText(value01);
                }
                else if(!operatorHit && negative == true)
                {
                    value01 = makePositiveOrNegative(value01);
                    screen.setText(value01);
                }
                else if(operatorHit == true && !negative)
                {
                    value02 = makePositiveOrNegative(value02);
                    screenvalue02);
                }
                else if(operatorHit == true && negative == true)
                {
                    value02 = makePositiveOrNegative(value02);
                    screen.setText(value02);
                }
            }
        });



    }//End function

    //Links the layout elements to the Java code
    private void hookUpButtons()
    {
        n01 = (Button)findViewById(R.id.btn01Num);
        n02 = (Button)findViewById(R.id.b2n02Num);
        n03 = (Button)findViewById(R.id.btn03Num);
        n04 = (Button)findViewById(R.id.btn04Num);
        n05 = (Button)findViewById(R.id.btn05Num);
        n06 = (Button)findViewById(R.id.btn06Num);
        n07 = (Button)findViewById(R.id.btn07Num);
        n08 = (Button)findViewById(R.id.btn08Num);
        n09 = (Button)findViewById(R.id.btn09Num);
        n00 = (Button)findViewById(R.id.btn00Num);
        dec = (Button)findViewById(R.id.btnDec);
        add = (Button)findViewById(R.id.btnAdd);
        sub = (Button)findViewById(R.id.btnSub);
        mul = (Button)findViewById(R.id.btnMul);
        div = (Button)findViewById(R.id.btnDiv);
        eql = (Button)findViewById(R.id.btnEql);
        bck = (Button)findViewById(R.id.btnBck);
        clr = (Button)findViewById(R.id.btnClr);
        plsMn = (Button)findViewById(R.id.btnPlsMn);
        screen = (TextView)findViewById(R.id.txtScreen);
    }//End function

    private String makePositiveOrNegative(String number)
    {
        //Casts the string to a double to make it negative and multiplies it
        //by -1 to make it negative or positive
        //Then casts it back to a string and sends it on it's way
        double changeState = Double.parseDouble(number);
        changeState = changeState * -1;
        number = String.valueOf(changeState);
        return number;
    }//End function


}//End Class
