class ArraySearchTechniques {

    //linear Search
    public static int linear(int target) {
        int a[] = {2, 34, 13, 56, 78, 89, 90, 55, 45};
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) //checking element one by one and if matches found it returns i(position)
                {
                return i; //target element index
            }
        }
        return -1; //if element not found int the array
    }
    //Binary Search
    public static int binary(int target) {
        int a[] = {59,60,61,62,63,64,65};
        int low=0; //lower bound
        int high=a.length-1; //upper bound (length of array means 7 - 1)
        while(low<=high){
            int mid = low + ((high - low)/2);
            if(a[mid] == target){
                return mid; //if desired element is middle
            }
            else if (a[mid] < target){
                low = mid + 1; //right side traversing
            }
            else if (a[mid] > target){
                high = mid -1; //left side traversing
            }
        }
        return -1; //if value not present return -1
    }
    //main function
    public static void main(String[] args)
    {
        System.out.println(linear(89)); //calling the linear method with value 89
        System.out.println(binary(70)); //calling the binary method with value 70
    }
}

//Output : 5
//Output : -1