public class TypeCasting {
    public static void main (String [] arge)
    {

        short s = 2000;
        byte b = (byte) s;
        System.out.println( "Short to bytes " + b);

        int i = 234234;

        byte be = (byte) i;
        System.out.println("the bytes to int " + be);

        double db = 345345.4234234325;
        int in = (int) db;
        byte bce = (byte) db;
        System.out.println("the double to int " + in + "and bytes"+ bce);


    }
}
