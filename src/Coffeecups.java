public class Coffeecups {

    public static void main(String[] args){
        int num = 20;
        Coffeecups obj = new Coffeecups();
        obj.getTotalcups(num);
        int totalvalue = obj.getTotalcups(num);
        System.out.println("you have got "+obj.getTotalcups(num)+" extra coffee cups");

    }

    public int getTotalcups(int firstvalue){
        double value = firstvalue/6;
        int tvalue = (int)value;

        return tvalue;
    }

}
