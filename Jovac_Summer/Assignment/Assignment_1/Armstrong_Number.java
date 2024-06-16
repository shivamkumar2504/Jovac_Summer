package Assignment.Assignment_1;
import java.util.*;
public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Arm(n));
    }
    public static boolean Arm(int n)
    {
        int m=n;
        int sum=0;
        while(m>0)
        {
            int r=m%10;
            sum= (int) (sum+Math.pow(r,3));
            m/=10;
        }
        if(sum==n)
        {
            return true;
        }
        return false;
    }
}
