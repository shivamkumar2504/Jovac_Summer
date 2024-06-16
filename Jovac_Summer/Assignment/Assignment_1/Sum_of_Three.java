package Assignment.Assignment_1;
import java.util.*;;
public class Sum_of_Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if(n<7 || n==9){
                System.out.println("No");
            }
            else if((n-3)%3!=0){
                System.out.println("YES");
                System.out.println("1 2 "+(n-3));
            }
            else if((n-5)%3!=0){
                System.out.println("YES");
                System.out.println("1 4 "+(n-5));
            }
        }
    }
}
