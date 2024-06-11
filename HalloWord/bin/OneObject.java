package bin;
class Car {

    String name;
    int model;

}
public class OneObject {
    public static void main(String[] args) {
        Car c =new Car();
        c.model=234;
        c.name="Honda";
        System.out.println(c.model + " " + c.name);
        Car b;
        b=c;
        System.out.println(c.model + " " + c.name);

        b.name = "Toyota";
        b.model = 342;
        System.out.println(c.model + " " + c.name);
        System.out.println(b.model + " " + b.name);


        

    }
}
