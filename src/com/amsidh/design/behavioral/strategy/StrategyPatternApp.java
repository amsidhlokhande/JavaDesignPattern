package com.amsidh.design.behavioral.strategy;

/*
A Strategy Pattern says that "defines a family of functionality, encapsulate each one, and make them interchangeable".

The Strategy Pattern is also known as Policy.
Benefits:

    It provides a substitute to subclassing.
    It defines each behavior within its own class, eliminating the need for conditional statements.
    It makes it easier to extend and incorporate new behavior without changing the application.

Usage:

    When the multiple classes differ only in their behaviors.e.g. Servlet API.
    It is used when you need different variations of an algorithm.

 */
public class StrategyPatternApp {
    public static void main(String[] args) {
        CalculatorContext calculatorContext = new CalculatorContext(new Addition());
        calculatorContext.executeStrategy(12, 34);

        calculatorContext = new CalculatorContext(new Substraction());
        calculatorContext.executeStrategy(35, 10);

        calculatorContext = new CalculatorContext(new Multipication());
        calculatorContext.executeStrategy(12, 34);

        calculatorContext = new CalculatorContext(new Division());
        calculatorContext.executeStrategy(12, 4);
    }
}


interface CalculatorStrategy {
    void calculate(float a, float b);
}

class Addition implements CalculatorStrategy {

    @Override
    public void calculate(float a, float b) {
        System.out.println("Addition of " + a + " and " + b + " = " + (a + b));
    }
}


class Substraction implements CalculatorStrategy {

    @Override
    public void calculate(float a, float b) {
        System.out.println("Substraction of " + a + " and " + b + " = " + (a - b));
    }
}

class Multipication implements CalculatorStrategy {

    @Override
    public void calculate(float a, float b) {
        System.out.println("Multipication of " + a + " and " + b + " = " + (a * b));
    }
}

class Division implements CalculatorStrategy {

    @Override
    public void calculate(float a, float b) {
        System.out.println("Division of " + a + " and " + b + " = " + (a / b));
    }
}

class CalculatorContext {
    CalculatorStrategy calculatorStrategy;

    public CalculatorContext(CalculatorStrategy calculatorStrategy) {
        this.calculatorStrategy = calculatorStrategy;
    }

    public void executeStrategy(float a, float b) {
        calculatorStrategy.calculate(a, b);
    }
}