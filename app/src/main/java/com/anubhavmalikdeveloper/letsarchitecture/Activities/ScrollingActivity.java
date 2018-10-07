package com.anubhavmalikdeveloper.letsarchitecture.Activities;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.anubhavmalikdeveloper.letsarchitecture.Models.User;
import com.anubhavmalikdeveloper.letsarchitecture.R;

import java.util.ArrayList;
import java.util.List;

public class ScrollingActivity extends AppCompatActivity {
    private List<User> userList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(view -> Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show());

        ScrollingActivityViewModel viewModel = ViewModelProviders.of(this).get(ScrollingActivityViewModel.class);
        viewModel.getUsers().observe(this, users -> {
            if (users != null && users.size() > 0) {
                userList.addAll(users);
                //TODO : Update recycler view adapter and update list.
            }
        });
    }
}
