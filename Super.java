class A {
    int a =10;
    A(){
        System.out.println("A constartor ");
    }
}

class B extends A {
    int a =20;
    B(){
        System.out.println("B constrator ");
    }
    void show(){
        System.out.println(a);
        System.out.println(super.a);
    }
}


public class Super {
    public static void main(String[] args) {
        B b1 = new B();
        b1.show();
    }
    
}
