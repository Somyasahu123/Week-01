import java.util.Scanner;
class TotalPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take user input for unit price and quantity
        System.out.print("Enter the unit price of the item: ");
        double unitPrice = sc.nextDouble();
        
        System.out.print("Enter the quantity of the item: ");
        int quantity = sc.nextInt();
        
        // Calculate the total purchase price
        double totalPrice = unitPrice * quantity;
        
        // Output
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " +unitPrice);
    }
}

