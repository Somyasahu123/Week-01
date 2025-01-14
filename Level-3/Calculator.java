import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input first number, second number, and operator
        System.out.print("Enter first number: ");
        double first = sc.nextDouble();
        
        System.out.print("Enter second number: ");
        double second = sc.nextDouble();
        
        System.out.print("Enter operator (+, -, *, /): ");
        String operator = sc.next();
        
        // Use switch...case to perform the operation
        double result = 0;
        boolean validOperator = true;
        
        switch (operator) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                } else {
                    validOperator = false;
                    System.out.println("Cannot divide by zero!");
                }
                break;
            default:
                validOperator = false;
                System.out.println("Invalid operator!");
        }
        
        // Print the result if the operator was valid
        if (validOperator) {
            System.out.println("Result: " + result);
        }
        
        // Close the scanner
        sc.close();
    }
}
