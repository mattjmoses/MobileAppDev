package com.example.matt.fileio;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.*;

public class MainActivity extends AppCompatActivity {
        private Button btnSave;
        private Button brnLoad;
        private EditText textBox;
        private static final int READ_BLOCK_SIZE = 100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSave = (Button)findViewById(R.id.btnSave);
        brnLoad = (Button)findViewById(R.id.btnLoad);
        textBox =(EditText) findViewById(R.id.txtBox);
        //Def Text here


        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = textBox.getText().toString();

                try
                {
                    //External Storage eg SD card
//                    File sdCard = Environment.getExternalStorageDirectory();
//                    File directory = new File(sdCard.getAbsolutePath()+"/MyFolder");
//                    directory.mkdir();
//                    File file = new File(directory, "test.txt");
//                    FileOutputStream fOut = new FileOutputStream(fOut);

                  //Internal Storage
                    FileOutputStream fOut = openFileOutput("text.txt",MODE_APPEND);
                    OutputStreamWriter osw = new OutputStreamWriter(fOut);
                    osw.write(str);
                    //Closes the text file when it's done with it
                    osw.flush();
                    osw.close();
                    Toast.makeText(getBaseContext(),"File Saved",Toast.LENGTH_LONG).show();
                    textBox.setText("");
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
            }
        });

        brnLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try
                {
                    //Internal storage
                    FileInputStream fIn = openFileInput("text.txt");
                    InputStreamReader isr = new InputStreamReader(fIn);
                    char[] inputBuffer = new char[READ_BLOCK_SIZE];
                    String s =""; //Concat to this
                    int charRead;


                    while ((charRead =isr.read(inputBuffer))>0)
                    {
                        //Convert chars to string
                        String readString = String.copyValueOf(inputBuffer,0,charRead);
                        s += readString;
                        inputBuffer = new char[READ_BLOCK_SIZE];
                    }//End While

                    textBox.setText(s);
                    Toast.makeText(getBaseContext(),"File Loaded :)",Toast.LENGTH_LONG).show();
                }
                catch (IOException e){e.printStackTrace();}


            }
        });
    }//End Oncreate
}
