package com.example.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding bind = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User("First", "Last");
        bind.setUser(user);
    }
}
