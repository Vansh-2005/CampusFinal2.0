package com.notebook.campusfinal.module.student.ui.AddButton.newEvent;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.notebook.campusfinal.R;

public class NewEventActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_event2);



        ActionBar actionBar = getSupportActionBar();
        ColorDrawable colorDrawable  = new ColorDrawable(Color.parseColor("#2c2f49"));
        actionBar.setBackgroundDrawable(colorDrawable);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);


        actionBar.setTitle("Add Event");
        Window window = this.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this,R.color.profile_notificationbar_color));
    }

    @Override
    public void onBackPressed() {
        Intent intent =new Intent(NewEventActivity2.this,NewEventActivity.class);
        startActivity(intent);
        super.onBackPressed();
    }
}