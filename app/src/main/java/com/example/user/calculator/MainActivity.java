package com.example.user.calculator;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
    private Button reset;
    private EditText txt;
    private String nextNum;
    private String midSumCounter;
    private String midSubCounter;
    private String midDivCounter;
    private String midMulCounter;
    private List<Character> list = new ArrayList<>();
    private List<String> list2 = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sum = findViewById(R.id.sum);
        sum.setOnClickListener(this);
        sub = findViewById(R.id.sub);
        sub.setOnClickListener(this);
        div = findViewById(R.id.div);
        div.setOnClickListener(this);
        txt = findViewById(R.id.txt);
        mul = findViewById(R.id.mul);
        mul.setOnClickListener(this);
        equal = findViewById(R.id.equal);
        equal.setOnClickListener(this);
        reset = findViewById(R.id.reset);
        reset.setOnClickListener(this);
        spot = findViewById(R.id.spot);
        spot.setOnClickListener(this);
        num0 = findViewById(R.id.num0);
        num0.setOnClickListener(this);
        num1 = findViewById(R.id.num1);
        num1.setOnClickListener(this);
        num2 = findViewById(R.id.num2);
        num2.setOnClickListener(this);
        num3 = findViewById(R.id.num3);
        num3.setOnClickListener(this);
        num4 = findViewById(R.id.num4);
        num4.setOnClickListener(this);
        num5 = findViewById(R.id.num5);
        num5.setOnClickListener(this);
        num6 = findViewById(R.id.num6);
        num6.setOnClickListener(this);
        num7 = findViewById(R.id.num7);
        num7.setOnClickListener(this);
        num8 = findViewById(R.id.num8);
        num8.setOnClickListener(this);
        num9 = findViewById(R.id.num9);
        num9.setOnClickListener(this);

    }


    private String sum() {
        return Double.toString(Double.parseDouble(midSumCounter) + Double.parseDouble(nextNum));
    }


    private String sub() {
        return Double.toString(Double.parseDouble(midSubCounter) - Double.parseDouble(nextNum));
    }


    private String div() {
        return Double.toString(Double.parseDouble(midDivCounter) / Double.parseDouble(nextNum));
    }


    private String mul() {
        return Double.toString(Double.parseDouble(midMulCounter) * Double.parseDouble(nextNum));
    }


    private List<String> getNums() {

        for (Character item : list) {
            list2.add(item.toString());
        }
        return list2;
    }

    private String listToString() {
        return TextUtils.join("", getNums());
    }


    private void reset() {
        getNums().clear();
    }

    private void equal() {
        if (!midSumCounter.isEmpty()) {
            nextNum = listToString();
            getNums().clear();
            getNums().add(sum());
        }

        if (!midSubCounter.isEmpty()) {
            nextNum = listToString();
            getNums().clear();
            getNums().add(sub());
        }

        if (!midDivCounter.isEmpty()) {
            nextNum = listToString();
            getNums().clear();
            getNums().add(div());
        }

        if (!midMulCounter.isEmpty()) {
            nextNum = listToString();
            getNums().clear();
            getNums().add(mul());
        }
    }


    @Override
    public void onClick(View view) {

        int id = view.getId();

        switch (id) {
            case R.id.num0:
                list.add('0');
                break;
            case R.id.num1:
                list.add('1');
                break;
            case R.id.num2:
                list.add('2');
                break;
            case R.id.num3:
                list.add('3');
                break;
            case R.id.num4:
                list.add('4');
                break;
            case R.id.num5:
                list.add('5');
                break;
            case R.id.num6:
                list.add('6');
                break;
            case R.id.num7:
                list.add('7');
                break;
            case R.id.num8:
                list.add('8');
                break;
            case R.id.num9:
                list.add('9');
                break;

            case R.id.equal:
                equal();
                break;

            case R.id.reset:
                reset();
                break;

            case R.id.sum:
                midSubCounter= "";
                midDivCounter= "";
                midMulCounter= "";
                midSumCounter = txt.getText().toString();
                getNums().clear();
                break;

            case R.id.sub:
                midSumCounter = "";
                midDivCounter= "";
                midMulCounter= "";
                midSubCounter = txt.getText().toString();
                getNums().clear();
                break;

            case R.id.div:
                midSumCounter = "";
                midSubCounter= "";
                midMulCounter= "";
                midDivCounter = txt.getText().toString();
                getNums().clear();
                break;

            case R.id.mul:
                midSumCounter = "";
                midSubCounter= "";
                midDivCounter= "";
                midMulCounter = txt.getText().toString();
                getNums().clear();
                break;
        }

        txt.setText(listToString());
        list.clear();
    }

}

