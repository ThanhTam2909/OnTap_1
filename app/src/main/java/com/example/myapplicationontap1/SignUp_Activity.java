package com.example.myapplicationontap1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp_Activity extends AppCompatActivity {

    private EditText edt_hoten, edt_Email, edt_Pass;
    private Button btn_SignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        edt_Email = (EditText) findViewById(R.id.edt_email);
        edt_Pass = (EditText) findViewById(R.id.edt_pass);
        btn_SignUp = (Button) findViewById(R.id.btn_signup);

        btn_SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Email, passW;
                Email = String.valueOf(edt_Email.getText());
                passW = String.valueOf(edt_Pass.getText());

                if (TextUtils.isEmpty(Email)) {
                    Toast.makeText(SignUp_Activity.this, "Enter email", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(passW)) {
                    Toast.makeText(SignUp_Activity.this, "Enter password", Toast.LENGTH_SHORT).show();
                    return;
                }



                Intent intent = new Intent(SignUp_Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}