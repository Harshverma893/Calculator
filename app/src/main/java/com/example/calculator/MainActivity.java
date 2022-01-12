package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText, editText2;
    TextView textView;
    Button button, button2, button3, button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Calculated", Toast.LENGTH_SHORT).show();
                String o = editText.getText().toString();
                String l = editText2.getText().toString();
                float j = Float.parseFloat(o);
                float g = Float.parseFloat(l);
                double m = j + g;
                textView.setText("Adding both number we get " + m);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Calculated", Toast.LENGTH_SHORT).show();
                String o = editText.getText().toString();
                String l = editText2.getText().toString();
                float j = Float.parseFloat(o);
                float g = Float.parseFloat(l);
                double m = j - g;
                textView.setText("Subtracting both number we get " + m);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Calculated", Toast.LENGTH_SHORT).show();
                String o = editText.getText().toString();
                String l = editText2.getText().toString();
                float j = Float.parseFloat(o);
                float g = Float.parseFloat(l);
                double m = j * g;
                textView.setText("Multiplying both number we get " + m);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Calculated", Toast.LENGTH_SHORT).show();
                String o = editText.getText().toString();
                String l = editText2.getText().toString();
                float j = Float.parseFloat(o);
                float g = Float.parseFloat(l);
                double m = j / g;
                textView.setText("Dividing both number we get " + m);
            }
        });
    }
}
