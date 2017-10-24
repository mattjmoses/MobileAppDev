package com.mattiscool.matt.assignment_02;

import android.content.Context;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by Matt on 2017-10-23.
 */

public class QuizLogic extends MainActivity

{
    Context context;
    ArrayList<String> questions = new ArrayList<String>();
    ArrayList<String> answers = new ArrayList<String>();
    //Our Hash Map. NOW. Time to put some stuff in it.
    Map<String,String> map = new HashMap<String,String>();


    public QuizLogic()
    {




        //Adding the test elements
//        questions.add("What's 1+11111?");
//        questions.add("What's 2+2?");
//        questions.add("What's 3+3?");
//        questions.add("What's 4+4?");
//
//        //Adding the test elements
//        answers.add("2");
//        answers.add("4");
//        answers.add("6");
//        answers.add("8");
//        answers.add("700");
//        answers.add("Over 9000");
//        answers.add("45");
//        answers.add("88");
//        answers.add("Old man");
//        answers.add("Cookie");
//        answers.add("Toast");

        //Lining the elements in the hashmap
//        map.put(questions.get(0),answers.get(0));
//        map.put(questions.get(1),answers.get(1));
//        map.put(questions.get(2),answers.get(2));
//        map.put(questions.get(3),answers.get(3));
//        Collections.shuffle(questions);
//        Collections.shuffle(answers);


    }



    //Old prototype stuff
    private String[] questionList = {"What's 1+1","What's 2+2","What's 3+3","What's 4+4"};
    private String[][] choiceList = {
            {"Banana","2","Idiot"},
            {"4","Jump","Wrong"},
            {"Mando","6","OuterSpacePotatoMan"},
            {"Nun","Bisquick","8"}
    };
    private String[] answerList = {"2","4","6","8"};




    public String getQuestion(int q) {
        int counter = 0;
        for (Map.Entry<String, String> e : map.entrySet()) {
            counter++;
            if (counter == q) {
                String question = e.getKey();
                return question;
            }


//        String question = questions.get(q);
//        return question;
        }
        return null;
    }

    public String getChoice01(int b)
    {
        int counter = 0;
        for (Map.Entry<String, String> e : map.entrySet())
        {
            counter++;
            if (counter == b) {
                String choice = e.getValue();
                return choice;
            }

        }

        return null;
    }

    public String getChoice02(int b)
    {
        String choice1 = choiceList[b][1];
        return choice1;
    }

    public String getChoice03(int b)
    {
        String choice2 = choiceList[b][2];
        return choice2;
    }

    public String getCorrectAnswer(int a)
    {

        int counter = 0;
        for (Map.Entry<String, String> e : map.entrySet())
        {
            counter++;
            if (counter == a) {
                String answer = e.getValue();
                return answer;
            }

        }

        return null;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void parseText()
    {
        InputStream is = this.getResources().openRawResource(R.raw.questions);
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String str = null;
        StringTokenizer stringTokenizer = new StringTokenizer(str, ":");
        try
        {
            while ((str=br.readLine())!=null)
            {

            }
        }
        catch(IOException e){e.printStackTrace();}
    }





}//End Class
