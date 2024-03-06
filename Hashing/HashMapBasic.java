import java.util.HashMap;
class HashMapBasic
{
    public static void main(String[] args) {
        //Creation
        HashMap<String,Integer> mp = new HashMap<>();
        //Insertion
        mp.put("India",120);
        mp.put("US",30);
        mp.put("China",150);
        //Printing
        System.out.println(mp);
        //update
        mp.put("China",180);
        System.out.println(mp);
        //search
        if(mp.containsKey("China")){
            System.out.println("Key Present");
        }
        //get Function
        System.out.println(mp.get("China"));
        //remove
        mp.remove("China");
        System.out.println(mp);
    }
}