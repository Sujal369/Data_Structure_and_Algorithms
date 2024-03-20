class Solution
{
    public void swapElements(int[] arr, int n)
    {
        if(n >3){
            int slow = 0;
            int fast = slow +2;
            while(fast != n){
                arr[slow] = arr[slow] ^ arr[fast];
                arr[fast] = arr[slow] ^ arr[fast];
                arr[slow] = arr[slow] ^ arr[fast];
                slow++;
                fast++;
            }   
        }
    }
}

