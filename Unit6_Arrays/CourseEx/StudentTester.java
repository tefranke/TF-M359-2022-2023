package Unit6_Arrays.CourseEx;

public class StudentTester {
    public static void main(String[] args) {
        Course per1 = new Course("Newby", "Advanced Aquatics Training", "A+", 1);
        Course per2 = new Course("Higgins", "M479 AP Calculus BC", "A", 2);
        Course per3 = new Course("Moon", "G269 AP US History", "A", 3);
        Course per4 = new Course("Lunch", 4);
        Course per5 = new Course("Moon", "M359 Java", "A+", 5);
        Course per6 = new Course("Teberg", "M338 Accelerated Chemistry", "A+", 6);
        Course per7 = new Course("Lernor", "Spanish 3", "A", 7);
        Course per8 = new Course("Herriges", "E208 Honors English", "A", 8);

        Course[] sched = {per1, per2, per3, per4, per5, per6, per7, per8};

        Student st1 = new Student("Mithun", sched);
        System.out.println(st1);

        per1.setCurrentGrade("F");
        Student st2 = new Student("Josh", sched);
        System.out.println(st2);
        System.out.println(st1);
    }
}
