class FibonanciiSeries
{
    public static int fibonanci(int n){
        if(n<=1){
            return n;
        }
        int last = fibonanci(n-1);
        int lastsecond = fibonanci(n-2);
        return last+lastsecond;
    }
    //main
    public static void main(String[] args) {
        System.out.println(fibonanci(6)); //Gives the number in fibonanci Series at index 6

    }
}