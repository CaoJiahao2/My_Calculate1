package com.example.my_calculate;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn_0,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_dot,btn_sum,btn_sub,btn_mult,btn_div,btn_clr,btn_equ;
    private TextView calc_result;
    private Boolean isClickequ = false;
    private double num1 = 0,num2 = 0,reslut = 0 ;
    private String op = "";
    private String strnum1,strnum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calc_result = findViewById(R.id.result);
        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_dot = findViewById(R.id.btn_dot);
        btn_sum = findViewById(R.id.btn_add);
        btn_sub = findViewById(R.id.btn_sub);
        btn_mult = findViewById(R.id.btn_mul);
        btn_div = findViewById(R.id.btn_cu);
        btn_clr = findViewById(R.id.btn_c);
        btn_equ = findViewById(R.id.btn_equ);

        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_dot.setOnClickListener(this);
        btn_sum.setOnClickListener(this);
        btn_sub.setOnClickListener(this);
        btn_mult.setOnClickListener(this);
        btn_div.setOnClickListener(this);
        btn_clr.setOnClickListener(this);
        btn_equ.setOnClickListener(this);
    }

    @Override
    public void onClick(@NonNull View view) {
        switch (view.getId()) {
            case R.id.btn_0:
                if (isClickequ) {
                    calc_result.setText("");
                    isClickequ = false;
                }
                calc_result.setText(calc_result.getText().toString() + "0");
                break;
            case R.id.btn_1:
                if (isClickequ) {
                    calc_result.setText("");
                    isClickequ = false;
                }
                calc_result.setText(calc_result.getText().toString() + "1");
                break;
            case R.id.btn_2:
                if (isClickequ) {
                    calc_result.setText("");
                    isClickequ = false;
                }
                calc_result.setText(calc_result.getText().toString() + "2");
                break;
            case R.id.btn_3:
                if (isClickequ) {
                    calc_result.setText("");
                    isClickequ = false;
                }
                calc_result.setText(calc_result.getText().toString() + "3");
                break;
            case R.id.btn_4:
                if (isClickequ) {
                    calc_result.setText("");
                    isClickequ = false;
                }
                calc_result.setText(calc_result.getText().toString() + "4");
                break;
            case R.id.btn_5:
                if (isClickequ) {
                    calc_result.setText("");
                    isClickequ = false;
                }
                calc_result.setText(calc_result.getText().toString() + "5");
                break;
            case R.id.btn_6:
                if (isClickequ) {
                    calc_result.setText("");
                    isClickequ = false;
                }
                calc_result.setText(calc_result.getText().toString() + "6");
                break;
            case R.id.btn_7:
                if (isClickequ) {
                    calc_result.setText("");
                    isClickequ = false;
                }
                calc_result.setText(calc_result.getText().toString() + "7");
                break;
            case R.id.btn_8:
                if (isClickequ) {
                    calc_result.setText("");
                    isClickequ = false;
                }
                calc_result.setText(calc_result.getText().toString() + "8");
                break;
            case R.id.btn_9:
                if (isClickequ) {
                    calc_result.setText("");
                    isClickequ = false;
                }
                calc_result.setText(calc_result.getText().toString() + "9");
                break;
            case R.id.btn_c:
                if (isClickequ) {
                    calc_result.setText("");
                    isClickequ = false;
                }
                calc_result.setText("");
                break;
            case R.id.btn_dot:
                if (isClickequ) {
                    calc_result.setText("");
                    isClickequ = false;
                }
                calc_result.setText(calc_result.getText().toString() + ".");
                break;
            case R.id.btn_add:
                strnum1 = calc_result.getText().toString();
                if (strnum1.equals("")) {
                    break;
                }
                num1 = Double.parseDouble(strnum1);
                calc_result.setText("");
                op = "+";
                isClickequ = false;
            case R.id.btn_sub:
                strnum1 = calc_result.getText().toString();
                if (strnum1.equals("")) {
                    break;
                }
                num1 = Double.parseDouble(strnum1);
                calc_result.setText("");
                op = "-";
                isClickequ = false;
            case R.id.btn_mul:
                strnum1 = calc_result.getText().toString();
                if (strnum1.equals("")) {
                    break;
                }
                num1 = Double.parseDouble(strnum1);
                calc_result.setText("");
                op = "*";
                isClickequ = false;
            case R.id.btn_cu:
                strnum1 = calc_result.getText().toString();
                if (strnum1.equals("")) {
                    break;
                }
                num1 = Double.parseDouble(strnum1);
                calc_result.setText("");
                op = "/";
                isClickequ = false;
            case R.id.btn_equ:
                strnum2 = calc_result.getText().toString();
                if (strnum2.equals("")) {
                    break;
                }
                num2 = Double.parseDouble(strnum2);
                calc_result.setText("");
                switch (op) {
                    case "+":
                        reslut = num1 + num2;
                        break;
                    case "-":
                        reslut = num1 - num2;
                        break;
                    case "*":
                        reslut = num1 * num2;
                        break;
                    case "/":
                        if (num2 == 0) {
                            break;
                        }
                        reslut = num1 / num2;
                        break;
                    default:
                        reslut = 0.0;
                        break;
                }
                calc_result.setText(reslut + "");
                op = "";
                isClickequ = true;
        }
    }
}