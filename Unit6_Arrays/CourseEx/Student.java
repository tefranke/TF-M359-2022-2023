package Unit6_Arrays.CourseEx;

public class Student {
    private String name;
    private Course[] myClasses;

    public Student(String name, Course[] myClasses) {
        // Set the name
        this.name = name;

        // Loop through the classes array, create each object
        this.myClasses = new Course[8];
        for (int i = 0; i < 8; i++){
            this.myClasses[i] = new Course(myClasses[i].getTeacherName(), myClasses[i].getSubject(),
                    myClasses[i].getCurrentGrade(), myClasses[i].getPeriod());
        }

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
