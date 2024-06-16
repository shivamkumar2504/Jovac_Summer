package Assignment.Assignment_2;
import java.util.*;
public class Move_Zeros {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        move(arr);
    }
    public static void move(int[] arr) {
        int c=0;
        int j=0;
        int i=0;
        while(i<arr.length){
            if(arr[i]==0){
                c++;
            }
            else{
                arr[j] = arr[i];
                j++;
            }
            i++;
        }
        i=0;
        for(i=j;i<arr.length;i++){
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
