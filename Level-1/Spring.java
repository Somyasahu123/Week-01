import java.util.Scanner;

class Spring{
    // Method to check if the date is in Spring season
    public static boolean SpringSeason(int month, int day) {
        return (month > 3 || (month == 3 && day >= 20)) && (month < 6 || (month == 6 && day <= 20));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input month and day
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        
        System.out.print("Enter day (1-31): ");
        int day = sc.nextInt();
        
        // Check if it's spring season
        if (SpringSeason(month, day)) {
            System.out.println("It's Spring Season!");
        } else {
            System.out.println("It's not Spring Season.");
        }
        
        sc.close();
    }
}
