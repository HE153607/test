package com.fpt.homework;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        Button button = findViewById(R.id.button2);
        button.setOnClickListener(this::OnClose);

        Intent result = getIntent();
        if(result != null){
            Toast.makeText(this,result.getStringExtra("name"),Toast.LENGTH_SHORT).show();
            TextView textView = findViewById(R.id.textView);
            textView.setText(result.getStringExtra("name"));
        }

    }

    private void OnClose(View view) {
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }
}
