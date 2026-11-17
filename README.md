import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = input.nextInt();

        if (size <= 0) {
            System.out.println("Number must be positive.");
        } else {

            int[] grades = new int[size];

            // Input elements of the array
            for (int i = 0; i < size; i++) {
                System.out.print("Enter grade " + (i + 1) + ": ");
                grades[i] = input.nextInt();
            }

            System.out.print("Enter passing mark: ");
            int passingMark = input.nextInt();

            // PART A: LOOP VERSION
            int loopResult = countPassing(grades, passingMark);

            // PART B: RECURSIVE VERSION
            int recursiveResult = countPassingRecursive(grades, passingMark, 0);

            // Display results
            System.out.println("\n===== RESULTS =====");
            System.out.println("Loop Result: " + loopResult);
            System.out.println("Recursive Result: " + recursiveResult);

            if (loopResult == recursiveResult) {
                System.out.println("Match: Yes");
            } else {
                System.out.println("Match: No");
            }
        }

        input.close();
    }

    // PART A: LOOP VERSION
    public static int countPassing(int[] grades, int passingMark) {

        int count = 0;

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= passingMark) {
                count++;
            }
        }

        return count;
    }

    // PART B: RECURSIVE VERSION
    public static int countPassingRecursive(int[] grades, int passingMark, int index) {

        // Base case
        if (index == grades.length) {
            return 0;
        }

        // Check if the current grade is passing
        int thisOne = (grades[index] >= passingMark) ? 1 : 0;

        // Recursive call
        return thisOne + countPassingRecursive(grades, passingMark, index + 1);
    }
}
