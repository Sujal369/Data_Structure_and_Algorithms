//Place tiles of size 1 X m in a floor of m size n X m
class PlaceTiles
{
    public static int placeTiles(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }

        //vertical arragement
        int verticalPlacements = placeTiles(n-m,m);
        //horizontal arragement
        int horizontalPlacements = placeTiles(n-1,m);

        return verticalPlacements+horizontalPlacements;
    }
    //main
    public static void main(String[] args) {
        int n=4,m=2;
        System.out.println(placeTiles(n,m));
    }
}