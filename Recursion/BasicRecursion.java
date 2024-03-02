class BasicRecursion
{
    //Printing Numbers from 1 to n
    public static void printNum(int n){

        if(n<=10){
            System.out.println(n);
            printNum(n+1);
        }
    }
    //Factorial of Number
    public static int factorial(int n){
        if(n==0) {
            return 1;
        }
        return n * factorial(n-1);
    }
    //Print array elements
    public static void printArray(int a[],int n){
        if(n < 6){
            System.out.print(a[n]+" ");
            printArray(a,n+1);
        }
    }
    //main function
    public static void main(String[] args) {
        printNum(1);
        System.out.println("Factorial of 5 is "+ factorial(5));
        int a[] = {1,2,3,4,5,6};
        int n = 0; //length of array
        printArray(a,n);
    }
}