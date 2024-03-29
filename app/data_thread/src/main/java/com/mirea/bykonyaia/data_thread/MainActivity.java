package com.mirea.bykonyaia.data_thread;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mirea.bykonyaia.data_thread.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.methodsInfoThread.setText("");
        binding.methodsInfoThread.append("1. runOnUiThread - это метод класса Activity, который позволяет выполнить определенный код на основном потоке пользовательского интерфейса (UI).\n");
        binding.methodsInfoThread.append("2. postDelayed - это метод класса Handler, который позволяет запланировать выполнение определенного действия через определенный промежуток времени.\n");
        binding.methodsInfoThread.append("3. post - это метод класса Handler, который позволяет поместить сообщение в очередь сообщений обработчика и выполнить определенные действия сразу, как только приложение достигнет состояния Idle.\n");
    }
}