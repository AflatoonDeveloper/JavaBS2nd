class Student {
private int age;
private String name;

public void setAge(int age){

    this.age=age;
}

public int getAge(){

    return age;
}
public void setName(String name){

    this.name=name;
}

public String getName(){
    return name;
}

void Display(){

    System.out.println(getAge()+ " " +getName());
}

}


class Dep extends Student{

    String dep_name;
}
public class StudentClass {

public static void main(String[] args) {
    
Dep s1 = new Dep();

s1.dep_name="AUST";
s1.setAge(23);
s1.setName("Aryan Waheed");
s1.Display();

// s1.Display();

}
    
}
