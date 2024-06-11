public class Pattern3 {
    public static void main(String[] args){

        int a,b;
        a=4;
        b=5;
        for (int i = 1;i<=a;i++){

        for (int j= 1;j<=i;j++){
            System.out.print("*");
        }
   System.out.println("");

        }

        for (int k = b;k>=1;k--){

            for (int l= 1;l<=k;l++){
                System.out.print("*");
            }
       System.out.println("");
    
            }
    }
}
