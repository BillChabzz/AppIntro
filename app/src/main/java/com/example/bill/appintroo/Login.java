package com.example.bill.appintroo;

import android.app.Activity;
import android.os.Bundle;
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
        login=(Button)findViewById(R.id.lgn);
        register=(Button)findViewById(R.id.register);
        forgotpassword=(TextView)findViewById(R.id.forgotpw);

        //set the clicklistener


    }
}
