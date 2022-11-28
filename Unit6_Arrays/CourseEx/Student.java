package Unit6_Arrays.CourseEx;

public class Student {
    private String name;
    private Course[] myClasses;

    public Student(String name, Course[] myClasses) {
        this.name = name;
        this.myClasses = myClasses;
    }
        // Write a toString method that will return a string with:
        // 1. the student's name
        // 2. use a for-loop to print all of the Course objects too
        public String toString(){
            String output = "Student Name: " + name;
            for (int i = 0; i < myClasses.length; i++){
                output += "\n" + myClasses[i].toString();
            }
            return output;
        }
}
