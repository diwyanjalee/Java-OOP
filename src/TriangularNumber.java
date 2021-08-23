import java.util.Scanner;

public class TriangularNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = in.nextInt();

        int number = n;
        int triangular = 0;
        for(int i = 1;i<=n;i++) {
            triangular = triangular + i;
        }
        System.out.println("Triangular number for your number is "+triangular);
    }

}
