class WindChill {
    // Method to calculate wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        // Example temperature and wind speed
        double temperature = 30.0;
        double windSpeed = 10.0;
        
        // Calculate wind chill
        double windChill = calculateWindChill(temperature, windSpeed);
        
        // Output result
        System.out.println("Wind chill temperature: " + windChill);
    }
}
