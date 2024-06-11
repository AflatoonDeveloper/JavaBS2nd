import java.util.Scanner;

public class Caluclator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your First no ");
        double x = sc.nextDouble();
        System.out.print("Enter your Second no ");
        double y = sc.nextDouble();


        System.out.println("Select an operation:");
        System.out.println("1 : + (Addition)");
        System.out.println("2 : - (Subtraction)");
        System.out.println("3 : * (Multiplication)");
        System.out.println("4 : / (Division)");
        System.out.println("5 : % (Modulo or remainder)");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        double Rezult;

        switch (choice) {
            case 1: 
            Rezult = x + y;
            System.out.println(x + " " +"Choise is " + choice + " " + y + " = " + Rezult );
             break;
             case 2: 
            Rezult = x - y;
            System.out.println(x + " " +"Choise is " + choice + " " + y + " = " + Rezult );
             break;
             case 3: 
             Rezult = x * y;
             System.out.println(x + " " + "Choise is " + choice + " " + y + " = " + Rezult );
              break;
              case 4: 
              Rezult = x / y;
              System.out.println(x + " " + "Choise is " + choice + " " + y + " = " + Rezult );
               break;
               case 5: 
               Rezult = x % y;
               System.out.println(x + " " +"Choise is " + choice + " " + y + " = " + Rezult );
                break;
         
            default:
            System.out.println("Invalid choice");
                break;
        }

       







    }

    
}
