import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x==y){
            System.out.println("the value is equal");
        } else {
            if(x < y){
                System.out.println("a is less than b");

            }else{

                System.out.println("b is less than a");
            }



        }

      
    }
}
