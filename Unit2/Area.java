//Calculate area and perimeter of shapes
//I have used some components that are going to learn in unit 3 and 4 but the basic idea is same for formulas and codes!!
package Unit2;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        
        double a,b,c,ar;
        char st;

        do{
            System.out.println("This programe intended to find area of basic shapes!\nIf you sure you're in right place and want to continue press 'Y' \nOtherwise,if you think you've lost press 'N' to end this programe.");
            st = Character.toLowerCase(sc.next().charAt(0)); // Convert input to lowercase

            if (st == 'n') {
                break; // Exit the loop immediately if 'n' is entered
            }

            System.out.println("Enter the function you want to use :\n1.Square\n2.Rectangle\n3.Triangle\n4.Circle\n5.Parallelogram\n6.Trapezoid\n7.Ellipse\n");
            int ch = sc.nextInt();
            switch (ch) {

                case 1:
                System.out.println("Enter the length of 1 Side alone!!");
                a= sc.nextDouble();
                ar = a*a;
                System.out.println("Here is your area of Square: "+ar);     
                break;
    
                case 2:
                System.out.println("Enter the length ad width respectively!!");
                a= sc.nextDouble();
                b= sc.nextDouble();
                ar = a*b;
                System.out.println("Here is your area of Rectangle: "+ar);     
                break;
            
                case 3:
                System.out.println("Enter the base and height respectively!!");
                a= sc.nextDouble();
                b= sc.nextDouble();
                ar = (a*b)/2;
                System.out.println("Here is your area of Triangle: "+ar);     
                break;
                  
                case 4:
                System.out.println("Enter the radius of circle!!");
                a= sc.nextDouble();
                ar = 3.14*(a*a);
                System.out.println("Here is your area of circle : "+ar);     
                break;
       
                case 5:
                System.out.println("Enter the base and height respectively!!");
                a= sc.nextDouble();
                b= sc.nextDouble();
                ar = a*b;
                System.out.println("Here is your area of parallelogram : "+ar);     
                break;
       
                case 6:
                System.out.println("Enter the length of parallel side and height respectively!!");
                a= sc.nextDouble();
                b= sc.nextDouble();
                c=sc.nextDouble();
                ar = (a+b)/2*c;
                System.out.println("Here is your area of trapezoid: "+ar);     
                break;
    
                       
                case 7:
                System.out.println("Enter the length of semi-major and semi-minor axes of the ellipse respectively!!");
                a= sc.nextDouble();
                b= sc.nextDouble();
                ar = 3.14*a*b;
                System.out.println("Here is your area of ellipse: "+ar);     
                break;
    
                default:
                System.out.println("Kindly select a valid function from given!!!");
                break;
            }
        }
        while (st != 'n');
        System.out.println("Exiting program.");
        sc.close();

    }
}
