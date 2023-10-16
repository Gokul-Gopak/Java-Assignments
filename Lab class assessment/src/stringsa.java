import java.util.Scanner;
public class stringsa
{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str= s.nextLine();
        String strs= str.toLowerCase();
        int temp=0,counta=0,counte=0,counti=0,counto=0,countu=0;


        for (int i=0;i<strs.length();i++)
        {
            char c= strs.charAt(i);
            if(c=='a')
            {
                counta +=1;
            }
            if(c=='e')
            {
                counte +=1;
            }
            if(c=='i')
            {
                counti +=1;
            }
            if(c=='o')
            {
                counto +=1;
            }
            if(c=='u')
            {
                countu +=1;
            }

            if(counta <=1 && counte <=1 && counto <=1 && counti <=1 && countu <=1)
                temp=1;

        }

        if(temp==1)
            System.out.print("Vowgram");
        else
            System.out.print("Not vowgram");

    }
} 