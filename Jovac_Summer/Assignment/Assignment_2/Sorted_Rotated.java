package Assignment.Assignment_2;
import java.util.*;
public class Sorted_Rotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(func(arr));
    }
    public static boolean func(int[] arr) {
        int n = arr.length;
        int c = 0;
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i])
                c++;
        }
        if(arr[n-1]>arr[0])
            c++;
        return c<=1;
    }
}
