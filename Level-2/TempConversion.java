import java.util.Scanner;

class TempConversion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking temperature in Celsius from user
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        // Converting to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Print the result
        System.out.println("The " + celsius + " celsius is " + fahrenheit + " fahrenheit");
    }
}
