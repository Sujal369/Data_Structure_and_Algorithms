import java.util.ArrayList;
import java.util.Collections;

class ArrayListBasic
{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //add element
        list.add(1);
        list.add(2);
        list.add(3);

        //print
        System.out.println(list);

        //get elements from index
        System.out.println(list.get(0));

        //add element in between
        list.add(1,5);
        System.out.println(list);

        //set element
        list.set(0,5);
        System.out.println(list);

        //size
        int len = list.size();
        System.out.println(len);

        //loop
        for (int i=0;i<len;i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        
        //sorting
        Collections.sort(list);
        System.out.println(list);
    }
}