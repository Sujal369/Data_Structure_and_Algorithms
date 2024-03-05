//Count total paths in a maze to move from (0,0) to (n,m) in matrix
class TotalPathMaze
{
    public static int countPath(int i ,int j,int n,int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        //Move Downward
        int downPath = countPath(i+1,j,n,m);
        //Move Right
        int rightpath = countPath(i,j+1,n,m);

        return downPath+rightpath;
    }
    //main()
    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println(countPath(0,0,n,m));
    }
}