package poo;

public class Calculator {
    public final float PI = 3.14F;
    public double sum(int num1, int num2){
        return num1 + num2;
    }

    public double rest(int num1, int num2){
        return num1 - num2;
    }

    public double mul(int num1, int num2){
        return num1 * num2;
    }

    public double div(int num1, int num2){
        return (double) num1 / num2;
    }
}
