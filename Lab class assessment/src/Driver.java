import java.util.Scanner;
public class Driver {
    String Drivername;
    int age;
    String drivingLicensetype;
    Driver()
    {
        Drivername=" ";
        age=0;
        drivingLicensetype=" ";
    }
    Driver(String name,int old, String type)
    {
        Drivername=name;
        age=old;
        drivingLicensetype=type;
    }
    public static void main(String[] args) {
        Driver[] d=new Driver[10];
        Scanner s=new Scanner(System.in);
        System.out.println("No of drivers : ");
        int in=s.nextInt();
        s.nextLine();
        for(int i=0;i<in;++i)
        {
            System.out.println("Enter Name : ");
            String x=s.nextLine();
            System.out.println("Enter Age : ");
            int y=s.nextInt();
            s.nextLine();
            System.out.println("Enter License Type : ");
            String z=s.nextLine();
            d[i]=new Driver(x,y,z);
        }
        for(int i=0;i<in;++i)
        {
            if(d[i].drivingLicensetype.compareTo("HMV")==0)
            {
                System.out.println("\n\nName "+d[i].Drivername+"\nAge "+d[i].age+"\nLicense Type "+d[i].drivingLicensetype);
            }
        }
    }
}