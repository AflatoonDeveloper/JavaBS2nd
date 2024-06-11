import java.util.Scanner;

public class ArrayAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("ENter a num to add char");
char a = sc.next().charAt(0);
System.out.println("ENter a num to add char" + a);

        int value[] = new int[10];
        for(int i =0;;i++){
System.out.println("ENter a num to add arry");
 value[i]=sc.nextInt();

        }
        int valuearry=0;

        for(int j=0 ; j<value.length;j++){
            System.out.println(value[j]);

            valuearry += value[j];

        }
        System.out.println(valuearry);
       
    }
}
