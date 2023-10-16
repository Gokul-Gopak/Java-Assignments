import java.util.*;
public class excepthandling
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);

        try
        {
            System.out.print("Enter Register Number : ");
            String regno=s.nextLine();
            System.out.print("Enter Mobile number : ");
            String mobno=s.nextLine();
            s.close();

            char[] reg=regno.toCharArray();
            char[] mob=mobno.toCharArray();

            if(reg.length!=9 || mob.length!=10)
            {
                throw new IllegalArgumentException();
            }

            for(int i=0;i<mob.length;++i)
            {
                if(!Character.isDigit(mob[i]))
                {
                    throw new NumberFormatException();
                }
            }

            for(int i=0;i<reg.length;++i)
            {
                if(!Character.isDigit(reg[i]) && !Character.isLetter(reg[i]))
                {
                    throw new NoSuchElementException();
                }
            }

            System.out.println("Valid");
        }

        catch(NumberFormatException x)
        {
            System.out.print("Mobile Number contains character/s other than a digit\nINVALID");
        }

        catch(IllegalArgumentException x)
        {
            System.out.print("Register Number does not contain exactly 9 characters or the Mobile Number does not contain exactly 10 characters\nINVALID");
        }

        catch(NoSuchElementException x)
        {
            System.out.print("Register Number contains character/s other than digits and alphabets\nINVALID");
        }
    }
}