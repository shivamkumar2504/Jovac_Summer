package Assignment.Assignment_1;
import java.util.*;
public class Reverse_Integer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(reverse(x));
    }
    public static int reverse(int x) {
        long l=0;
        if(x>0)
        {
            l=rev(x);
            if(l>2147483647)
            {
                l=0;
            }
        }
        else if(x<0)
        {
            x=x*-1;
            l=rev(x);
            l=l*-1;
            if(l<-2147483648)
            {
                l=0;
            }
        }
        return (int)l;
    }
    public static long rev(int x)
    {
        long sum=0;
        while(x>0)
        {
            sum=(10*sum)+(x%10);
            x=x/10;
        }
        return sum;
    }
}
