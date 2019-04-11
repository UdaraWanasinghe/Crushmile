package com.udara.developer.crushmile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    MaterialButton materialButton;
    TextInputEditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        materialButton = findViewById(R.id.materialButton);
        editText = findViewById(R.id.editText);

        materialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().equals("123")) {
                    startActivity(new Intent(MainActivity.this, Activity3.class));
                } else {
                    startActivity(new Intent(MainActivity.this, Activity2.class));
                }
            }
        });
    }
}
