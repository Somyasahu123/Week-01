class Converter {
    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {
        System.out.println("10 kilometers to miles: " + convertKmToMiles(10));
        System.out.println("10 miles to kilometers: " + convertMilesToKm(10));
        System.out.println("10 meters to feet: " + convertMetersToFeet(10));
        System.out.println("10 feet to meters: " + convertFeetToMeters(10));
    }
}
