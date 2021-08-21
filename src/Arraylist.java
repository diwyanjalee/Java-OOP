import java.util.*;
public class Arraylist {
    public static void main(String[] args) {

        ArrayList<String> obj = new ArrayList<String>();

        obj.add("Colombo");
        obj.add("Anuradhapura");
        obj.add("Kandy");
        obj.add("Monaragala");
        obj.add("Jaffna");

        System.out.println("First ArrayList:");
        for (String town : obj)
            System.out.println(town);

        obj.add(3,"Kurunegala");
        obj.add(5,"Bibile");

        System.out.println("ArrayList after add:");
        for(String town:obj)
            System.out.println(town);

        obj.remove("Bibile");

        System.out.println("ArrayList after remove:");
        for(String town:obj)
            System.out.println(town);
    }
}
