class MergeSort
{
    public static void conquer(int arr[],int si,int mid,int ei){
        //Temporary array for storing the elements of original array of length equals to original array
        int merged[] = new int[ei-si+1];

        int idx1 = si; //idx1 represent 1st half part of array started as starting index
        int idx2 = mid+1; //idx2 represent 2nd half part of array started as middle + 1 index
        int x=0; //Tracking the index of new created merged array

        //Sorting array elements for both divided parts
        //index of 1st half <= mid and index of 2nd half <= ending index
        while (idx1 <= mid && idx2 <= ei){
            if(arr[idx1] <= arr[idx2]){
                merged[x] = arr[idx1];
                x++;
                idx1++;
            }else {
                merged[x++] = arr[idx2++];
            }
        }
        while(idx1 <= mid){
            merged[x] = arr[idx1];
            x++;
            idx1++;
        }
        while (idx2 <= ei){
            merged[x++] = arr[idx2++];
        }
        //Copying elements to original array
        for (int i = 0,j=si ; i<merged.length; i++,j++ ){
            arr[j] = merged[i];
        }
    }

    //dividing array into the parts and lastly calling the conquer method
    public static void divide(int arr[],int si,int ei){
        //if array having null element
        if(si>=ei) return;
        //Calculating Mid
        int mid = si + (ei-si)/2;

        divide(arr,si,mid); //dividing up to 1st half
        divide(arr,mid+1,ei); //dividing up to 2nd half

        conquer(arr,si,mid,ei); //calling conquer method for combining solution
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,10,8};
        int n = arr.length;

        divide(arr,0,n-1);
        //print
        for (int i = 0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}