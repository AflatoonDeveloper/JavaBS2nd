import java.util.Scanner;


public class Switch {

   
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
  
   System.out.print("Enter a n! number:" );
int a = sc.nextInt();
Switch oobj = new Switch();
int ans = oobj.factorial(a);

System.out.println(ans);

    }
    int factorial(int n){
        if(n==0){
            System.out.println("the n! is : 1");
        }
int result = 1;
        for(int i=n; i>=1;i--){
result *= i;

        }
System.out.println("the n! is :" + result);
return result;
    }
    
   

    
}
