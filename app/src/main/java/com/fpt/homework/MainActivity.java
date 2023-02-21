package com.fpt.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Button button = findViewById(R.id.button);

        button.setOnClickListener(this::onLogin);
    }

    private void onLogin(View view) {
        Intent intent = new Intent(this, HomePageActivity.class);
        EditText editText = findViewById(R.id.plt);

        intent.putExtra("name",editText.getText().toString());
        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();
        EditText editText = findViewById(R.id.plt);
        editText.setText("");
    }
}