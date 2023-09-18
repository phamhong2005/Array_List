package Student;

import java.util.ArrayList;
import java.util.Locale;

public class StudentManager {
    private ArrayList<Student> lisStudents = new ArrayList<>();


    public void add(Student student) {
        lisStudents.add(student);
    }

    public ArrayList<Student> getLisStudents() {
        return lisStudents;
    }

    public void remove(Student student) {
        lisStudents.remove(student);
    }

    public int getByid(int id) {
        for (Student b : lisStudents) {
            if (id == b.getId()) {
                return id;
            }
        }
        return -1;
    }

    public void getI(int index) {
            System.out.println(lisStudents.get(index));
    }
    public void avg(double [] score){
        int sum = 0;
        double avg = 1;
        for (int i = 0; i < score.length ; i++) {
            sum += score[i];
        }
        avg = sum/score.length;
        System.out.println(avg);
    }
}
