//Moving Zeros to right
class MoveZero
{
    public static void main(String[] args) {
        int arr[] = {0,1,0,3,12};
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            } else if (count > 0)
            {
                int t = arr[i];
                arr[i] = 0;
                arr[i-count] = t;
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
