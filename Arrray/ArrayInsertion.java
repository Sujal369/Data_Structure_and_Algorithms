import java.util.Arrays;

public class ArrayInsertion {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 5};
        System.out.println("Original array: " + Arrays.toString(myArray));

        myArray = insertAtStart(myArray, 0);
        System.out.println("Array after inserting at start: " + Arrays.toString(myArray));

        myArray = insertAtMiddle(myArray, 4);
        System.out.println("Array after inserting at middle: " + Arrays.toString(myArray));

        myArray = insertAtEnd(myArray, 6);
        System.out.println("Array after inserting at end: " + Arrays.toString(myArray));
    }

    public static int[] insertAtStart(int[] arr, int element) {
        int[] newArray = new int[arr.length + 1];
        newArray[0] = element;
        System.arraycopy(arr, 0, newArray, 1, arr.length);
        return newArray;
    }

    public static int[] insertAtMiddle(int[] arr, int element) {
        int middleIndex = arr.length / 2;
        int[] newArray = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArray, 0, middleIndex);
        newArray[middleIndex] = element;
        System.arraycopy(arr, middleIndex, newArray, middleIndex + 1, arr.length - middleIndex);
        return newArray;
    }

    public static int[] insertAtEnd(int[] arr, int element) {
        int[] newArray = Arrays.copyOf(arr, arr.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;
    }
}
