import java.util.Arrays;

class ArrayEqualCheck
{
    public static void main(String[] args) {
        int a1[] = {2,3,4,5,0,9,8,7,6,1};
        int a2[] = {2,3,4,5,6,7,8,9,0,1};
        Arrays.sort(a1);
        Arrays.sort(a2);
        int count=0;
        for(int i=0;i<10;i++){
            if(a1[i] == a2[i]){
                count = count +1;
            }
        }
        if(count == 10){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

    }
}