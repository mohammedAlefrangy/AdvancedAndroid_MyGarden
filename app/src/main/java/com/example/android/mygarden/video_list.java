package com.example.android.mygarden;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.android.mygarden.R;

public class video_list extends AppCompatActivity {
    private static final String TRAILER_URL = "https://www.youtube.com/watch?v=dYS3-4hNaw0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_list);
    }

    public void onVideosCliced1(View view) {
        final String trailerURL = TRAILER_URL ;
        Intent youtubeIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(trailerURL));
        if (youtubeIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(youtubeIntent);
        }
    }

    public void onBackButtonClick(View view) {
        finish();
    }
}
