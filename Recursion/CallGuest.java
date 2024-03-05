//Find the no. of ways in which you can invite n people to your party single or in pair
class CallGuest
{
    public static int callGuest(int n){
        if(n<=1){
            return 1;
        }
        //single guest
        int way1 = callGuest(n-1);
        //pair guest
        int way2 = (n-1)*callGuest(n-2);

        return way1+way2;
    }
    //main
    public static void main(String[] args) {
        int n = 4; //number of guest
        System.out.println(callGuest(n));
    }
}