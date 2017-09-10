package com.example.superwork;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Password_Found_Activity extends AppCompatActivity {
    private Button password_change;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password__found);
        password_change=(Button) findViewById(R.id.password_change);

        password_change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Password_Found_Activity.this,PasswordChangeActivity.class);
                startActivity(intent);
            }
        });
    }
}
