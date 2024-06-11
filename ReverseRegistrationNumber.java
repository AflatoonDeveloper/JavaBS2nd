import java.util.Scanner;

public class ReverseRegistrationNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your registration number: ");
        int registrationNumber = scanner.nextInt();

        int reversedRegistrationNumber = reverseNumber(registrationNumber);
        System.out.println("Reversed Registration Number: " + reversedRegistrationNumber);

        scanner.close();
    }

    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
        System.out.println("Reversed digit Number: " + digit);

            reversed = reversed * 10 + digit;
        System.out.println("Reversed reversed Number: " + reversed);

            number /= 10;
            System.out.println("Relast: " + number);


        }
        return reversed;
    }
}
