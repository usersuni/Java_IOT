package Collection.lambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;

class Student{
    int id;
    String name;
    public Student(int id ,String name){
        this.id = id;
        this.name = name;
    }
}
public class StudentSort {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(410,"Sunil"));
        list.add(new Student(411,"Tharun"));
        list.add(new Student(400,"Akash"));
        for(Student s : list){
            System.out.println(s.id +","+s.name);
        }
        System.out.println("After Sorting");
        //Ascending order based on id
        Collections.sort(list,(s1,s2)-> s1.id - s2.id);
        for(Student s : list){
            System.out.println(s.id +","+s.name);
        }
    }
}
