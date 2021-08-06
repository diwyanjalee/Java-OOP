public class Overr {
    public static void main(String[] args)
    {
        B obj = new B();
        obj.show();
    }
}

class A{
    public void show()
    {
        System.out.println("this is A");
    }
}

class B{
    public void show()
    {
        System.out.println("this is B");
    }
}