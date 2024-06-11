import java.util.Scanner;

public class PrinteUserInput {
    
    public static void main(String[] args) {
        
Scanner in = new Scanner(System.in);
System.out.print("Enter your value :");
String ans = in.nextLine();

System.out.println("THe input value of user is " + ans);

    }
}
