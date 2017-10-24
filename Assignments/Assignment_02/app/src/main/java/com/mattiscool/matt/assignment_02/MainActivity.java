package com.mattiscool.matt.assignment_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Instantiating the quiz logic class.
    private QuizLogic quizLogic = new QuizLogic();

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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Hooking everything up.
        scoreView = (TextView)findViewById(R.id.txtScoreCount);
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
//                    updateScore();
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
//                    updateScore();
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
//                    updateScore();
                    updateQuesrtions();
                }
            }
        });


    }//End onCreate
    private void updateQuesrtions()
    {
        questionPanel.setText(quizLogic.getQuestion(questionNumber));
        button01.setText(quizLogic.getChoice01(questionNumber));
        button02.setText(quizLogic.getChoice02(questionNumber));
        button03.setText(quizLogic.getChoice03(questionNumber));

        answer = quizLogic.getCorrectAnswer(questionNumber);
        questionNumber++;
    }

    private void updateScore()
    {
        scoreView.setText(score);
    }


}//End Class
