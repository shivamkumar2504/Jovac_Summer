package Assignment.Assignment_1;
import java.util.*;
public class Pallindrome_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {
        int rev=0;
        if(x==0)
        {
            return true;
        }
        else if(x<0)
        {
            return false;
        }
        else if(x>0)
        {
            rev=pal(x);
            if(x==rev)
            {
                return true;
            }
        }
        return false;
    }
    public static int pal(int x)
    {
        int sum=0;
        while(x>0)
        {
            sum=(10*sum)+(x%10);
            x/=10;
        }
        return sum;
    }
}
