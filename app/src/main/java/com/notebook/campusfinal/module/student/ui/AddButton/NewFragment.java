package com.notebook.campusfinal.module.student.ui.AddButton;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.notebook.campusfinal.R;
import com.notebook.campusfinal.module.student.ui.AddButton.newCommunity.NewCommunityActivity;
import com.notebook.campusfinal.module.student.ui.AddButton.newEvent.NewEventActivity;
import com.notebook.campusfinal.module.student.ui.AddButton.newProject.NewProjectActivity;

public class NewFragment extends Fragment {

    private Button New_event, New_project, New_community;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_new_project, container, false);

        ActionBar actionBar = ((AppCompatActivity) getActivity()).getSupportActionBar();

        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#2c2f49"));
        actionBar.setBackgroundDrawable(colorDrawable);
        actionBar.setTitle("New project");
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);

        Window window = getActivity().getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(getActivity(), R.color.profile_notificationbar_color));

        New_event = view.findViewById(R.id.event_btn);
        New_community = view.findViewById(R.id.Community_btn);
        New_project = view.findViewById(R.id.Project_btn);


        New_event.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), NewEventActivity.class);
                startActivity(intent);
            }
        });
        New_community.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), NewCommunityActivity.class);
                startActivity(intent);
            }
        });
        New_project.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), NewProjectActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}