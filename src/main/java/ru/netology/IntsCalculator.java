package ru.netology;

public class IntsCalculator implements Ints {

    protected final Calculator calculator;

    public IntsCalculator() {
        this.calculator = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        return arg0 + arg1;
    }

    @Override
    public int mult(int arg0, int arg1) {
        return arg0 * arg1;
    }

    @Override
    public double pow(int a, int b) {
        return Math.pow(a, b);
    }
}
