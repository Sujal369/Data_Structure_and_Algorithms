class FindfirstDuplicate{
    public static int findindex(int a[]){
        int n = a.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    return i+1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = {2,4,4,5,6,1,1};
        System.out.println(findindex(a));
    }
}

//Output : 1 //Use Hashmap or Hashset for optimizing code
