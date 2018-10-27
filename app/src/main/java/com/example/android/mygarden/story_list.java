package com.example.android.mygarden;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.android.mygarden.R;

public class story_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_list);
    }

    public void onStoryCliced(View view) {
        Intent intent = new Intent(story_list.this, story_details.class);
        startActivity(intent);
    }


    public void onBackButtonClick(View view) {
        finish();
    }
}
