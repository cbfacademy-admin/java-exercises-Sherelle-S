package com.cbfacademy;

public class ArithmeticExercises {
    float AddFloat(float operand1, float operand2){
        float addResult = operand1 + operand2;

        return addResult;
    }

    float SubtractFloat(float operand1, float operand2){
        float subtractResult = operand1 - operand2;
        return subtractResult;
    }

    float MultiplyFloat(float operand1, float operand2){
        float multiplyResult = operand1 * operand2;
        return multiplyResult;
    }

    float DivideFloat(float operand1, float operand2){
        float divideResult = operand1 / operand2;
        return divideResult;
    }

    double compareDouble(double operand3, double operand4){
        // double epsilon = 0.000001d;
        // double compareResult = (Math.abs(operand3 - operand4) < epsilon);
        // return 
        double total = operand3 - operand4;

        return total;
    }

    double higherDouble(double operand3, double operand4){
    double higherResult = Math.max(operand3, operand4);
    return higherResult;
    }

    double lowerDouble(double operand3, double operand4){
        double lowerResult = Math.min(operand3, operand4);
        return lowerResult;
    }

    int[] codingBlackFemales = new int [8];
    System.out.println(codingBlackFemales[4]);
    float[] codingBlackFemales2 = new float[12];
        System.out.println(codingBlackFemales2[4]);

    double[] codingBlackFemales3 = new double[5];
        System.out.println(codingBlackFemales3[4]);

    boolean[] codingBlackFemales4 = new boolean[6];
        System.out.println(codingBlackFemales4[4]);

        // write a code that initialises a matrix with the 4 arrays written above;

