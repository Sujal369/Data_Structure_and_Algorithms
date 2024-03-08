import java.util.*;
class CollectionLinkList
{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        //addfirst
        list.addFirst("Sujal");
        //addlast
        list.add("is");
        //addlast
        list.addLast("Good");
        //print
        System.out.println(list);
        //delete first
        list.removeFirst();
        System.out.println(list);
        //delete last
        list.removeLast();
        System.out.println(list);
        list.addFirst("Sujal");
        list.add("is");
        list.addLast("Good");
        System.out.println(list);
        //delete by index
        list.remove(2);
        System.out.println(list);
        //size
        System.out.println(list.size());

    }
}
//output:
//[Sujal, is, Good]
//[is, Good]
//[is]
//[Sujal, is, is, Good]
//[Sujal, is, Good]
//3