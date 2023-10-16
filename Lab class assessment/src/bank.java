import java.util.Scanner;
class account
{
    String cusname;
    String type;
    int accno;
    float bal;
    public float getBal()
    {
        return bal;
    }
    public void setBal(float balance)
    {
        bal=balance;
    }
    public void setName(String name)
    {
        cusname=name;
    }
}
class sav_acct extends account
{
    sav_acct(int num,String name,String typ)
    {
        accno=num;
        bal=0;
        cusname=name;
        type=typ;
        System.out.println(" Savings account created");
        System.out.println("Acc. No. : "+accno);
        System.out.println("Customer name : "+cusname);
        System.out.println("Type : "+type);
        System.out.println("Balance : "+bal);
    }
    public static void compound(float rate, float time, float principle)
    {
        float compoundInterest=(float)(principle*Math.pow((1+rate/100),time));
        System.out.println("The Compound Interest is : "+compoundInterest);
    }
}
class cur_acct extends account
{
    float min;
    cur_acct(int num, float minimum, String name,String typ)
    {
        accno=num;
        bal=0;
        min=minimum;
        cusname=name;
        type=typ;
        System.out.println(" Current account created");
        System.out.println("Acc. No. : "+accno);
        System.out.println("Customer name : "+cusname);
        System.out.println("Type : "+type);
        System.out.println("Balance : "+bal);
        System.out.println("Minimum Balance : "+min);
    }

    public void withdraw(float wthdrw)
    {
        if (bal<wthdrw)
            System.out.println("Amount to be withdrawn is greater than balance");

        else
        {
            bal=bal-wthdrw;
            System.out.println("New Balance : "+this.getBal());
        }
    }
}
public class bank
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("\n\tCreating a savings bank account");
        System.out.print("Enter Name of customer of new account : ");
        String name=s.nextLine();
        System.out.print("Enter type of new account : ");
        String type=s.nextLine();
        sav_acct a=new sav_acct(1,name,type);
        System.out.print("Enter Amount to be added to balance : ");
        float bal=s.nextFloat();
        a.setBal(bal);
        System.out.println("New Balance : "+a.getBal());
        System.out.println("\n\tCalculating Compound Interest");
        System.out.print("Enter principle : ");
        float principle=s.nextFloat();
        System.out.print("Enter rate : ");
        float rate=s.nextFloat();
        System.out.print("Enter time : ");
        float time=s.nextFloat();
        sav_acct.compound(rate,time,principle);
        System.out.println("\n\tCreating a current bank account");
        System.out.print("Enter Name of customer of new account : ");
        s.nextLine();
        String curname=s.nextLine();
        System.out.print("Enter type of new account : ");
        String type_2=s.nextLine();
        System.out.print("Enter minimum Balance : ");
        float min=s.nextFloat();
        cur_acct b=new cur_acct(2,min,curname,type_2);
        System.out.print("Enter the balance : ");
        float x=s.nextFloat();
        if(x<min)
        {
            System.out.println("\n\nImposing penalty of $5 for balance less than minimum\n\n");
                    x-=5;
        }
        b.setBal(x);
        System.out.println("New Balance : "+b.getBal());
        System.out.print("Enter a withdrawal amount : ");
        float w=s.nextFloat();
        b.withdraw(w);
        s.close();
    }
}