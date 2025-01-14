import java.util.Random;

class RandomNumber{
    // Method to generate 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        Random random = new Random();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(9000) + 1000; // Generates a random number between 1000 and 9999
        }
        return numbers;
    }

    // Method to find average, min, and max of the array
    public static double[] findAverageMinMax(int[] numbers) {
        double[] result = new double[3];
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {
            sum += number;
            if (number < min) min = number;
            if (number > max) max = number;
        }

        result[0] = sum / (double) numbers.length; // Average
        result[1] = min; // Min
        result[2] = max; // Max

        return result;
    }

    public static void main(String[] args) {
        int[] randomNumbers = generate4DigitRandomArray(5);
        double[] stats = findAverageMinMax(randomNumbers);

        System.out.println("Random Numbers: ");
        for (int number : randomNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("Average: " + stats[0]);
        System.out.println("Minimum: " + stats[1]);
        System.out.println("Maximum: " + stats[2]);
    }
}
