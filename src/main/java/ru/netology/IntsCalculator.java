package ru.netology;

public class IntsCalculator implements Ints {

    private final Calculator calculator;
    private double calc;

    public IntsCalculator() {
        this.calculator = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        calc = calculator.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result();
        return (int) calc;
    }

    @Override
    public int mult(int arg0, int arg1) {
        calc = calculator.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result();
        return (int) calc;
    }

    @Override
    public double pow(int a, int b) {
        calc = calculator.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result();
        return calc;
    }
}
