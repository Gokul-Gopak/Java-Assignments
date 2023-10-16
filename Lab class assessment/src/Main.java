import java.util.*;
import java.io.*;
import java.net.*;
import java.lang.Math;

public class Main {
    public static int[] binary_decimal(String[] str)
    {
        int num[] = new int[32];
        int a, b, c, d, i, rem;
        a = b = c = d = 1;
        Stack<Integer> st = new Stack<Integer>();

       if (str != null)
        {
            a = Integer.parseInt(str[0]);
            b = Integer.parseInt(str[1]);
            c = Integer.parseInt(str[2]);
            d = Integer.parseInt(str[3]);
        }

        for (i = 0; i <= 7; i++)
        {
            rem = a % 2;
            st.push(rem);
            a = a / 2;
        }
        for (i = 0; i <= 7; i++) {
            num[i] = st.pop();
        }

        for (i = 8; i <= 15; i++) {
            rem = b % 2;
            st.push(rem);
            b = b / 2;
        }
        for (i = 8; i <= 15; i++) {
            num[i] = st.pop();
        }

        for (i = 16; i <= 23; i++) {
            rem = c % 2;
            st.push(rem);
            c = c / 2;
        }
        for (i = 16; i <= 23; i++) {
            num[i] = st.pop();
        }

        for (i = 24; i <= 31; i++) {
            rem = d % 2;
            st.push(rem);
            d = d / 2;
        }
        for (i = 24; i <= 31; i++) {
            num[i] = st.pop();
        }

        return (num);
    }

    public static int[] decimal_binary(int[] bi)
    {

        int[] arr = new int[4];
        int a, b, c, d, i, j;
        a = b = c = d = 0;
        j = 7;

        for (i = 0; i < 8; i++) {

            a = a + (int)(Math.pow(2, j)) * bi[i];
            j--;
        }

        j = 7;
        for (i = 8; i < 16; i++) {

            b = b + bi[i] * (int)(Math.pow(2, j));
            j--;
        }

        j = 7;
        for (i = 16; i < 24; i++) {

            c = c + bi[i] * (int)(Math.pow(2, j));
            j--;
        }

        j = 7;
        for (i = 24; i < 32; i++) {

            d = d + bi[i] * (int)(Math.pow(2, j));
            j--;
        }

        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        arr[3] = d;
        return arr;
    }

    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int i;
        String[] str = new String[4];
        System.out.println("Enter IP Address :  ");
        String ipr=s.nextLine();
        System.out.println("IP address is:" + ipr);

        String[] str1 = ipr.split("/");
        String tr = str1[0];
        str = tr.split("\\.");

        int[] b = new int[32];
        System.out.println();
        b = binary_decimal(str);

        int n = Integer.parseInt(str1[1]);
        int[] first = new int[32];
        int[] last = new int[32];
        int t = 32 - n;

        for (i = 0; i <= (31 - t); i++)
        {
            first[i] = b[i];
            last[i] = b[i];
        }

        for (i = 31; i > (31 - t); i--)
            first[i] = 0;
        for (i = 31; i > (31 - t); i--)
            last[i] = 1;

        System.out.println();

        int[] fs = decimal_binary(first);
        int[] ls = decimal_binary(last);

        System.out.println("First Address : " + fs[0] + "." + fs[1] + "." + fs[2] + "." + fs[3]);
        System.out.println("Last Address : " + ls[0] + "." + ls[1] + "." + ls[2] + "." + ls[3]);

        int x = (int)(Math.pow(2, t));
        System.out.println("No of addresses : " + x);
    }
}
