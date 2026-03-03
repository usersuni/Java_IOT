package InnerClasses.localInnerClasss;

import java.time.LocalDate;

public class Exam {
    void Evaluate(int marks){
        class GradeCalculator{
            String calculate(){
                if(marks >= 75) return "Distinction";
                else if(marks >= 60) return "First Class";
                else return "Pass";
            }
        }
        GradeCalculator gc = new GradeCalculator();
        System.out.println(gc.calculate());
    }
    void displayExamDate(){
        LocalDate d = LocalDate.now().plusDays(5);
        System.out.println("The exam date is : "+d);
    }

    public static void main(String[] args) {
        Exam e = new Exam();
        e.Evaluate(67);
        e.Evaluate(89);
        e.displayExamDate();
    }
}

/*
Points to remember
Grade logic is scoped to the "evaluate" method
It avoids polluting the class with the helper methods
It helps inn designing the codebase in a cleaner way
 */
