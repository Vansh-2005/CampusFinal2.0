package com.notebook.campusfinal.module.admin.authentication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.notebook.campusfinal.module.student.authentication.LoginActivity;
import com.notebook.campusfinal.R;

public class AdminLoginActivity extends AppCompatActivity {

    private Button Student_login;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        getSupportActionBar().hide();

        Window window = this.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this,R.color.login_notificationbar_color2));


        Student_login = findViewById(R.id.Student_login);


        Student_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminLoginActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}