public class Objct {
    int id;
    String name;
    void display()
    {
        System.out.println("the value of object " + id +""+ name);
    }
    public static void main(String[]arge)
    {
        //object create
        //Defult Constartors
         Objct s1 = new Objct();
        s1.id=3;
        s1.name="AliBaba";
        Objct s2 = new Objct();
        s2.id=3;
        s2.name="AliBaba";
        s1.display();
        s2.display();
    }
}

