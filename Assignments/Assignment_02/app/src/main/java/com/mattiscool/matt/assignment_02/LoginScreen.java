package com.mattiscool.matt.assignment_02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginScreen extends AppCompatActivity {
    private Button btnBegin;
    private EditText nLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        btnBegin = (Button)findViewById(R.id.btnBegin);
        nLogin = (EditText)findViewById(R.id.edNameText);

        btnBegin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nLogin.getText().toString() != null)
                {
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    intent.putExtra("name",nLogin.getText());
                    startActivity(intent);
                }

            }
        });

    }
}
