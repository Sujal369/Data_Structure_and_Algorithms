
import java.util.Scanner;
class Search2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt(); //number of rows
        int col = sc.nextInt(); //numbers of columns
        int[][] arr2d = new int[rows][col]; //Initialization
        for (int i = 0; i < rows; i++) //Loop for rows
        {
            for (int j = 0; j < col; j++) //loops for columns
            {
                arr2d[i][j] = sc.nextInt(); //insert values in the array
            }
        }
        int target = 6;
        //Printing array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if (arr2d[i][j] == target) {
                    System.out.print("Searching element present at "+i+"th row and "+j+"th column");
                }
            }
            System.out.println();
        }
        System.out.println(arr2d.length);
    }
}