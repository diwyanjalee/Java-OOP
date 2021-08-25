import java.util.*;
public class Linkedi {
    public static void main(String[] args){

        LinkedList<String> list = new LinkedList<String>();

        list.add("cat");
        list.add("dog");
        list.add("elephant");
        System.out.println("Animal List: " +list);

        list.addFirst("owl");
        list.addLast("fox");
        list.add(4,"monkey");
        System.out.println("Animal List after adding animals: " +list);

        list.set(4, "Ape");
        System.out.println("Animal List after changing index4 animal: " +list);

        list.removeFirst();
        list.removeLast();
        list.remove(3);
        System.out.println("Animal List after removing animals: " +list);


        /*Iterator<String> iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }*/
    }

}
