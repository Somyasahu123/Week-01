import java.util.Scanner;

class Chocolate{
    // Method to divide chocolates among children
    public static int[] findChocolatesDistribution(int chocolates, int children) {
        int eachChildGets = chocolates / children;
        int remainingChocolates = chocolates % children;
        return new int[]{eachChildGets, remainingChocolates};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input chocolates and children
        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();
        
        System.out.print("Enter number of children: ");
        int children = sc.nextInt();
        
        // Calculate distribution
        int[] result = findChocolatesDistribution(chocolates, children);
        
        // Output result
        System.out.println("Each child gets " + result[0] + " chocolates, Remaining chocolates: " + result[1]);
        
        sc.close();
    }
}
