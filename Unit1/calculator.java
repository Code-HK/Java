//Develop a simple calculator program that performs basic arithmetic operations
//I have used some components that are going to learn in unit 3 and 4 but the basic idea is same for formulas and codes!!

package Unit1;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        
    
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the no.: A and B");
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    System.out.println("Choose the function:\n 1.Add \n 2.Sub \n 3.Mul \n 4.Div \n");
    int Ch = sc.nextInt();
    

    if(Ch ==1){
        int add = a+b;
        System.out.println("Here is your addition of no. " + add);
    }
   
    else if(Ch ==2){
        int sub = a-b;
        System.out.println("Here is your subtraction of no." + sub);
    }
    else if(Ch==3){
        int mul = a*b;
        System.out.println("Here is your multiplication of no." + mul);
    }
    else if(Ch==4){
        float div = a/b;
        System.out.println("Here is your division of no." + div);
    }
    else{
        System.out.println("Kindly restart buy choosing one of the given functions!!");
    }
    sc.close();
  }

}
