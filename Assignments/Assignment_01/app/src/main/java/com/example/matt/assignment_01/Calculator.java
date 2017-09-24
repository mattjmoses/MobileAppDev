package com.example.matt.assignment_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
    private Button clr;
    private TextView screen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    }//End function

    private void hookUpButtons()
    {
        n01 = (Button)findViewById(R.id.btn01Num);
        n02 = (Button)findViewById(R.id.btn00Num);
        n03 = (Button)findViewById(R.id.btn03Num);
        n04 = (Button)findViewById(R.id.btn04Num);
        n05 = (Button)findViewById(R.id.btn05Num);
        n06 = (Button)findViewById(R.id.btn06Num);
        n07 = (Button)findViewById(R.id.btn07Num);
        n08 = (Button)findViewById(R.id.btn08Num);
        n09 = (Button)findViewById(R.id.btn09Num);
        n00 = (Button)findViewById(R.id.btn00Num);
        dec = (Button)findViewById(R.id.btnDec);
        add = (Button)findViewById(R.id.btnSub);
        sub = (Button)findViewById(R.id.btnSub);
        mul = (Button)findViewById(R.id.btnMul);
        div = (Button)findViewById(R.id.btnDiv);
        eql = (Button)findViewById(R.id.btnEql);
        bck = (Button)findViewById(R.id.btnBck);
        clr = (Button)findViewById(R.id.btnClr);
        screen = (TextView)findViewById(R.id.txtScreen);




    }//End function

}//End Class
