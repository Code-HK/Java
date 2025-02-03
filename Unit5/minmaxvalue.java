//Implement a program to find the maximum and minimum values in an array.

package Unit5;


import java.util.Arrays;
import java.util.Scanner;

public class minmaxvalue {
    public static void main(String[] args) {
        int a,c;

        Scanner sc= new Scanner(System.in);
        a= sc.nextInt();
        
        int[] b  = new int[a];
        for(int i = 0;i<a;i++){
            b[i] = sc.nextInt();
        }
        Arrays.sort(b);

        c = b[a-1];


        System.out.println("min-------" +b[0]);
        System.out.println("Max-------" +(c));
        System.out.println("Whole array---------"+Arrays.toString(b));

        sc.close();
    }
}
