class ReverseArrayRecursion
{
    public static void reverseArray(int arr[],int left,int right){
        if(left>=right){
            return;
        }
        //swap
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        reverseArray(arr, left+1, right-1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,5,9,3,4};
        reverseArray(arr,0, arr.length-1);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}