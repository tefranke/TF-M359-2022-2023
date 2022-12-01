package Unit6_Arrays.CourseEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadingEx {
    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("oneSchedule.txt");
        Scanner fileIn = new Scanner(myFile);

        // read in the first line (student's name)
        String stName = fileIn.nextLine();      // Molly Jones
        Course[] stSched = new Course[8];

        // read in courses, 1 at a time
        for (int i = 0; i < 8; i++) {
            String teacherName = fileIn.nextLine(); // Denna
            String className = fileIn.nextLine();   // AP Comp Sci A
            String letterGrade = fileIn.nextLine(); // A+
            int periodNum = fileIn.nextInt();       // 2
            fileIn.nextLine();                      // dummy read to get rid of newLine character
                                                    // after the period number

            Course myCourse = new Course(teacherName, className, letterGrade, periodNum);
            stSched[i] = myCourse;
        }

        for (Course c: stSched){
            System.out.println(c);
        }


    }
}
