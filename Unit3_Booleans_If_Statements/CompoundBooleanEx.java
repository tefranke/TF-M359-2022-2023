package Unit3_Booleans_If_Statements;

public class CompoundBooleanEx {
    public static void main(String[] args) {
        // testtest
        // test2
        String day = "Monday";
        int numHwAssignments = 2;

        // 1. Alice loves video games. She plays video games if it's Saturday
        // or if she doesn't have any homework. Print out either
        // "Yay, video games!" or "I guess I'll have to wait :("

        if (day.equals("Saturday") || numHwAssignments == 0){
            System.out.println("Yay, video games!");
        }
        else {
            System.out.println("I guess I'll have to wait :(");
        }

        // 2. Bob only goes to coding club if the day is Monday AND if the
        // number of hw assignments he has is less than of equal to 2.
        // Print out either "Yay, coding club!" or "Today is a sad day :("

        if (day.equals("Monday") && numHwAssignments <= 2) {
            System.out.println("Yay, coding club!");
        }
        else {
            System.out.println("Today is a sad day :(");
        }

        // 3. Carol always exercises on the weekends. On the weekdays, she
        // exercises with 80% probability if she has no homework, but only
        // with 30% probability if she has any homework.
        // Print out either "Exercise" or "No Exercise"

        if (day.equals("Saturday") || day.equals("Sunday")){
            System.out.println("Exercise");
        }
        else {
            int percent = (int)(Math.random()*10)+1;
            if (numHwAssignments == 0 && percent <= 8){
                System.out.println("Exercise");
            }
            else if (numHwAssignments == 0 && percent > 8){
                System.out.println("No Exercise");
            }
            else if (numHwAssignments > 0 && percent <= 3){
                System.out.println("Exercise");
            }
            else if (numHwAssignments > 0 && percent > 3){
                System.out.println("No Exercise");
            }
        }
    }
}
