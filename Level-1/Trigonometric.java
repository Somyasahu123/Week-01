class Trigonometric{
    // Method to calculate trigonometric functions
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle); // Convert angle to radians
        return new double[]{
            Math.sin(radians),  // Sine
            Math.cos(radians),  // Cosine
            Math.tan(radians)   // Tangent
        };
    }

    public static void main(String[] args) {
        double angle = 45.0; // Example angle
        
        // Calculate trigonometric functions
        double[] results = calculateTrigonometricFunctions(angle);
        
        // Output result
        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);
    }
}
