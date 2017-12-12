package com.example.user.calculator;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText number1;
    private EditText number2;
    private EditText equal;
    private Button sum;
    private Button sub;
    private Button div;
    private Button mul;
    private String numb1;
    private String numb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1=findViewById(R.id.number1);
        number2=findViewById(R.id.number2);
        equal=findViewById(R.id.equ);
        sum=findViewById(R.id.sum);
        sum.setOnClickListener(this);
        sub=findViewById(R.id.sub);
        sub.setOnClickListener(this);
        div=findViewById(R.id.div);
        div.setOnClickListener(this);
        mul=findViewById(R.id.mul);
        mul.setOnClickListener(this);
    }

    double sum(){
        return Double.parseDouble(number1.getText().toString()) + Double.parseDouble(number2.getText().toString());
    }

    double sub(){
        return Double.parseDouble(number1.getText().toString()) - Double.parseDouble(number2.getText().toString());
    }

    double div(){
        return Double.parseDouble(number1.getText().toString()) / Double.parseDouble(number2.getText().toString());
    }

    double mul(){
        return Double.parseDouble(number1.getText().toString()) * Double.parseDouble(number2.getText().toString());
    }


    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View view) {
        int id=view.getId();

        numb1=number1.getText().toString();
        numb2=number2.getText().toString();

        if (id==R.id.sum){
            if (!TextUtils.isEmpty(numb1) && !TextUtils.isEmpty(numb2)){
                if (sum()==(int)sum()){
                    equal.setText(Integer.toString((int) sum()));
                }else {
                    equal.setText(Double.toString(sum()));
                }

            }else  Toast.makeText(MainActivity.this, "EditText is Empty", Toast.LENGTH_LONG).show();

        }

        if (id==R.id.sub){
            if (!TextUtils.isEmpty(numb1) && !TextUtils.isEmpty(numb2)){
                if (sub()==(int)sub()){
                    equal.setText(Integer.toString((int) sub()));
                }else {
                    equal.setText(Double.toString(sub()));
                }

            }else  Toast.makeText(MainActivity.this, "EditText is Empty", Toast.LENGTH_LONG).show();

        }

        if (id==R.id.div){
            if (!TextUtils.isEmpty(numb1) && !TextUtils.isEmpty(numb2)){
                if (div()==(int)div()){
                    equal.setText(Integer.toString((int) div()));
                }else {
                    equal.setText(Double.toString(div()));
                }

            }else  Toast.makeText(MainActivity.this, "EditText is Empty", Toast.LENGTH_LONG).show();
        }

        if (id==R.id.mul){
            if (!TextUtils.isEmpty(numb1) && !TextUtils.isEmpty(numb2)){
                if (mul()==(int)mul()){
                    equal.setText(Integer.toString((int) mul()));
                }else {
                    equal.setText(Double.toString(mul()));
                }

            }else  Toast.makeText(MainActivity.this, "EditText is Empty", Toast.LENGTH_LONG).show();
        }

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

}