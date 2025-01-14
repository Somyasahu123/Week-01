class TempConvertor {
    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        System.out.println("32°F to Celsius: " + convertFahrenheitToCelsius(32));
        System.out.println("0°C to Fahrenheit: " + convertCelsiusToFahrenheit(0));
        System.out.println("10 pounds to kilograms: " + convertPoundsToKilograms(10));
        System.out.println("10 kilograms to pounds: " + convertKilogramsToPounds(10));
        System.out.println("10 gallons to liters: " + convertGallonsToLiters(10));
        System.out.println("10 liters to gallons: " + convertLitersToGallons(10));
    }
}
