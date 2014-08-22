package com.fdg.bedford.coolestcalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.fdg.bedford.coolestcalculator.calculator.CalcNumber;

public class MyActivity extends Activity implements View.OnClickListener {

    CalcNumber calcNumber = new CalcNumber();

    private ImageView button_0;
    private ImageView button_1;
    private ImageView button_2;
    private ImageView button_3;
    private ImageView button_4;
    private ImageView button_5;
    private ImageView button_6;
    private ImageView button_7;
    private ImageView button_8;
    private ImageView button_9;
    private ImageView button_plus;
    private ImageView button_minus;
    private ImageView button_divide;
    private ImageView button_multiply;
    private ImageView button_clear;
    private ImageView button_dot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        button_0 = (ImageView)findViewById(R.id.button_zero);
        button_2 = (ImageView)findViewById(R.id.button_two);
        button_3 = (ImageView)findViewById(R.id.button_three);
        button_4 = (ImageView)findViewById(R.id.button_four);
        button_5 = (ImageView)findViewById(R.id.button_five);
        button_6 = (ImageView)findViewById(R.id.button_six);
        button_7 = (ImageView)findViewById(R.id.button_seven);
        button_8 = (ImageView)findViewById(R.id.button_eight);
        button_9 = (ImageView)findViewById(R.id.button_nine);
        button_1 = (ImageView)findViewById(R.id.button_one);
        button_plus = (ImageView)findViewById(R.id.button_plus);
        button_minus = (ImageView)findViewById(R.id.button_minus);
        button_divide = (ImageView)findViewById(R.id.button_divide);
        button_multiply = (ImageView)findViewById(R.id.button_times);
        button_clear = (ImageView)findViewById(R.id.button_clear);
        button_dot = (ImageView) findViewById(R.id.button_dot);

        button_0.setOnClickListener(this);
        button_1.setOnClickListener(this);
        button_2.setOnClickListener(this);
        button_3.setOnClickListener(this);
        button_4.setOnClickListener(this);
        button_5.setOnClickListener(this);
        button_6.setOnClickListener(this);
        button_7.setOnClickListener(this);
        button_8.setOnClickListener(this);
        button_9.setOnClickListener(this);
        button_plus.setOnClickListener(this);
        button_minus.setOnClickListener(this);
        button_divide.setOnClickListener(this);
        button_multiply.setOnClickListener(this);
        button_clear.setOnClickListener(this);
        button_dot.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        TextView numberDisplay = (TextView) findViewById( R.id.number_display);

        //should use switch(v.getId()) and case R.id._____ instead
        if(v==button_0) {
            if (calcNumber.getCalcDisplay().equals("0") || calcNumber.getOperatingFlag() == true)
            {
                calcNumber.setCalcDisplay("0");
                calcNumber.setOperatingFlag(false);
            }
            else
                calcNumber.concatCalcDisplay("0");

            numberDisplay.setText(calcNumber.getCalcDisplay());


        }

        else if(v==button_1)
        {

            if(calcNumber.getCalcDisplay().equals("0") || calcNumber.getOperatingFlag() == true) {
                calcNumber.setCalcDisplay("1");
                calcNumber.setOperatingFlag(false);
            }
            else
                calcNumber.concatCalcDisplay("1");

            numberDisplay.setText(calcNumber.getCalcDisplay());

        }

        else if(v==button_2)
        {
            if(calcNumber.getCalcDisplay().equals("0") || calcNumber.getOperatingFlag() == true) {
                calcNumber.setCalcDisplay("2");
                calcNumber.setOperatingFlag(false);
            }
            else
                calcNumber.concatCalcDisplay("2");

            numberDisplay.setText(calcNumber.getCalcDisplay());

        }

        else if(v==button_3)
        {
            if(calcNumber.getCalcDisplay().equals("0") || calcNumber.getOperatingFlag() == true) {
                calcNumber.setCalcDisplay("3");
                calcNumber.setOperatingFlag(false);
            }
            else
                calcNumber.concatCalcDisplay("3");

            numberDisplay.setText(calcNumber.getCalcDisplay());

        }

