public class Object1 {
    
    int id;
    String name;
    int phone;
    String address;

    public static void main (String [] arge)
    {

        //Create a Object 
     Object1 obj1 = new Object1();
     Object1 obj2 = new Object1();

     obj1.id=23;
     obj1.name="Aryan";
     obj2.name="Ammad";
     obj2.id=24;
     System.out.println(obj1.id);
     System.out.println(obj1.name);



     System.out.println(obj2.id);
     System.out.println(obj2.name);
    }
}
