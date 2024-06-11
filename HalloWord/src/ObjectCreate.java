public class ObjectCreate {
    
int id;
String name;
String clas;
long phone_no;
String address;

ObjectCreate(int i , String n,String c, long ph , String a){

    id=i;
    name=n;
    clas=c;
    phone_no=ph;
    address=a;

}
void display(){

    System.out.println("the Student name is :"+ name + "\n" + "Student Rollno :" + id + "\n" + "Class is "+ clas + "\n" + "Phone number :" + phone_no + "\n" + "Address is: " + address);
    System.out.println("#################################");
}

public static void main(String [] arge){

    ObjectCreate student1 = new ObjectCreate(1, "Ammad", "BSSE 2A", 12324, "Havelian");
    ObjectCreate student2 = new ObjectCreate(2, "Aryan", "BSSE 2A", 923003, "Sultanpur");
    student1.display();
    student2.display();
}


    
}
