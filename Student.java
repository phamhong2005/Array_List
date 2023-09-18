package Student;

import java.util.Arrays;

public class Student{
    private int id;
    private String name;
    private double [] score;
    private String sex;

    private static int idClement = 0 ;

    public Student( String name, double [] score ,String sex) {
        this.id = idClement;
        this.name = name;
        this.score = score;
        this.sex = sex;
        idClement++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getScore() {
        return score;
    }

    public void setScore(double[] score) {
        this.score = score;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + Arrays.toString(score) +
                ", sex='" + sex + '\'' +
                '}';
    }


}
