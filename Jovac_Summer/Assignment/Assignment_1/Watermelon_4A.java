package Assignment.Assignment_1;

import java.util.Scanner;

public class Watermelon_4A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>2&&n%2==0)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
