package com.mattiscool.matt.assignment_02;

/**
 * Created by Matt on 2017-10-23.
 */

public class QuizLogic
{
    //This is all prototyping. Next step is to use two arraylists with hashing. Then after THAT
    //Two arraylists built from a text file.
    private String[] questionList = {"What's 1+1","What's 2+2","What's 3+3","What's 4+4"};
    private String[][] choiceList = {
            {"Banana","2","Idiot"},
            {"4","Jump","Wrong"},
            {"Mando","6","OuterSpacePotatoMan"},
            {"Nun","Bisquick","8"}
    };
    private String[] answerList = {"2","4","6","8"};


    public String getQuestion(int q)
    {
        String question = questionList[q];
        return question;
    }

    public String getChoice01(int b)
    {
     String choice0 = choiceList[b][0];
        return choice0;
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
        String correct = answerList[a];
        return correct;
    }


}//End Class
