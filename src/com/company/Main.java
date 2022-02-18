package com.company;

class Calculator implements Addition{

    // implementing method from interface
    @Override
    public void add(int num1, int num2){

        int sum = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + sum);
    }
}

// declaring addition interface
interface Addition{

    // initializing sum field
    int sum = 0;

    //declaring add method with no body
    void add(int num1, int num2);
}


public class Main {

    public static void main(String[] args) {

        // instantiating class
	Calculator cal = new Calculator();
        cal.add(10,20);

    }
}
