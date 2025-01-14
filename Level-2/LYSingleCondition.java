import java.util.Scanner;

class LYSingleCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //user for the year
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        
        // Check if year is >= 1582 and check leap year conditions using logical operators
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " is a Leap Year.");
        } else if (year >= 1582) {
            System.out.println(year + " is not a Leap Year.");
        } else {
            System.out.println("Year should be >= 1582 for Gregorian calendar.");
        }
        
        // Close the scanner
        sc.close();
    }
}
