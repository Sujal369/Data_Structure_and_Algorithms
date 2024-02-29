class CopyArrray
{
    public static void main(String[] args) {
        int a[] = {34,56,23};
        int v[] = new int[3];
        System.arraycopy(a,0,v,0,3);
        for(int val: v){
            System.out.println(val);
        }

    }
}