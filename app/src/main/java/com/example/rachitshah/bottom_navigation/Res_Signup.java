package com.example.rachitshah.bottom_navigation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Res_Signup extends AppCompatActivity {

    EditText mail,mophone,pswd,usrusr;
    TextView lin,sup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_signup);

        sup = (TextView) findViewById(R.id.sup);
        lin = (TextView) findViewById(R.id.lin);
        usrusr = (EditText) findViewById(R.id.usrusr);
        pswd = (EditText) findViewById(R.id.pswrdd);
        mail = (EditText) findViewById(R.id.mail);
        mophone = (EditText) findViewById(R.id.mobphone);

        sup.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent it = new Intent(Res_Signup.this,Main2Activity.class);
                startActivity(it);
            }
        });

        lin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Res_Signup.this, Res_Login.class);
                startActivity(i);
            }
        });

    }
}
