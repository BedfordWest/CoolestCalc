package com.fdg.bedford.coolestcalculator.calculator;

/**
 * Created by Bedford on 8/13/2014.
 */
public class CalcNumber {

    private double calc_number = 0;
    private String calcDisplay = "0";
    public enum operations {PLUS, MINUS, DIVIDE, MULTIPLY}
    private operations previous_operation = operations.PLUS;
    private boolean JUST_OPERATED = false;

    public String getCalcDisplay()
    {
        return calcDisplay;
    }

    public void setCalcDisplay(String setString)
    {
        calcDisplay = setString;
        return;
    }

    public void concatCalcDisplay(String concatString)
    {
        calcDisplay = calcDisplay.concat(concatString);
        return;
    }

    public void deleteCalcChar()
    {
        return;
    }

    public void clearCalcDisplay()
    {
        calcDisplay = "0";
        calc_number = 0;
        return;
    }

    public double getCalcNumber()
    {
        return calc_number;
    }

    public void setCalcNumber(double x)
    {
        calc_number = x;
        return;
    }

    public void setOperatingFlag(boolean t_or_f)
    {
        JUST_OPERATED = t_or_f;
        return;
    }

    public boolean getOperatingFlag()
    {
        return JUST_OPERATED;
    }

    public void setPreviousOperation(operations this_operation) {
        previous_operation = this_operation;
        JUST_OPERATED = true;
        return;
    }

    public void runPreviousOperation()
    {
        double operation_number = Double.parseDouble(calcDisplay);

        switch(previous_operation) {
            case PLUS:
                calc_number += operation_number;
                break;
            case MINUS:
                calc_number -= operation_number;
                break;
            case DIVIDE:
                calc_number /= operation_number;
                break;
            case MULTIPLY:
                calc_number *= operation_number;
                break;
            default:
                break;
        }

        if (calc_number == (int)calc_number)
            calcDisplay = String.valueOf((int)calc_number);
        else
            calcDisplay = String.valueOf(calc_number);

    }

}
