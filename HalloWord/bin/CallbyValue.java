package bin;

class Dog {

    int age;
    String name;

    static void show (Dog x){

        x.name = "Aryan";
    }
}
public class CallbyValue {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.age=23;
        d.name="TOm";
        int x =12;
        d.show(d);
        System.out.println(d.name);
        // d.show(23);
    }
    
}
