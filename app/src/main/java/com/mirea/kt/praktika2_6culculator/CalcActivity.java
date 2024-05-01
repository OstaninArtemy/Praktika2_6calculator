package com.mirea.kt.praktika2_6culculator;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;


public class CalcActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        EditText editTextFirst = findViewById(R.id.etFirst);
        EditText editTextSecond = findViewById(R.id.etSecond);
        EditText editTextTree = findViewById(R.id.etTree);
        Button btnCalc = findViewById(R.id.btnStart);
        btnCalc.setOnClickListener(v -> {
            String firstTermStr = editTextFirst.getText().toString();
            String secondTermStr = editTextSecond.getText().toString();
            String treeTermStr = editTextTree.getText().toString();
            if (!firstTermStr.isEmpty() && !secondTermStr.isEmpty() && !treeTermStr.isEmpty()) {
                int result = Integer.parseInt(firstTermStr) * Integer.parseInt(secondTermStr)*Integer.parseInt(treeTermStr);
                Intent intent = new Intent();
                intent.putExtra("data", result);
                setResult(RESULT_OK, intent);
                finish();
            } else {
                Toast.makeText(getApplicationContext(), "Invalid terms", Toast.LENGTH_LONG).show();
            }
        });
    }

}
