package com.mirea.bykonyaia.audioplayer;
import com.mirea.bykonyaia.audioplayer.databinding.ActivityAudioPlayerBinding;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class AudioPlayerActivity extends AppCompatActivity {
    private ActivityAudioPlayerBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_audio_player);
        binding = ActivityAudioPlayerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}