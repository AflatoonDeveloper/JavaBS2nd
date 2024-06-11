import java.util.Scanner;

public class ArryStoreData {
    public static void main (String [] arge ){

        Scanner sc = new Scanner(System.in);

System.out.print("how many number to Enter the arry :");
int a = sc.nextInt();
int [] arr = new int[a];
int total = 0;
for(int i = 0 ; i<arr.length;i++){

    System.out.print("Enter your "+ i + ":");
    arr[i]=sc.nextInt();
}

for(int i = 0; i<arr.length;i++){

    System.out.println("the value of arry is" + "["+arr[i]+"]");
    total=total+arr[i];
}

System.out.println("The sum of arry value is :"+ total);
float average;
average=total/arr.length;
System.out.print("The arerage of arrys value is : " + average);

    }
    
}
