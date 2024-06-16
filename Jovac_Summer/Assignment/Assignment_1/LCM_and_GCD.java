package Assignment.Assignment_1;
import java.sql.SQLOutput;
import java.util.*;
public class LCM_and_GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        System.out.println(LCM(A,B)+" "+GCD(A,B));
    }
    public static int LCM(int A,int B)
    {
        int L=1;
        int i=2;
        while(A!=1 || B!=1)
        {
            if(A%i==0||B%i==0)
            {
                L=L*i;
                if(A%i==0)
                {
                    A/=i;
                }
                if(B%i==0)
                {
                    B/=i;
                }
            }
            i++;
        }
        return L;
    }
    public static int GCD(int A,int B)
    {
        int G=1;
        for(int i=2;i<=(Math.max(A,B)/2);i++)
        {
            if(A%i==0 && B%i==0)
            {
                G=i;
            }
        }
        return G;
    }
}
