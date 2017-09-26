package com.example.matt.assignment_01;

/**
 * Created by Matt on 2017-09-24.
 */

//This class is where the magic of mathematics happens. OH MY GOD

public class MathHappener {


    //This method takes in the values from the Calculator class and makes math happen to them.
    //Hoot hoot.
    public String makeMathHappen(String value01, String operator, String value02)
    {
        //First thing. Convert both values to doubles so they can be math'd
        double value01Doubled = Double.parseDouble(value01);
        double value02Doubled = Double.parseDouble(value02);
        double result;
        String strResult;

        //First checking for divide by zero errors
        //Tells the user to stop trying to divide by zero
        if(value02 == "0" || value02 == "0.0" || value02 == null)
        {
            strResult = "Quit trying to break the universe!";
            return strResult;
        }
        //Just looping through and figuring out the math.
        else if(operator.equals("+"))
        {
           result = value01Doubled + value02Doubled;
           strResult = String.valueOf(result);
            return  strResult;
        }
        else if(operator.equals("-"))
        {
            result = value01Doubled - value02Doubled;
            strResult = String.valueOf(result);
            return  strResult;
        }
        else if(operator.equals("*"))
        {
            result = value01Doubled * value02Doubled;
            strResult = String.valueOf(result);
            return  strResult;
        }
        else if(operator.equals("/"))
        {
            result = value01Doubled / value02Doubled;
            strResult = String.valueOf(result);
            return  strResult;
        }
        else if(operator.equals(" "))
        {
            return " ";
        }
        else
        {
            return "Math is fun!";
        }

    }





}//End Class
