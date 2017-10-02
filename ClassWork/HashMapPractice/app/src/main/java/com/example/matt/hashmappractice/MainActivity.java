package com.example.matt.hashmappractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String s1 = "my string!";
        ArrayList<Object>arl = new ArrayList<Object>();
        Integer i1 = new Integer(10); //use type of wrapper and it's constructor
        Integer i2 = new Integer(20); //use type of wrapper and it's constructor
        Integer i3 = new Integer(30); //use type of wrapper and it's constructor
        Integer i4 = new Integer(40); //use type of wrapper and it's constructor



        //Adding objects to the arraylist
        arl.add(i1);
        arl.add(i2);
        arl.add(i3);

        System.out.println("The content of the ArrayList is:" +arl);
        System.out.println("The size of the ArrayList is: "+arl.size());//You can find the size by calling .size()

        //Adding the same objects in again except with i4 as well
        arl.add(i1);
        arl.add(i2);
        arl.add(i3);
        arl.add(i4);
        Integer i5 = new Integer(50);
        arl.add(i5);

        System.out.println("The content of the ArrayList is:" +arl);
        System.out.println("The size of the ArrayList is: "+arl.size());//You can find the size by calling .size()

        arl.remove(3); //Removes the third entry to the list. We know where it's stored more or less. So it removes i3

        System.out.println("The content of the ArrayList is:" +arl);
        System.out.println("The size of the ArrayList is: "+arl.size());//You can find the size by calling .size()

        ArrayList<Object> a = new ArrayList<Object>(); //A new list :0 Same type as the previous list
        a = (ArrayList<Object>)arl.clone(); //Clones the first list into the second list. Easy as pie.

        System.out.println("The content of the clone is:" +a);
        System.out.println("The size of the clone is: "+a.size());//You can find the size by calling .size()
        System.out.println("The content of the ArrayList is:" +arl);//
        System.out.println("The size of the ArrayList is: "+arl.size());//You can find the size by calling .size()



    }//End Oncreate
}
