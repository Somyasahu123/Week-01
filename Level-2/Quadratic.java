import java.util.Scanner;

class Quadratic{
    // Method to find the roots of a quadratic equation
    public static double[] findRoots(int a, int b, int c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2}; // Two real roots
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root}; // One real root
        } else {
            return new double[]{}; // No real roots
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coefficient a: ");
        int a = sc.nextInt();
        System.out.print("Enter coefficient b: ");
        int b = sc.nextInt();
        System.out.print("Enter coefficient c: ");
        int c = sc.nextInt();

        double[] roots = findRoots(a, b, c);

        if (roots.length == 0) {
            System.out.println("No real roots exist.");
        } else {
            System.out.println("Roots of the quadratic equation:");
            for (double root : roots) {
                System.out.println("Root: " + root);
            }
        }
    }
}
