package com.mattiscool.matt.assignment_02;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;

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
import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by Matt on 2017-10-23.
 */

public class QuizLogic extends ContextWrapper

{
    //WORK DAMN YOU WORK!!
//    private Context myContext;
    //Our Hash Map. NOW. Time to put some stuff in it.
    Map<String,String> map = new HashMap<String,String>();
    ArrayList<String> questions = new ArrayList<String>();
    ArrayList<String> answers = new ArrayList<String>();


    public QuizLogic(Context context)
    {
//        this.myContext = context;
        super(context);






    }





    public String getQuestion(int q) {
        int counter = 0;
        for (Map.Entry<String, String> e : map.entrySet()) {
            counter++;
            if (counter == q) {
                String question = e.getKey();
                return question;
            }



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

    public void parseText() throws IOException {


        InputStream is = this.getResources().openRawResource(R.raw.questions);
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String str = null;
        String temp ="";

        int count = 0;
        try
        {
            while ((str=br.readLine())!=null)
            {
                temp = str;
                StringTokenizer stringToknizer = new StringTokenizer(temp,":");
               if(stringToknizer.hasMoreElements())
               {
                   String qus = stringToknizer.nextElement().toString();
                   String ans = stringToknizer.nextElement().toString();
                   questions.add(qus);
                   answers.add(ans);
                   map.put(questions.get(count), answers.get(count));
                   count++;
               }
            }
            br.close();
        }
        catch(IOException e){e.printStackTrace();}

    }

    public ArrayList<String> getQuestions() {
        return questions;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }



}//End Class
