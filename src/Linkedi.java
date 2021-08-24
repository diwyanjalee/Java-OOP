import java.util.*;
public class Linkedi {
    public static void main(String[] args){

        LinkedList<String> list = new LinkedList<String>();

        list.add("cat");
        list.add("dog");
        list.add("elephant");

        Iterator<String> iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
