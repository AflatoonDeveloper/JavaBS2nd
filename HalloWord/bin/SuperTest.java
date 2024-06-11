package bin;

class Abc {
    int a =10;
    Abc (){

        System.out.println("this is Abc Consttrator");
    }
}

class B extends Abc {

    int a =20 ;

    B(){
        System.out.println("this is B Consttrator");

    }
void Show (){

    System.out.println(a);
    System.out.println(super.a);
}
}
public class SuperTest {

    public static void main(String[] args) {
        
        B b = new B();
    
        b.Show();
    }
   
}
