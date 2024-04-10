class Binary
{
    public static void binarysearch(int k,int arr[]){
        int low=0;
        int mid;
        int high= arr.length-1;

        while(low<=high)
        {
            mid = low+(high-low)/2;
            if(arr[mid]==k){
                System.out.println("Value found");
                return;
            }
            else if(arr[mid]>k){
                high = mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println("Not found");
    }
    public static void recursiveBinarySearch(int k, int arr[], int low, int high) {
        if (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == k) {
                System.out.println("Value found");
                return;
            }
            if (arr[mid] > k) {
                recursiveBinarySearch(k, arr, low, mid - 1);
            } else {
                recursiveBinarySearch(k, arr, mid + 1, high);
            }
        } else {
            System.out.println("Not found");
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,89,0};
        int k = 89;
        binarysearch(k,arr);
        recursiveBinarySearch(k,arr,0, arr.length-1);
    }
}
