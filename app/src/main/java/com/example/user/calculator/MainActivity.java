package com.example.user.calculator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button sum;
    private Button sub;
    private Button div;
    private Button mul;
    private Button num1;
    private Button num2;
    private Button num3;
    private Button num4;
    private Button num5;
    private Button num6;
    private Button num7;
    private Button num8;
    private Button num9;
    private Button num0;
    private Button spot;
    private Button equal;
    private EditText txt;
    private String counter;
    List<Character> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sum=findViewById(R.id.sum);
        sum.setOnClickListener(this);
        sub=findViewById(R.id.sub);
        sub.setOnClickListener(this);
        div=findViewById(R.id.div);
        div.setOnClickListener(this);
        txt=findViewById(R.id.txt);
        mul=findViewById(R.id.mul);
        mul.setOnClickListener(this);
        equal=findViewById(R.id.equal);
        equal.setOnClickListener(this);
        spot=findViewById(R.id.spot);
        spot.setOnClickListener(this);
        num0=findViewById(R.id.num0);
        num0.setOnClickListener(this);
        num1=findViewById(R.id.num1);
        num1.setOnClickListener(this);
        num2=findViewById(R.id.num2);
        num2.setOnClickListener(this);
        num3=findViewById(R.id.num3);
        num3.setOnClickListener(this);
        num4=findViewById(R.id.num4);
        num4.setOnClickListener(this);
        num5=findViewById(R.id.num5);
        num5.setOnClickListener(this);
        num6=findViewById(R.id.num6);
        num6.setOnClickListener(this);
        num7=findViewById(R.id.num7);
        num7.setOnClickListener(this);
        num8=findViewById(R.id.num8);
        num8.setOnClickListener(this);
        num9=findViewById(R.id.num9);
        num9.setOnClickListener(this);

    }

    private String getNums(List<Character> myList){
        for (char item:myList) {
            counter+=item;
        }
        return counter;
    }





    @Override
    public void onClick(View view) {

        int id=view.getId();

        switch (id){
            case R.id.num0: list.add('0');
            break;
            case R.id.num1: list.add('1');
                break;
            case R.id.num2: list.add('2');
                break;
            case R.id.num3: list.add('3');
                break;
            case R.id.num4: list.add('4');
                break;
            case R.id.num5: list.add('5');
                break;
            case R.id.num6: list.add('6');
                break;
            case R.id.num7: list.add('7');
                break;
            case R.id.num8: list.add('8');
                break;
            case R.id.num9: list.add('9');
                break;
        }

        txt.setText(getNums(list), TextView.BufferType.EDITABLE);



    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

}


//package com.example.user.calculator;
//
//import android.annotation.SuppressLint;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.text.TextUtils;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.Toast;
//
//public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//
//    private EditText number1;
//    private EditText number2;
//    private EditText equal;
//    private Button sum;
//    private Button sub;
//    private Button div;
//    private Button mul;
//    private String numb1;
//    private String numb2;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        number1=findViewById(R.id.number1);
//        number2=findViewById(R.id.number2);
//        equal=findViewById(R.id.equ);
//        sum=findViewById(R.id.sum);
//        sum.setOnClickListener(this);
//        sub=findViewById(R.id.sub);
//        sub.setOnClickListener(this);
//        div=findViewById(R.id.div);
//        div.setOnClickListener(this);
//        mul=findViewById(R.id.mul);
//        mul.setOnClickListener(this);
//    }
//
//    double sum(){
//        return Double.parseDouble(number1.getText().toString()) + Double.parseDouble(number2.getText().toString());
//    }
//
//    double sub(){
//        return Double.parseDouble(number1.getText().toString()) - Double.parseDouble(number2.getText().toString());
//    }
//
//    double div(){
//        return Double.parseDouble(number1.getText().toString()) / Double.parseDouble(number2.getText().toString());
//    }
//
//    double mul(){
//        return Double.parseDouble(number1.getText().toString()) * Double.parseDouble(number2.getText().toString());
//    }
//
//
//    @SuppressLint("SetTextI18n")
//    @Override
//    public void onClick(View view) {
//        int id=view.getId();
//
//        numb1=number1.getText().toString();
//        numb2=number2.getText().toString();
//
//        if (id==R.id.sum){
//            if (!TextUtils.isEmpty(numb1) && !TextUtils.isEmpty(numb2)){
//                if (sum()==(int)sum()){
//                    equal.setText(Integer.toString((int) sum()));
//                }else {
//                    equal.setText(Double.toString(sum()));
//                }
//
//            }else  Toast.makeText(MainActivity.this, "EditText is Empty", Toast.LENGTH_LONG).show();
//
//        }
//
//        if (id==R.id.sub){
//            if (!TextUtils.isEmpty(numb1) && !TextUtils.isEmpty(numb2)){
//                if (sub()==(int)sub()){
//                    equal.setText(Integer.toString((int) sub()));
//                }else {
//                    equal.setText(Double.toString(sub()));
//                }
//
//            }else  Toast.makeText(MainActivity.this, "EditText is Empty", Toast.LENGTH_LONG).show();
//
//        }
//
//        if (id==R.id.div){
//            if (!TextUtils.isEmpty(numb1) && !TextUtils.isEmpty(numb2)){
//                if (div()==(int)div()){
//                    equal.setText(Integer.toString((int) div()));
//                }else {
//                    equal.setText(Double.toString(div()));
//                }
//
//            }else  Toast.makeText(MainActivity.this, "EditText is Empty", Toast.LENGTH_LONG).show();
//        }
//
//        if (id==R.id.mul){
//            if (!TextUtils.isEmpty(numb1) && !TextUtils.isEmpty(numb2)){
//                if (mul()==(int)mul()){
//                    equal.setText(Integer.toString((int) mul()));
//                }else {
//                    equal.setText(Double.toString(mul()));
//                }
//
//            }else  Toast.makeText(MainActivity.this, "EditText is Empty", Toast.LENGTH_LONG).show();
//        }
//
//    }
//
//    @Override
//    public void onPointerCaptureChanged(boolean hasCapture) {
//
//    }
//
//}