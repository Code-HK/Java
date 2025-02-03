//Simple address book using arrays.

package Unit5;


import java.util.Arrays;
import java.util.Scanner;

public class addressbook {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   

    int b= sc.nextInt();

    String[] add = new String[b];

    for(int i = 0; i<b;i++){
      add[i]= sc.nextLine();
    }
    
    System.out.print(Arrays.toString(add));
    sc.close();
   }

}
