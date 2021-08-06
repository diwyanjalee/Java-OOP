import java.sql.SQLOutput;

public class Arrayii {
    public static void main (String [] args){
        int p [] [] ={
                        {2,4,6,8},
                        {0,3,6,9},
                        {1,3,5,7}
                     };
        for (int i=0;i<3;i++)
        {
            for (int k=0;k<4;k++)
            {
                System.out.print
                        (p[i] [k] +" ");
            }
            System.out.println("");
        }
    }
}
