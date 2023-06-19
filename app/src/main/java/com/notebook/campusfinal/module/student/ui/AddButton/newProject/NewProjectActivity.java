package com.notebook.campusfinal.module.student.ui.AddButton.newProject;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.notebook.campusfinal.R;

public class NewProjectActivity extends AppCompatActivity {
    private TextView Next_project_text;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_project);

        Next_project_text = findViewById(R.id.Next_project_text);

        ActionBar actionBar = getSupportActionBar();
        ColorDrawable colorDrawable  = new ColorDrawable(Color.parseColor("#2c2f49"));
        actionBar.setBackgroundDrawable(colorDrawable);
        actionBar.setTitle("Add Project");
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);

        Window window = this.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this,R.color.profile_notificationbar_color));

        Next_project_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NewProjectActivity.this,NewProjectActivity2.class);
                startActivity(intent);
                finish();
            }

        });
    }
}