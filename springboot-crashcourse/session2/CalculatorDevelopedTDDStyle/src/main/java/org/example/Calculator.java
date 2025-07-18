package org.example;

public class Calculator {
    public boolean status = false;

    public boolean isOn(){
        return status;
    }

    public void turnOn(){
         status = true;
    }

    public void turnOff(){
        status = false;
    }

    public boolean isOff(){
        return !status;
    }


    //Addition

    public int sum(int num1, int num2){
        return num1 + num2;
    }

    public Long sum(long num1, long num2){
        return num1 + num2;
    }

    public short sum(short num1, short num2){
        return (short) (num1 + num2);
    }

    public float sum(float num1, float num2){
        return num1 + num2;
    }

    public double sum(double num1, double num2){
        return num1 + num2;
    }

    //Difference

    public int difference(int num1, int num2){
        return num1 - num2;
    }

    public Long difference(long num1, long num2){
        return num1 - num2;
    }

    public short difference(short num1, short num2){
        return (short) (num1 - num2);
    }

    public float difference(float num1, float num2){
        return num1 - num2;
    }

    public double difference(double num1, double num2){
        return num1 - num2;
    }

    //Multiplication

    public int product(int num1, int num2){
        return num1 * num2;
    }

    public Long product(long num1, long num2){
        return num1 * num2;
    }

    public short product(short num1, short num2){
        return (short) (num1 * num2);
    }

    public float product(float num1, float num2){
        return num1 * num2;
    }

    public double product(double num1, double num2){
        return num1 * num2;
    }

    //Division

    public int quotient(int num1, int num2){
        if (num1 == 0 && num2 == 0){
             System.out.println("Invalid Input.");
        }
            return num1/num2;

    }

    public short quotient(short num1, short num2){
        if (num1 == 0 && num2 == 0){
            System.out.println("Invalid Input.");
        }
            return (short) (num1/num2);

    }

    public Long quotient(long num1, long num2){
        if (num1 == 0 && num2 == 0){
            System.out.println("Invalid Input.");
        }
            return num1/num2;

    }

    public float quotient(float num1, float num2){
        if (num1 == 0 && num2 == 0){
            System.out.println("Invalid Input.");
        }
            return num1/num2;

    }

    public double quotient(double num1, double num2){
        if (num1 == 0 && num2 == 0){
            System.out.println("Invalid Input.");
        }
            return num1/num2;

    }
}
