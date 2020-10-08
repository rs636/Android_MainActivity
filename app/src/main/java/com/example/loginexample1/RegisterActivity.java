package com.example.loginexample1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    private EditText regi_name,regi_age,regi_pnum,regi_id,regi_pass,regi_mail;
    private Button regi_btn,regi_chkbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) { //oncreate는 액티비티 처음시작할때 실행되는
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        regi_name = findViewById(R.id.regi_name);
        regi_age=findViewById(R.id.regi_age);
        regi_pnum=findViewById(R.id.regi_pnum);
        regi_id=findViewById(R.id.regi_id);
        regi_pass=findViewById(R.id.regi_pass);
        regi_mail=findViewById(R.id.regi_mail);

    }
}