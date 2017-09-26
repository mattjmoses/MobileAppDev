package com.example.matt.assignment_01;

/**
 * Created by Matt on 2017-09-24.
 */

//This class is where the magic of mathematics happens. OH MY GOD

public class MathHappener {


    //This method takes in the values from the Calculator class and makes math happen to them.
    //Hoot hoot.
//    public String makeMathHappen(String value01, String operator, String value02)
//    {
//        //First thing. Convert both values to doubles so they can be math'd
//        double value01Doubled = Double.parseDouble(value01);
//        double value02Doubled = Double.parseDouble(value02);
//        double result;
//        String strResult;
//
//        //First checking for divide by zero errors
//        //Tells the user to stop trying to divide by zero
//        if(value02 == "0" || value02 == "0.0" || value02 == null)
//        {
//            strResult = "Quit trying to break the universe!";
//            return strResult;
//        }
//        //Just looping through and figuring out the math.
//        else if(operator.equals("+"))
//        {
//           result = value01Doubled + value02Doubled;
//           strResult = String.valueOf(result);
//            return  strResult;
//        }
//        else if(operator.equals("-"))
//        {
//            result = value01Doubled - value02Doubled;
//            strResult = String.valueOf(result);
//            return  strResult;
//        }
//        else if(operator.equals("*"))
//        {
//            result = value01Doubled * value02Doubled;
//            strResult = String.valueOf(result);
//            return  strResult;
//        }
//        else if(operator.equals("/"))
//        {
//            result = value01Doubled / value02Doubled;
//            strResult = String.valueOf(result);
//            return  strResult;
//        }
//        else if(operator.equals(" "))
//        {
//            return " ";
//        }
//        else
//        {
//            return "Math is fun!";
//        }
//
//    }//End function
    //Methods for all the math functions. Take in the two values from the calculator class
    //Hurah for that
    public String addNumbers(String value01, String value02)
    {
        double value01Doubled = Double.parseDouble(value01);
        double value02Doubled = Double.parseDouble(value02);
        double result;
        String strResult;
        result = value01Doubled + value02Doubled;
        strResult = String.valueOf(result);
        return  strResult;
    }//End Function

    public String subtractNumbers(String value01, String value02)
    {
        double value01Doubled = Double.parseDouble(value01);
        double value02Doubled = Double.parseDouble(value02);
        double result;
        String strResult;
        result = value01Doubled - value02Doubled;
        strResult = String.valueOf(result);
        return  strResult;
    }//End Function

    public String multiplyNumbers(String value01, String value02)
    {
        double value01Doubled = Double.parseDouble(value01);
        double value02Doubled = Double.parseDouble(value02);
        double result;
        String strResult;
        result = value01Doubled * value02Doubled;
        strResult = String.valueOf(result);
        return  strResult;
    }//End Function

    public String divideNumbers(String value01, String value02)
    {
        double value01Doubled = Double.parseDouble(value01);
        double value02Doubled = Double.parseDouble(value02);
        double result;
        String strResult;
        //Checking for divide by zero errors.
        if(value02Doubled == 0 || value01Doubled == 0.0)
        {
            strResult = "Quit trying to break the universe!";
        }
        else
            {
                result = value01Doubled / value02Doubled;
                strResult = String.valueOf(result);
                return  strResult;
            }
        return "Math is fun!";
    }//End Function





}//End Class
