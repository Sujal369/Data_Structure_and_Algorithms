import java.lang.String;
class BasicString
{
    public static void main(String[] args) {
        String str1 = "Sujal Lothe"; //String Declaration
        String str2 = new String("Sujal"); //Another Method of Declaration
        //printing String
        System.out.println(str1);
        System.out.println(str2);
        //immutable string
        String s = "Java";
        s.concat(" Progarm");
        System.out.println(s);
        //Type conversion
        String str = "123";
        int num = 90;
        System.out.println(num + Integer.parseInt(str)); //Same for double,float
        System.out.println(String.valueOf(num) + str); //Concatenation here num to str
        //Compares Address
        System.out.println(str1 == str2); //Gives Boolean values
        //Compares Values
        System.out.println(str1.equals(str2));
        //Length of string
        System.out.println(str1.length());
        //Extract ith Character
        System.out.println(str1.charAt(4));
        //For Lower and UpperCase
        System.out.println(str.toLowerCase()); //all make small letters and same for uppercase
        //Search and Replace
        System.out.println(str1.replace('l','p'));
        //Check Value
        System.out.println(str1.contains("o"));
        //Converting string to character array
        System.out.println(str1.toCharArray());
        //Check for empty String
        System.out.println(str1.isEmpty());
        //checks if strings ends with given suffix
        System.out.println(str1.endsWith("the"));
    }
}
/* Output:
Sujal Lothe
Sujal
Java
213
90123
false
false
11
l
123
Sujap Lothe
true
Sujal Lothe
false
true
 */