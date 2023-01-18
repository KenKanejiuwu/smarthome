package com.example.demo22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        EditText email = (EditText) findViewById(R.id.editTextEmail);
        EditText pass = (EditText) findViewById(R.id.editTextPass);
        Button btn = (Button) findViewById(R.id.sign_in_btn);
        Button reg = (Button) findViewById(R.id.reg_btn);
        TextView numbers = (TextView) findViewById(R.id.textNumbers);
        final int[] counter = {3};



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(email.getText().toString().equals("admin") &&
                        pass.getText().toString().equals("qwer")) {
                    Intent intent = new Intent(SignInActivity.this, MainActivity.class);
                    startActivity(intent);
                }else{
                    numbers.setVisibility(View.VISIBLE);
                    counter[0]--;
                    numbers.setText(Integer.toString(counter[0]));

                    if (counter[0] == 0) {
                        btn.setEnabled(false);
                    }
                }
            }
        });

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignInActivity.this, RegistrationActivity.class);
                startActivity(intent);
            }
        });
    }
}