import java.util.*;
class BasicArray
{
    public static void main(String[] args) {
        //Defining Array Method 1
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        System.out.println(a[0]+" "+a[1]+" "+a[2]);
        //Printing using Loop
        for(int i=0;i<=2;i++){
            System.out.println(a[i]);
        }
        //Defining Array Method 2
        int[] arr = {2,3,4,5,6,7,8};
        //Printing
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        //Adding elements by user input
        Scanner sc = new Scanner(System.in);
        for (int i=1;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        //Output for that input (printing array elements)
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}