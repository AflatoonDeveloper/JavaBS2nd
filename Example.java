// Parent class
class Animal{
String name;
Animal(String name){
    this.name=name;
}
void speak(){
    System.out.println(name + " makes a sound");
}
}
// Child class inheriting from Animal
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    public void speak() {
        System.out.println(name + " says Woof!");
    }
}
// Child class inheriting from Animal
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    public void speak() {
        System.out.println(name + " says Meow!");
    }
}
public class Example {
    public static void main(String[] args) {
        Dog herDog = new Dog("hero");
        Cat herCat = new Cat("Tom");
        herCat.speak();
        herDog.speak();
    }
}
