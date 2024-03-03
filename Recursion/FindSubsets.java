import java.util.ArrayList;

class FindSubsets
{
    public static void findSubsets(int n, ArrayList<Integer> subset){
        if(n==0){
            System.out.println(subset);
            return;
        }
        //add hoga
        subset.add(n);
        findSubsets(n-1,subset);
        //remove hoga
        subset.remove(subset.size()-1);
        findSubsets(n-1,subset);
    }
    public static void printSubset(ArrayList<Integer> subset){
        for (int i=0;i<subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    //main
    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n,subset);
    }
}

/*output:

[3, 2, 1]
[3, 2]
[3, 1]
[3]
[2, 1]
[2]
[1]
[]

 */