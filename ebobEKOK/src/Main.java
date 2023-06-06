import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int i = 1;
        int smalln;
        int ebob=1;
        int ekok=1;

        System.out.print("Enter the first number :");
        int firstn = inp.nextInt();
        System.out.print("Enter the second number :");
        int secn = inp.nextInt();

        if (firstn>secn)
        {
            smalln = secn;
        }

        else
        {
            smalln=firstn;
        }


        while (i <= smalln)
        {
            i++;
            if (secn % i == 0 && firstn % i == 0)
                {
                   ebob=i;
                }

                ekok = (firstn*secn)/ebob;

        }       System.out.println("EBOB="+ebob);
                System.out.println("EKOK="+ekok);


    }


                }