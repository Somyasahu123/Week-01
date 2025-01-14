import java.util.Scanner;

class Height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input for Amar, Akbar, and Anthony's ages and heights
        System.out.print("Enter Amar's age: ");
        int amarAge = sc.nextInt();
        System.out.print("Enter Amar's height: ");
        double amarHeight = sc.nextDouble();
        
        System.out.print("Enter Akbar's age: ");
        int akbarAge = sc.nextInt();
        System.out.print("Enter Akbar's height: ");
        double akbarHeight = sc.nextDouble();
        
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = sc.nextInt();
        System.out.print("Enter Anthony's height: ");
        double anthonyHeight = sc.nextDouble();
        
        // Find the youngest friend
        int youngestAge = Math.min(Math.min(amarAge, akbarAge), anthonyAge);
        String youngest = (youngestAge == amarAge) ? "Amar" : (youngestAge == akbarAge) ? "Akbar" : "Anthony";
        
        // Find the tallest friend
        double tallestHeight = Math.max(Math.max(amarHeight, akbarHeight), anthonyHeight);
        String tallest = (tallestHeight == amarHeight) ? "Amar" : (tallestHeight == akbarHeight) ? "Akbar" : "Anthony";
        
        // Output the results
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);
        
        // Close the scanner
        sc.close();
    }
}
