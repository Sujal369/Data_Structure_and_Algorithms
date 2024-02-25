class AddSubMulArrayElements
{
    //Addition of all elements from the array
    void additionArray(int arr[]){
        int sum = 0;
        for (int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println("\nSum of all the elements in the array is "+sum);
    }

    //Subtraction of all the elements from the array
    void subtractionArray(int arr[]){
        int sub = arr[0];
        for (int i=1;i<arr.length;i++){
            sub = sub-arr[i];
        }
        System.out.println("\nSubtraction of all the elements from the array is "+sub);
    }

    //Multiplication of all the elements from the array
    void multiplicationArray(int arr[]){
        int mul = 1;
        for (int i=0;i<arr.length;i++){
            mul = mul * arr[i];
        }
        System.out.println("\nMultilication of all the elements from the array is "+mul);
    }

    //main function
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        AddSubMulArrayElements obj = new AddSubMulArrayElements();
        obj.additionArray(arr);
        obj.multiplicationArray(arr);
        obj.subtractionArray(arr);
    }
}
