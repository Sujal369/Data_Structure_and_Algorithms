class QuickSort
{
    public static int partition(int a[],int low,int high){
        int pivot = a[high];
        int i = low-1;
        for(int j=low;j<high;j++){
            if(a[j] < pivot) //If you gave > sign it prints the sorted array in descending order
            {
                i++;
                //Swap
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        i++;
        int temp = a[i];
        a[i] = pivot;
        a[high] = temp;
        return i;
    }
    public static void quickSort(int a[],int low,int high){
        if(low<high){
            int pivot_index = partition(a,low,high);

            quickSort(a,low,pivot_index-1);
            quickSort(a,pivot_index+1,high);
        }
    }


    public static void main(String[] args) {
        int a[] = {3,4,5,1,0,9,7,6,2};
        int n = a.length;

        quickSort(a,0,n-1);
        for(int val : a){
            System.out.print(val+" ");
        }
    }
}
