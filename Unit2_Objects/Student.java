package Unit2_Objects;

public class Student {
    // instance variables
    private String name;
    private int gradeLevel;
    private double gpa;

    // constructor
    public Student(String stName, int stGradeLevel, double stGpa){
        name = stName;
        gradeLevel = stGradeLevel;
        gpa = stGpa;
    }

    public Student(String stName){
        name = stName;
        gradeLevel = 9;
        gpa = -1;
    }

    // methods
    public void printSummary(){
        System.out.println("Name: " + name);
        System.out.println("Grade: " + gradeLevel);
        System.out.println("GPA: " + gpa);
    }

    public void setGrade(int newGradeLevel){
        gradeLevel = newGradeLevel;
    }

    public int getGrade(){
        return gradeLevel;
    }
}
