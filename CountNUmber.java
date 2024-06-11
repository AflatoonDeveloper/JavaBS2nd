import java.util.Scanner;

public class CountNUmber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of elements: ");
        int count = scanner.nextInt();

        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int[] counts = countNumbers(numbers);

        System.out.println("Number of positive numbers: " + counts[0]);
        System.out.println("Number of negative numbers: " + counts[1]);
        System.out.println("Number of zeros: " + counts[2]);

        scanner.close();
    }

    public static int[] countNumbers(int[] numbers) {
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int num : numbers) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        int[] counts = {positiveCount, negativeCount, zeroCount};
        return counts;
    }


}
