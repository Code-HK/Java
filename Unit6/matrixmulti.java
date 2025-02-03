//Create a program to perform matrix multiplication.

package Unit6;

import java.util.Arrays;

public class matrixmulti {
    public static void main(String[] args) {
        int a,b,c,d,e,f,g,h;

        int[][] a1 ={{2,2},{2,2}};
        int[][] b1 ={{3,4},{5,6}};

        a = a1[0][0];
        b = a1[0][1];
        c = a1[1][0];
        d = a1[1][1];
        e = b1[0][0];
        f = b1[0][1];
        g = b1[1][0];
        h = b1[1][1];

        int[][] k = {{a*e+b*g,a*f+b*h},{c*e+d*g,c*f+d*h}};
        
        System.out.println(h);
        System.out.println(Arrays.deepToString(a1));
        System.out.println(Arrays.deepToString(b1));
        System.out.println(Arrays.deepToString(k));

        for(int ig = 0; ig<k.length;ig++){
            for(int jg = 0;jg<k[ig].length;jg++){
                System.out.print(k[ig][jg]+" ");
            } 
            System.out.println(" ");
        }
    }
}
