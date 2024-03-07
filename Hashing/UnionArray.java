import java.util.HashSet;

class UnionArray
{
    public static int union(int arr1[],int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for (int j=0;j< arr2.length;j++){
            set.add(arr2[j]);
        }
        return set.size();
    }

    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {1,2,3,4,5,6,7};
        System.out.println(union(arr1,arr2));
    }
}