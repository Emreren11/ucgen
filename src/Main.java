import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        int star;

        System.out.print("Satır sayısını giriniz: ");
        star=inp.nextInt();

        for (int i=0; i<star; i++)
        {
            for (int j=0; j<(star-i-1); j++)
            {
                System.out.print(" ");
            }
            for (int n=0; n<(2*i+1); n++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i=star-1; i>0; i--)
        {
            for (int j=0; j<star-i; j++)
            {
                System.out.print(" ");
            }
            for (int n=(2*i-1); n>0; n--)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
/*
   *
  ***
 *****
*******
 *****
  ***
   *
 */