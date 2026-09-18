import java.util.LinkedList;
import java.util.List;

public class StudentDetails {
    public static void main(String[] args) {
        List<Student> li = new LinkedList<>();
        li.add(new Student("A",1,90));
        li.add(new Student("B",2,87));
        li.add(new Student("C",3,99));
        for (Student i : li){
            i.display();
        }
    }


public static class Student{
    String name;
    int rollno;
    int marks;
    Student(String n, int r, int m){
        this.name=n;
        this.rollno = r;
        this.marks = m;
    }
    void display(){
        System.out.println("Student name is : "+name);
        System.out.println("Rollno. : "+rollno);
        System.out.println("Marks : "+marks);
    }
}}

