package com.mattiscool.matt.assignment_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //Instantiating the quiz logic class.
    private QuizLogic quizLogic;






    //The UI elements of the app
    private TextView scoreView;
    private TextView questionPanel;
    private Button button01;
    private Button button02;
    private Button button03;


    private String question;
    private String answer;
    private int questionNumber = 1;
    private int score = 0;
    String stScore = "";


    public MainActivity() {

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        quizLogic = new QuizLogic(this.getApplicationContext());

        try {
            quizLogic.parseText();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Hooking everything up.

        scoreView = (TextView)findViewById(R.id.txtScoreBox);
        questionPanel = (TextView)findViewById(R.id.txtQuestionBox);
        button01 = (Button)findViewById(R.id.btn01);
        button02 = (Button)findViewById(R.id.btn02);
        button03 = (Button)findViewById(R.id.btn03);

        updateQuesrtions();
        //Button01 Listener
        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer.equals(button01.getText()))
                {
                    score = score + 1;
                    stScore = Integer.toString(score);
                    scoreView.setText(stScore);
                    updateQuesrtions();
                }
            }
        });

        //Button02 Listener
        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer.equals(button02.getText()))
                {
                    score = score + 1;
                    stScore = Integer.toString(score);
                    scoreView.setText(stScore);
                    updateQuesrtions();
                }

            }
        });
        //Button03 Listener
        button03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer.equals(button03.getText()))
                {
                    score = score + 1;
                    stScore = Integer.toString(score);
                    scoreView.setText(stScore);
                    updateQuesrtions();
                }
            }
        });


    }//End onCreate
    private void updateQuesrtions()
    {
        questionPanel.setText(quizLogic.getQuestion(questionNumber));

        List<String> result = new ArrayList<String>();
        result.add(populateButtons().get(0));
        result.add(populateButtons().get(1));
        result.add(populateButtons().get(2));
        Collections.shuffle(result);
        button01.setText(result.get(0));
        button02.setText(result.get(1));
        button03.setText(result.get(2));

        answer = quizLogic.getCorrectAnswer(questionNumber);
        questionNumber++;
    }



    public List<String> populateButtons()
    {
        //Find wrong answers
        boolean done = false;
        boolean done02 = false;
        Random rand01 = new Random();
        Random rand02 = new Random();
        int randNum01 = rand01.nextInt((9 - 1) + 1) + 1;
        int randNum02 = rand02.nextInt((9-1) +1) +1;
        List<String> buttons = new ArrayList<>();
        buttons.add(quizLogic.getAnswers().get(randNum01));
        buttons.add(quizLogic.getAnswers().get(randNum02));
        buttons.add(quizLogic.getCorrectAnswer(questionNumber));




        return buttons;
    }










}//End Class
