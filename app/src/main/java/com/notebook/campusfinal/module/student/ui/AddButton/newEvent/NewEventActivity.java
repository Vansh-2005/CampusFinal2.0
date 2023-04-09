package com.notebook.campusfinal.module.student.ui.AddButton.newEvent;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.notebook.campusfinal.R;

import java.util.Calendar;

public class NewEventActivity extends AppCompatActivity {

    private EditText dateEditText;
    private TextView Next_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_event);

         dateEditText = findViewById(R.id.dateEditText);
         Next_text = findViewById(R.id.Next_text);

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

        dateEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDatePickerDialog();
            }
        });

        Next_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NewEventActivity.this,NewEventActivity2.class);
                startActivity(intent);
                finish();
            }
        });
    }




    private void showDatePickerDialog() {
        final Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
                // set the selected date to the EditText
                String selectedDate = dayOfMonth + "/" + (month + 1) + "/" + year;
                dateEditText.setText(selectedDate);
            }
        }, year, month, dayOfMonth);

        // show the DatePickerDialog
        datePickerDialog.show();
    }
}