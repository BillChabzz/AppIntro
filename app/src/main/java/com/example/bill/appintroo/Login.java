package com.example.bill.appintroo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by bill on 10/13/15.
 */
public class Login extends Activity {

    //View variables
    EditText username,password;
    Button login,register;
    TextView forgotpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);

        //INitialize controls
        username=(EditText)findViewById(R.id.login_text_username);
        password=(EditText)findViewById(R.id.password);
        login=(Button)findViewById(R.id.lgn_button);
        register=(Button)findViewById(R.id.reg_btn);
        forgotpassword=(TextView)findViewById(R.id.forgotpw);

        //set the clicklistener
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent r = new Intent(Login.this,Register.class);
                startActivity(r);
                finish();

            }
        });

    login.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent l = new Intent(Login.this,Loggedin.class);
            startActivity(l);
            finish();
        }
    });
    }
}
