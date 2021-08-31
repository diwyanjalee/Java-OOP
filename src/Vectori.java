import java.util.*;

public class Vectori {
    public static void main(String[] args){
        Vector<String> obj = new Vector<String>();

        obj.addElement("colombo");
        obj.addElement("kandy");
        obj.addElement("galle");

        System.out.println("Size is: "+obj.size());
        System.out.println("Default capacity increment is: "+obj .capacity());

        Enumeration en = obj.elements();
        System.out.println("\nElements are:");
        while(en.hasMoreElements())
            System.out.print(en.nextElement() + " ");
    }
}
