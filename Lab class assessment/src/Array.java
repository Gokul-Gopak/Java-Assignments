import java.util.Scanner;
public class Array
{
    public static void main(String args[])
    {
        String reg[]= new String[5];
        int mark[] = new int[5];
        int i;
        float avg, total=0;
        Scanner s = new Scanner(System.in);

        for(i=0; i<5; i++)
        {
            System.out.print("Enter the registeration no. of student"+(i+1)+":");
            reg[i] = s.next();
            System.out.print("Enter Marks of student"+(i+1)+":");
            mark[i] = s.nextInt(); total+= mark[i];
        }
        s.close();
        for(i=0; i<5; i++)
        {

            System.out.print(reg[i]);
            System.out.print("The student Grade is: ");
            if(mark[i]>=90)
            {
                System.out.print("S\n");
            }
            else if(mark[i]>=80 && mark[i]<90)
            {
                System.out.print("A\n");
            }
            else if(mark[i]>=70 && mark[i]<80)
            {
                System.out.print("B\n");
            }
            else if(mark[i]>=60 && mark[i]<70)
            {
                System.out.print("C\n");
            }
            else if(mark[i]>=50 && mark[i]<60)
            {
                System.out.print("D\n");
            }
            else
            {
                System.out.print("F\n");
            }
        }
        avg= total/5;
        System.out.print("\nThe average is =" + avg);
    }
}
