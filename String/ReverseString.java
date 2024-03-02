class ReverseString
{
    public static void method1(String str){
        for(int i=str.length()-1;i>=0;i--) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static String method2(){
        StringBuilder sb = new StringBuilder("Hello");
        for(int i=0;i<sb.length()/2;i++){
            int front = i;
            int back = sb.length()-1-i;
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }
        return sb.toString();
    }
    //main Function
    public static void main(String[] args) {
        String str = "Sujal";
        method1(str);
        System.out.println(method2());
    }
}