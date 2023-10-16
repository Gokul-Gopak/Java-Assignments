import java.util.Scanner;

public class Oddeven {
    public static boolean isOdd(int number) {
        if (number<0){
            number*=-1;
        }
        if(number%2==1)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=s.nextInt();
        if (isOdd(num))
        {
            System.out.println(num+ " is an odd number ");
        }
        else
            {
            System.out.println(num+" is an even number ");
        }
    }
}
