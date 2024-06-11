
class OuterDog{

    int age;
    String name = "Tom";
    void display(int x){
        System.out.println("age is : " + x + " name : " + name);
    }
}
public class DogFun {
    public static void main(String[] args) {
        OuterDog d2 = new OuterDog();
        int x = 34;

        d2.display(45);
    }
}
