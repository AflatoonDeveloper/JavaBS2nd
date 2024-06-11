
class Student{
    String name;
    int rollno;
    String clas;
    String subj;
}

class Pen extends Student {

    String PenName;
    String colour;

}

class Courses extends Student {

    String course_name;
    int course_id;
    String teacher_name;

    void CourseStudent(){
        System.out.println("Course Informations is " + course_name + course_id );
    
    }
    
}

class Teacher extends Student {

    String Teacher_name;
    int  Teacher_phoneNo;
    String Course_name;
    void Teacherprinte(){
        System.out.print("Teacher inforation is : " + Teacher_name +  Teacher_phoneNo +  Course_name )
    }

}
public class Inheritence  {
   

    // void printe(){

    //     System.out.print("Student inforation is : " + name + rollno + clas + subj + 
    //     "pand Pen is used " + PenName + colour + "\n"+ "Couserses Enrollment is :" + course_name + teacher_name + "Teacher Name " + Teacher_name + "Phone no is : " + Teacher_phoneNo);
    // }

    public static void main(String[]arge){
Student obj = new Student();
obj.name = "Aryan";
obj.rollno=22020;
obj.clas="BSSE 2nd A";
obj.subj ="Software Engineer";


obj.printe();

    }

    

}
