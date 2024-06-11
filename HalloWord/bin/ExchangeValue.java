package bin;

public class ExchangeValue {
    static void changeValue(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a is: " + a + " b is: " + b);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        // Call changeValue method with the local variables a and b
        changeValue(a, b);
        
        // Call changeValue method with other values
        changeValue(45, 476);
    }
}
