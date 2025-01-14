import java.util.Scanner;

class Spring{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //user for month and day
        System.out.print("Enter the month (1-12): ");
        int month = sc.nextInt();
        
        System.out.print("Enter the day: ");
        int day = sc.nextInt();
        
        // Check if the date is in the Spring season
        if ((month == 3 && day >= 20) || (month >= 4 && month <= 6 && day <= 20)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
        
        // Close the scanner
        sc.close();
    }
}
