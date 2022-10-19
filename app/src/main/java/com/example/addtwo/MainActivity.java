package com.example.addtwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText num1;
    private EditText num2;
    public Button add;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=findViewById(R.id.etNum1);
        num2=findViewById(R.id.etNum2);
        add=findViewById(R.id.btnAdd);
        result=findViewById(R.id.TextViewAns);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                int number1= Integer.parseInt(num1.getText().toString());
                int number2= Integer.parseInt(num2.getText().toString());
                int sum = number1+number2;
                result.setText("Answer : " + sum);
            }
        });
    }
}