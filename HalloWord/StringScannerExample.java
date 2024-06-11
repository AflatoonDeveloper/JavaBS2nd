import java.util.Scanner;

public class StringScannerExample {

    public static void main(String[] args) {
        String inputString = "Hello, how are you today?";
        
        Scanner scanner = new Scanner(inputString); // Create a Scanner object with the inputString
        
        while (scanner.hasNext()) {
            String word = scanner.next(); // Read the next word from the inputString
            System.out.println("Word: " + word);
        }
        
        scanner.close(); // Close the scanner
    }
}