        else if(v==button_4)
        {
            if(calcNumber.getCalcDisplay().equals("0") || calcNumber.getOperatingFlag() == true) {
                calcNumber.setCalcDisplay("4");
                calcNumber.setOperatingFlag(false);
            }
            else
                calcNumber.concatCalcDisplay("4");

            numberDisplay.setText(calcNumber.getCalcDisplay());

        }

        else if(v==button_5)
        {
            if(calcNumber.getCalcDisplay().equals("0") || calcNumber.getOperatingFlag() == true) {
                calcNumber.setCalcDisplay("5");
                calcNumber.setOperatingFlag(false);
            }
            else
                calcNumber.concatCalcDisplay("5");

            numberDisplay.setText(calcNumber.getCalcDisplay());

        }

        else if(v==button_6)
        {
            if(calcNumber.getCalcDisplay().equals("0") || calcNumber.getOperatingFlag() == true) {
                calcNumber.setCalcDisplay("6");
                calcNumber.setOperatingFlag(false);
            }
            else
                calcNumber.concatCalcDisplay("6");

            numberDisplay.setText(calcNumber.getCalcDisplay());

        }

        else if(v==button_7)
        {
            if(calcNumber.getCalcDisplay().equals("0") || calcNumber.getOperatingFlag() == true) {
                calcNumber.setCalcDisplay("7");
                calcNumber.setOperatingFlag(false);
            }
            else
                calcNumber.concatCalcDisplay("7");

            numberDisplay.setText(calcNumber.getCalcDisplay());

        }

        else if(v==button_8)
        {
            if(calcNumber.getCalcDisplay().equals("0") || calcNumber.getOperatingFlag() == true) {
                calcNumber.setCalcDisplay("8");
                calcNumber.setOperatingFlag(false);
            }
            else
                calcNumber.concatCalcDisplay("8");

            numberDisplay.setText(calcNumber.getCalcDisplay());

        }

        else if(v==button_9)
        {
            if(calcNumber.getCalcDisplay().equals("0") || calcNumber.getOperatingFlag() == true) {
                calcNumber.setCalcDisplay("9");
                calcNumber.setOperatingFlag(false);
            }
            else
                calcNumber.concatCalcDisplay("9");

            numberDisplay.setText(calcNumber.getCalcDisplay());

        }

        else if (v==button_dot)
        {
            if(!calcNumber.getCalcDisplay().contains(".")) {
                calcNumber.concatCalcDisplay(".");
                numberDisplay.setText(calcNumber.getCalcDisplay());
                calcNumber.setOperatingFlag(false);
            }
        }

        else if (v==button_clear)
        {
            calcNumber.clearCalcDisplay();
            numberDisplay.setText(calcNumber.getCalcDisplay());
            calcNumber.setOperatingFlag(false);
        }

        else if (v==button_plus)
        {
            calcNumber.runPreviousOperation();
            numberDisplay.setText(calcNumber.getCalcDisplay());
            calcNumber.setPreviousOperation(CalcNumber.operations.PLUS);
        }

        else if (v==button_minus)
        {
            calcNumber.runPreviousOperation();
            numberDisplay.setText(calcNumber.getCalcDisplay());
            calcNumber.setPreviousOperation(CalcNumber.operations.MINUS);
        }

        else if (v==button_divide)
        {
            calcNumber.runPreviousOperation();
            numberDisplay.setText(calcNumber.getCalcDisplay());
            calcNumber.setPreviousOperation(CalcNumber.operations.DIVIDE);
        }

        else if (v==button_multiply)
        {
            calcNumber.runPreviousOperation();
            numberDisplay.setText(calcNumber.getCalcDisplay());
            calcNumber.setPreviousOperation(CalcNumber.operations.MULTIPLY);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.my, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case R.id.action_search:
                //openSearch();
                return true;
            case R.id.action_settings:
                //openSettings();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
