package bin;

 class Animals {
    String name;
    int age;

    Animals(String name , int age) {
        this.age=age;
        this.name=name;
    }

    void eat (){
        System.out.println("Animal is Eating");
    }
}

class Cat extends Animals {

    String color ;

    Cat (String name , int age , String color){

        super(name, age);
        this.color=color;
    }

    void sound(){
        System.out.println("Sound is Cat");
        super.eat();
    }
void display () {

    System.out.println(name + age + color);
}

}

class Main {

    public static void main(String[] args) {
        
        Cat c1 = new Cat("Tom", 9, "white");
        c1.display();
        c1.sound();
    }
}
