import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        double num1 = input.nextDouble();

        System.out.println("Enter second number");
        double num2 = input.nextDouble();

        System.out.println("Choose operation: + - * /");
        char operation = input.next().charAt(0);

        double result ;
        if (operation == '+'){
            result = num1 + num2;
        } else if (operation == '-'){
            result = num1 - num2;
        } else if (operation == '*'){
            result = num1 * num2;
        } else if (operation == '/'){
            if (num2 != 0 ){
                result = num1 / num2;
            }  else {
                System.out.println("Error: Cannot divide by zero");
                input.close();
                return;
            }
        } else {
            System.out.println("Invalid operation");
            input.close();
            return;
        }

        System.out.println("Result: " + result);

        input.close();

    }
}
