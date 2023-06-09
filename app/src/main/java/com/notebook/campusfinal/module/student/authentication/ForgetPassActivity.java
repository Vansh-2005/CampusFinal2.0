package com.notebook.campusfinal.module.student.authentication;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.notebook.campusfinal.R;

public class ForgetPassActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgrt_pass);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setDisplayShowHomeEnabled(false);
//        getSupportActionBar().setHomeAsUpIndicator(R.drawable.back_icon);


        getSupportActionBar().setTitle("Forget Password");
        ColorDrawable colorDrawable  = new ColorDrawable(Color.parseColor("#671935"));
        getSupportActionBar().setBackgroundDrawable(colorDrawable);


        Window window = this.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this,R.color.fgpassword_notificationbar_color));

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(ForgetPassActivity.this, LoginActivity.class);
        startActivity(intent);
        finish();
    }
}