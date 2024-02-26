import java.util.Arrays;

class MissingNumber
{
    public static int missNumber(int[] arr){
        int n =  arr.length;
        int[] v = new int[n+1];
        Arrays.fill(v,-1);
        for (int i = 0;i<n;i++){
            v[arr[i]] = arr[i];
        }
        for (int i=0;i<v.length;i++){
            if(v[i] == -1){ return i;}
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = {0,1,3};

        System.out.print(missNumber(arr));
    }
}