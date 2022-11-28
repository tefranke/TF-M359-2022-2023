package Unit6_Arrays.CourseEx;

public class Course {
    private String teacherName;
    private String subject;
    private String currentGrade;
    private int period;

    // Full constructor

    public Course(String teacherName, String subject, String currentGrade, int period) {
        this.teacherName = teacherName;
        this.subject = subject;
        this.currentGrade = currentGrade;
        this.period = period;
    }


    // Constructor or courses without a teacher or grade
    // (study hall, lunch, early dismissal, etc.)
    public Course (String subject, int period){
        this.subject = subject;
        this.period = period;
        teacherName = "N/A";
        currentGrade = "N/A";
    }


    // Return a string that will print course data on ONE line
    public String toString(){
        return "Period " + period + ": " + subject + " (" + teacherName + "), " + currentGrade;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCurrentGrade() {
        return currentGrade;
    }

    public void setCurrentGrade(String currentGrade) {
        this.currentGrade = currentGrade;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }
}
