package Unit3;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int no=0;
        for(int i=1;i<=a;i++){
            if (a%i==0) {
                no++;
            }
        }
        if(no==2){
            System.out.println("It is a prime no.");
        }
        else{
            System.out.println("It is not a prime no.");
        }
        sc.close();
    }
}
