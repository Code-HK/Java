//Create a program to simulate a simple game of tic-tac-toe using a 2D array.
package Unit6;


import java.util.Arrays;

public class tictactoe {
    public static void main(String[] args) {
      

        int[][] j = {
                     {2,3,4},
                     {5,6,7},
                     {8,9,10}
                    };

        j[2][2]=13;

        System.out.println(Arrays.deepToString(j));
    }
}