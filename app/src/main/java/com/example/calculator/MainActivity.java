package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void addition(View view) {
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);

        String str1 = firstNumber.getText().toString();
        String str2 = secondNumber.getText().toString();

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        String output = String.valueOf(num1 + num2);

        goToOutput(output);
    }

    public void subtraction(View view) {
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);

        String str1 = firstNumber.getText().toString();
        String str2 = secondNumber.getText().toString();

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        String output = String.valueOf(num1 - num2);

        goToOutput(output);
    }

    public void multiplication(View view) {
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);

        String str1 = firstNumber.getText().toString();
        String str2 = secondNumber.getText().toString();

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        String output = String.valueOf(num1 * num2);

        goToOutput(output);
    }

    public void division(View view) {
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);

        String str1 = firstNumber.getText().toString();
        String str2 = secondNumber.getText().toString();

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        String output = String.valueOf(num1 / num2);

        goToOutput(output);
    }

    private void goToOutput(String i) {
        Intent intent = new Intent(this, Output.class);
        intent.putExtra("number", i);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}