package Student;

import java.util.ArrayList;

public class Main10 {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        double [] score = {1,2,3};
        double [] score1 = {1,2,3};
        Student student = new Student("Linh",score,"Nam");
        Student student1 = new Student("Anh",score1,"Nam");
        studentManager.add(student);
        studentManager.add(student1);


//        studentManager.remove(student1);

        for (Student a: studentManager.getLisStudents()) {
            System.out.println(a);
        }
        System.out.println(studentManager.getByid(1));
        studentManager.getI(0);
        studentManager.avg(score1);

    }
}
