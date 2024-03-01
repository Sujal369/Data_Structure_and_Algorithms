class WhitSpaceRemoveString
{
    public static void main(String[] args) {
        String str = "Sujal Rameshrao Lothe";
        for (int len=0;len<str.length();len++){
            if(str.charAt(len) != ' ')
            {
                System.out.print(str.charAt(len));
            }
        }
    }
}