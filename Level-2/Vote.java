import java.util.Random;
public class Vote{
    // Method to generate random ages for students
    public static int[] generateAges(int n) {
        Random random = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
			// Generate age between 1 and 50
            ages[i] = random.nextInt(50) + 1; 
        }
        return ages;
    }

    // Method to determine voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = ages[i] >= 18 ? "Can Vote" : "Cannot Vote";
        }
        return result;
    }

    // Method to display the result in tabular format
    public static void displayResult(String[][] data) {
        System.out.println("Age\tEligibility");
        for (String[] entry : data) {
            System.out.println(entry[0] + "\t" + entry[1]);
        }
    }

    public static void main(String[] args) {
        int[] ages = generateAges(10);

        String[][] eligibility = checkVotingEligibility(ages);

        displayResult(eligibility);
    }
}
