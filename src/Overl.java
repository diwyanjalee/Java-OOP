public class Overl {
    public static void main(String[] args)
    {
        C obj = new C();
        obj.show(3);
    }
}

  class C {
      public void show()
   {
       System.out.println("hello this is 1");
   }
      public void show(int i)
      {
          System.out.println("hello this is 2");
      }
  }
