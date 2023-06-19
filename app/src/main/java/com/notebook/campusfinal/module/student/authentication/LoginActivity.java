package com.notebook.campusfinal.module.student.authentication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.google.android.material.card.MaterialCardView;
import com.notebook.campusfinal.module.admin.AdminDashboard;
import com.notebook.campusfinal.module.student.MainActivity;
import com.notebook.campusfinal.R;

public class LoginActivity extends AppCompatActivity {

    private TextView fgpassword , newAccount,continue_btn;
    private Button Admin_login,Student_login,Admin_continue;
    private MaterialCardView student_pannel,admin_pannel;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);

        getSupportActionBar().hide();

        Window window = this.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this,R.color.login_notificationbar_color2));

        newAccount = findViewById(R.id.create_new_account);
        fgpassword = findViewById(R.id.click_here);
        continue_btn = findViewById(R.id.login);
        student_pannel = findViewById(R.id.student_pannel);
        Admin_login = (Button)findViewById(R.id.admin_button);
        admin_pannel = findViewById(R.id.admin_pannel);
        Student_login = findViewById(R.id.Student_login);
        Admin_continue =findViewById(R.id.admin_continue);

        newAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
                finish();
            }
        });

        fgpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, ForgetPassActivity.class);
                startActivity(intent);
                finish();
            }
        });
        continue_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
                finish();

                Toast.makeText(LoginActivity.this, "Login Succesfully", Toast.LENGTH_SHORT).show();
            }
        });

        Admin_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                student_pannel.setVisibility(View.GONE);
                admin_pannel.setVisibility(View.VISIBLE);
//                Intent intent = new Intent(LoginActivity.this, AdminLoginActivity.class);
//                startActivity(intent);
//                finish();
            }
        });
        Student_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                student_pannel.setVisibility(View.VISIBLE);
                admin_pannel.setVisibility(View.GONE);
//                Intent intent = new Intent(LoginActivity.this, AdminLoginActivity.class);
//                startActivity(intent);
//                finish();
            }
        });
        Admin_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, AdminDashboard.class);
                startActivity(intent);
                finish();
            }
        });
    }
}