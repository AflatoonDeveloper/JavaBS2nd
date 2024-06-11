class Dog {
    int age;
    String name;

    // Explicit no-argument constructor
    Dog(int age, String name) {
        // Optional: Initialize default values if needed
        this.age=age;
        this.name=name; 
    }
    void show(Dog obj) {
        System.out.println("age is " + age + " the name is " + name);
    }
}
public class InnerDog {
    public static void main(String[] args) {
        Dog d1 = new Dog(23,"Tom");
       
       d1.show(d1);
    }
}
