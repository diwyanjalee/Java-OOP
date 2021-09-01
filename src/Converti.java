import java.util.Scanner;

public class Converti {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = in.nextInt();

        String str = Integer.toString(num);
        if (num<100 && num>-100) {
            System.out.println(111+str);
            System.out.println("Good Job");
        }
        else {
            System.out.println("Wrong Answer");
        }

    }
}

