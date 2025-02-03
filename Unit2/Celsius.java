//Create a program to convert temperatures between Celsius and Fahrenheit.
//I have used some components that are going to learn in unit 3 and 4 but the basic idea is same for formulas and codes!!
//there is an error in loop where it exit,if you can kindly solve the issue or I will in future.
package Unit2;

import java.util.Scanner;

public class Celsius{
    public static void main(String[] args) {
        double f,k,c,cf,fc,fk,kf,ck,kc;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("This programe is made for conversion of different temeperature");
        do{
            System.out.println("Want to continue? [y/n]");
            ch = Character.toLowerCase(sc.nextLine().charAt(0));
            if (ch=='n') {
                System.out.println("Exiting from programe!!");
            }
            else{
                System.out.println("Choose the appropriate option:\n1.Celsius to Fahrenheit.\n2.Fahrenheit to celsius.\n3.Fahrenheit to Kelvin.\n4.Kelvin to Fahrenheit.\n5.Celsius to Kelvin.\n6.Kelvin to Celsius.");
                int fn = sc.nextInt();

                switch (fn) {
                    case 1:
                    System.out.println("Provide the value of C");
                    c = sc.nextDouble();
                    cf=(9*c+160)/5;
                    System.out.println("Here is you're value in Fahrenheit "+cf);
                        break;
 
                    case 2:
                    System.out.println("Provide the value of F");
                    f = sc.nextDouble();
                    fc=(5*f+160)/9;
                    System.out.println("Here is you're value in Celsius "+fc);
                        break;
 
                    case 3:
                    System.out.println("Provide the value of F");
                    f = sc.nextDouble();
                    kf=242.95-f;
                    System.out.println("Here is you're value in Kelvin "+kf);
                        break;

                    case 4:
                    System.out.println("Provide the value of k");
                    k = sc.nextDouble();
                    fk=242.95-k;
                    System.out.println("Here is you're value in Fahrenheit "+fk);
                        break;
                    case 5:
                    System.out.println("Provide the value of C");
                    c = sc.nextDouble();
                    kc=273.15-c;
                    System.out.println("Here is you're value in Kelvin "+kc);
                        break;

                    case 6:
                    System.out.println("Provide the value of K");
                    k = sc.nextDouble();
                    ck=273.15-k;
                    System.out.println("Here is you're value in Celsius "+ck);
                        break;
                         
                    default:
                    System.out.println("Kindly choose the right function!!!");
                        break;
                }
            }    
        }while(ch != 'n');
        sc.close();
    }

}