import java.util.*;
class HashSetBasic
{
    public static void main(String[] args) {

        //Creation
        HashSet<Integer> set = new HashSet<>();
        //Insertion
        set.add(1);
        set.add(2);
        set.add(3);
        //search
        if(set.contains(1)){
            System.out.println("Set contains 1");
        }
        if(!set.contains(6)){
            System.out.println("Does not contain");
        }
        //delete
        set.remove(3);
        if(!set.contains(3)){
            System.out.println("Does not contain");
        }
        //size
        System.out.println("Size of set is "+set.size());
        //printing
        System.out.println(set);
        //Iterator
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
//Output :
//Set contains 1
//Does not contain
//Does not contain
//Size of set is 2
//[1, 2]
//1
//2