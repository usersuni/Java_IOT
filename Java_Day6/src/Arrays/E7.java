package Arrays;
class Student{
    String name;
    int USN;
}
class Intern{
    String name;
    int id;
    Intern(String name,int id){
        this.name = name;
        this.id = id;
    }
}
//Array of objects{Student objects}
public class E7 {
    public static void main(String[] args) {
        Student[] s = new Student[3];
        s[0] = new Student();
        s[0].name = "Sunil";
        s[0].USN = 410;
        System.out.println(s[0].name +" "+ s[0].USN);
        Intern[] interns = new Intern[]{
                new Intern("Suni",5),
                new Intern("Akash",55),
                new Intern("Nithin",555)
        };
        //the data type is the class itself
        for(Intern i : interns){
            System.out.println(i.name + " " +i.id);
        }
        for(Student i : s){
            System.out.println();
        }
    }
}
