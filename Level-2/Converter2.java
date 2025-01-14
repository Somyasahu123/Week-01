class Converter2{
    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCm(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {
        System.out.println("10 yards to feet: " + convertYardsToFeet(10));
        System.out.println("10 feet to yards: " + convertFeetToYards(10));
        System.out.println("10 meters to inches: " + convertMetersToInches(10));
        System.out.println("10 inches to meters: " + convertInchesToMeters(10));
        System.out.println("10 inches to centimeters: " + convertInchesToCm(10));
    }
}
