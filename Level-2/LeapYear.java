import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Input user for the year
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        
        // Check if year is >= 1582 (Gregorian calendar)
        if (year >= 1582) {
            // Check if year is divisible by 4 but not 100, or divisible by 400
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            System.out.println("Year should be >= 1582 for Gregorian calendar.");
        }
        
        // Close the scanner
        sc.close();
    }
}
