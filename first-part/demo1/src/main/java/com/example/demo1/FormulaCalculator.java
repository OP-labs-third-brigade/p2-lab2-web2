package com.example.demo1;
import java.lang.Math;

public class FormulaCalculator {

    public double firstFormula(double a, double b, double c, double d) {
        return Math.pow((2 * Math.sin(a) + Math.cos(Math.abs(b * Math.sqrt(c)))), d);
    }

    public double secondFormula(double a, double b, double c, double d) {
        return ((Math.log1p(Math.abs(2 * a))) / (3 * Math.tan(b))) - (Math.sqrt((c) / (Math.sqrt(Math.abs(d)))));
    }

    public double thirdFormula(double a, double b, double c, double d) {
        return ((5 * c) / (Math.cos(a))) + (Math.sqrt((Math.sinh(Math.abs(b) * c)) / Math.tan(d)));
    }
}