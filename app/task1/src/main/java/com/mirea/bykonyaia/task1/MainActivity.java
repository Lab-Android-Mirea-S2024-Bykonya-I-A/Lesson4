package com.mirea.bykonyaia.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mirea.bykonyaia.task1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}