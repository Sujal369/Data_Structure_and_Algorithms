class BitManipulation
{
    //Mainly four methods are there for Bit manipulation
    //Set,Get,Clear,Update

    //  1.Get
    public static void getBit(){
        int n = 5,pos=2; //Here 5 = 0101 and we have to get the value at postion 2 .Also here the value position index starts from end
        int BitMask = 1<<pos; //Use to get
        if((BitMask & n) ==0){
            System.out.println("Bit was zero");
        }
        else{
            System.out.println("Bit was zero");
        }
    }
    //Set
    public static void setBit(){
        int n = 5,pos=1;
        int BitMask = 1<<pos;
        int newBit = BitMask | n;
        System.out.println(newBit);
    }
    //Clear
    public static void clearBit(){
        int n = 5,pos=2;
        int BitMask = 1<<pos;
        int notBitmask = ~(BitMask);
        int newBit = notBitmask & n;
        System.out.println(newBit);
    }
    //Update
    public static void updateBit(){
        //Set
        int n=5,pos=1;
        int Bitmask = 1<<pos;
        int notBitmask = ~(Bitmask);
        int newBit = notBitmask & n;
        System.out.println((Bitmask | n) +" and "+ newBit);
    }
    //main
    public static void main(String[] args) {
        getBit();
        setBit();
        clearBit();
        updateBit();
    }
}