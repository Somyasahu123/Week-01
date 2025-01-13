import java.util.Scanner;
class FeeDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take user input for fee and discount percentage
        System.out.print("Enter the student fee: ");
        double fee = sc.nextDouble();
        
        System.out.print("Enter the university discount percentage: ");
        double discountPercent = sc.nextDouble();
        
        // Calculate the discount amount
        double discount = (discountPercent / 100) * fee;
        
        // Calculate the final fee 
        double finalFee = fee - discount;
        
        // Output 
        System.out.println("The discount amount is INR " +  discount + " and final discounted fee is INR " + finalFee);
    }
}

