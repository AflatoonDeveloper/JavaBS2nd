package bin;

class Student {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void displayStudentName() {
        System.out.println("name is " + name);
    }
}

class Subject extends Student {

    String dept;

    void displayDeptName() {
        System.out.println("Dept name is :" + dept);
    }

    Subject(String dept, String name, int id) {
        super(id, name);
        this.dept = dept;
        System.out.println("ID: " + id + ", Name: " + name + ", Dept: " + dept);
        // Call the displayStudentName method from the Student class
        super.displayStudentName();
    }
}

public class Overring {
    public static void main(String[] args) {
        Subject s1 = new Subject("IT", "Aryan", 3);
    }
}
