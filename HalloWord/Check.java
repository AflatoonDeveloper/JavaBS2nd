import java.util.Scanner;

public class Check {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String to print: "); // Added colon after "print"
        String ans = sc.nextLine();
        System.out.println("Input value is: " + ans); // Use println for newline
    }
}
