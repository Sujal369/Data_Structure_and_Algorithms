class ReverseArray {
    public static void main(String[] args)
    {
        //Defining Array
        int a[] = {1, 2, 3, 4, 5, 6, 7};
        //Loop from last index to first index
        for (int i = a.length - 1; i >= 0; i--)
        {
            //Printing Array in Reverse
            System.out.print(a[i]+" ");
        }
    }
}