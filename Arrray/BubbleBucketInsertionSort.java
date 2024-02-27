import java.util.ArrayList;
import java.util.Collections;
class BubbleBucketInsertionSort
{
    //Bubble Sort//
    void bubbleSort(int arr[]){
        int n = arr.length;
        int i,j;
        for (i=0;i<n-1;i++){
            for(j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j]; //temp using for Swapping
                    arr[j] = arr[j+1]; //Swapping
                    arr[j+1] = temp; //Swapping
                }
            }
        }
    }
    //Bucket Sort//
    void bucketSort(int[] array, int maxVal) {
        if (array == null || array.length <= 1)
        {return;}

        // Create buckets
        ArrayList<Integer>[] buckets = new ArrayList[maxVal + 1];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Put array elements into buckets
        for (int num : array) {
            buckets[num].add(num);
        }

        // Sort each bucket and put sorted elements back into array
        int index = 0;
        for (ArrayList<Integer> bucket : buckets) {
            Collections.sort(bucket);
            for (int num : bucket) {
                array[index++] = num;
            }
        }
    }

    //Insertion Sort
    void insertionSort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are
            // greater than key, to one position ahead
            // of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; //Swapping to that position
                j = j - 1; //for traversing array in reverse
            }
            arr[j + 1] = key;
        }
    }

    //Some other techniques are given in another repo

    void printArray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {12,23,45,78,90,1,3,40};
        int maxVal = 90; //this is for bucket sort as it requires max element
        BubbleBucketInsertionSort obj = new BubbleBucketInsertionSort();
        //Bubble Sort
        obj.bubbleSort(arr);
        obj.printArray(arr);
        //Bucket Sort
        obj.bucketSort(arr,maxVal);
        obj.printArray(arr);
        //Insertion Sort
        obj.insertionSort(arr);
        obj.printArray(arr);

    }

}
