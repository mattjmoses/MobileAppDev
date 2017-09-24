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
    private Button clr;
    private TextView screen;

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
                screen.setText(screen.getText().toString() + getString(R.string.n01));

            }
        });

        n02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText().toString() + getString(R.string.n02));
            }
        });

        n03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText().toString() + getString(R.string.n03));
            }
        });

        n04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText().toString() + getString(R.string.n04));
            }
        });

        n05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText().toString() + getString(R.string.n05));
            }
        });

        n06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText().toString() + getString(R.string.n06));
            }
        });

        n07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText().toString() + getString(R.string.n07));
            }
        });

        n08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText().toString() + getString(R.string.n08));
            }
        });
        n09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText().toString() + getString(R.string.n09));
            }
        });

        n00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText().toString() + getString(R.string.n00));
            }
        });

        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText().toString() + getString(R.string.bDec));
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText().toString() + getString(R.string.bAdd));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText().toString() + getString(R.string.bSub));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText().toString() + getString(R.string.bMul));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText().toString() + getString(R.string.bDiv));
            }
        });

        eql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText().toString() + getString(R.string.bEql));
            }
        });
        //This is going to delete the eqation by one
        bck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText().toString() + getString(R.string.bBck));
            }
        });
        //This is going to clear everything that has been entered
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText().toString() + getString(R.string.bClr));
            }
        });



    }//End function

    //Links the layout elements to the Java code
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
