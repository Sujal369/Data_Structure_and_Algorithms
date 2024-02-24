import java.util.Scanner;
class TwoSum
{
    public static String twoSum(int target)
    {
        int a[] = {12,13,25,30,60,35,15,45,67,13};
        for (int i = 0 ; i<a.length-1 ; i++){
            for (int j=0 ; j<a.length ; j++){
                if (a[i]+a[j]==target){
                    return "Position found at "+i+" and "+j;
                }
            }
        }
        return "Not found";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        System.out.println(twoSum(t));
    }
}