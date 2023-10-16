package primespackage;

public class Primes {
    public static boolean checkForPrime(int num)
    {
        int temp;
        boolean isp=true;
        for(int i=2;i<num;++i)
        {
            temp=num%i;
            if(temp==0)
            {
                isp=false;
                break;
            }
        }
        return isp;
    }
}


