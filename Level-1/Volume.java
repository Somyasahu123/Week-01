import java.lang.Math;
class Volume{
    public static void main(String[] args) {
        // Radius of Earth in kilometers
        double radiusKm = 6378;
        
        // Volume of sphere formula: V = (4/3) * pi * r^3
        double volumeKm = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        
        // Convert the volume to cubic miles (1 km = 0.621371 miles)
        double volumeMiles = volumeKm * Math.pow(0.621371, 3);
        
        // Output 
        System.out.println("The volume of earth in cubic kilometers is " +  volumeKm + " and cubic miles is " + volumeMiles);
    }
}

