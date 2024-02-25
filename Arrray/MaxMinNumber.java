class MaxMinNumber
{
    //Maximum Element from Array
    public static int maxNumber(){
        int a[] = {23,34,21,12,10,9,89,45,675,900,234};
        int max = a[0];
        for(int i=1;i<a.length;i++){
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    //Minimum Element from Array
    public static int minNumber(){
        int a[] = {23,34,21,12,10,9,89,45,675,900,234};
        int min = a[0];
        for(int i=1;i<a.length;i++){
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println("Maximum Element is "+maxNumber()+" and Minimum number is "+minNumber()+".");
    }

}
