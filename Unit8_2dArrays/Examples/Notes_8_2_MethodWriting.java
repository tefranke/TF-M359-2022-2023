package Unit8_2dArrays.Examples;

public class Notes_8_2_MethodWriting {
    public static void main(String[] args) {
        int[][] myNums = { {9,7,25,3}, {29,8,22,10}, {19,16,9,1}};

        // output the array in normal form
        showArray(myNums);

        // output the avg of all the numbers in myNums
        double avg = getAvg(myNums);
        System.out.println("Average of all values: " + avg);

        // Find the number ofo rows that contain at least one even number
        int evenRowCount = getEvenRowCount(myNums);
        System.out.println("# of rows that contain an even #: " + evenRowCount);

        // Find the number of columns that contain at least one even number
        int evenColCount = getEvenColCount(myNums);
        System.out.println("# of columns that contain an even #: " + evenColCount);
    }

    // Returns the number of columns in arr that contain at least one even #
    public static int getEvenColCount(int[][] arr){
        int count = 0;
        for(int i = 0; i < arr[0].length; i++){
            boolean hasEven = false;
            for (int j = 0; j < arr.length; i++){
                if (arr[j][i] % 2 == 0){
                    hasEven = true;
                }
            }
            if(hasEven){
                count++;
            }
        }
        return count;
    }



    // Returns the number of rows in arr that contain at least one even #
    public static int getEvenRowCount(int[][] arr){
        int count = 0;
        for (int[] row: arr){
            boolean hasEven = false;
            for (int num: row){
                if (num % 2 == 0){
                    hasEven = true;
                }
            }
            if(hasEven){
                count++;
            }
        }
        return count;
    }



    // Calculate the avg of all elements in arr, then return that value
    public static double getAvg(int[][] arr) {
        int sum = 0;
        int count = 0;
        for (int[] row : arr) {
            for (int num : row) {
                sum += num;
                count ++;
            }
        }
        return (double)sum/count;
    }


    // Print all elements of arr using for-each loops
    public static void showArray(int[][] arr){
        for(int[] row: arr){
            for (int num: row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
