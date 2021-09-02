public class Coffeecups {

    public static void main(String[] args){
        int num = 213;
        Coffeecups obj = new Coffeecups();
        obj.getTotalcups(num);
        int totalvalue = obj.getTotalcups(num);
        System.out.println("you have got "+obj.getTotalcups(num)+" coffee cups");

    }

    public int getTotalcups(int firstvalue){
        double value = firstvalue/6;
        int svalue = (int)value;
        int tvalue = svalue + firstvalue;

        return tvalue;
    }

}
