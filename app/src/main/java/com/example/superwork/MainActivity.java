package com.example.superwork;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button student_submit;
    Button teacher_submit;
    Button register_start;
    Button password_find;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        student_submit=(Button) findViewById(R.id.student_submit);
        teacher_submit=(Button) findViewById(R.id.teacher_submit);
        register_start=(Button) findViewById(R.id.register_start);
        password_find=(Button) findViewById(R.id.password_find);

        //注册按钮监听事件
        register_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });

        //找回密码按钮监听事件
        password_find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Password_Found_Activity.class);
                startActivity(intent);
            }
        });

        //学生登陆
        student_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,HomePageActivity.class);
                startActivity(intent);
            }
        });
    }
}
