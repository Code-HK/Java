package Unit4;

public class Fibonacci {
    public static void main(String[] args) {
        int a=10,fn=0,fo=1,nn;

        for(int i=0;i<=a;i++){
            System.out.print(fn + " , ");
            nn = fn+fo;
            fn=fo;
            fo=nn;
        }
    }
}
