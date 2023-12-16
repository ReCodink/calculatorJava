import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double numOne, numTwo;
        char operator;

        System.out.println("Masukkan angka pertama: ");
        numOne = scan.nextDouble();
        System.out.println("Masukkan operator (+, -, *, /): ");
        operator = scan.next().charAt(0);
        System.out.println("Masukkan angka kedua: ");
        numTwo = scan.nextDouble();

        double result = calculate(numOne, numTwo, operator);
        System.out.println("Hasil: " + result);
    }

    public static double calculate(double numOne, double numTwo, char operator) {
        double result = 0;

        switch (operator) {
            case '+':
                result = numOne + numTwo;
                break;
            case '-':
                result = numOne - numTwo;
                break;
            case '*':
                result = numOne * numTwo;
                break;
            case '/':
                if (numTwo != 0) {
                    result = numOne / numTwo;
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak dapat dilakukan");
                }
                break;
            default:
                System.out.println("Error: Operator tidak valid");
        }
        return result;
    }
}
