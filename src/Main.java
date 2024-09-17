//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("~~~~~~~~~~~~~~~~WELCOME TO MY CALCULATOR~~~~~~~~~~~~~~~~" + "\n");
        System.out.println("input your first number: " + "\n");
        double firstNumber = myObj.nextDouble();
        System.out.println("input your second number: " + "\n");
        double secondNumber = myObj.nextDouble();


        myObj.nextLine();
        System.out.println("input your symbol IN TEXT add,subtract,divide or multiply: " + "\n");
        String symbol = myObj.nextLine();

        switch (symbol) {
            case "add":
            case "subtract":
            case "multiply":
            case "divide":
                System.out.println(Mather.calculate(firstNumber, secondNumber, symbol));
                break;
            default:
                System.out.println("enter valid input: add, subtract, divide, or multiply");
                break;
        }
    }
}