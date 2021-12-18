package com.example.project_002;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnclick(View v)
    {
        double num1, num2, ans;
        EditText m1, v1, result;
        //
        m1 = (EditText) findViewById(R.id.mass_1);
        v1 = (EditText) findViewById(R.id.veloc_1);
        result = (EditText) findViewById(R.id.result_1);

        num1 = Double.parseDouble(m1.getText().toString());
        num2 = Double.parseDouble(v1.getText().toString());
        ans = num1 * num2;
        result.setText(String.valueOf(ans));
    }
}