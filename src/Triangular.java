import java.util.Scanner;
public class Triangular {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = in.nextInt();

        Triangular num = new Triangular();
        num.getTnum(n);
        int value = num.getTnum(n);
        System.out.println("triangular Value is: "+num.getTnum(n));

    }
    public int getTnum(int num){
        //int triangularValue = num;
        int triangularValue = 0;
        for(int i = 1;i<=num;i++) {
            triangularValue = triangularValue + i;
        }
        return triangularValue;
    }
}
