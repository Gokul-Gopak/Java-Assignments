import java.util.Scanner;
import primespackage.*;

public class TwinPrimes {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter first no ");
        int a=s.nextInt();
        System.out.print("Enter second no ");
        int b=s.nextInt();
        s.close();

        System.out.print("Twin prime nos are : ");
        for(int i=a;i<b;++i)
        {
            Primes p=new Primes();

            if(p.checkForPrime(i) && p.checkForPrime(i+2) && i>1)
                System.out.print(" "+i+" , "+(i+2)+" \n"); }
    }
}


