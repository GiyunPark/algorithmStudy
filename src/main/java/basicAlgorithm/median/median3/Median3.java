package basicAlgorithm.median.median3;

import java.util.Scanner;

public class Median3 {

    public static void main(String[] args){
        long startTime=System.nanoTime();
        int median=Median3.med3(5,3,1);
        long estimatedTime=System.nanoTime()-startTime;
        System.out.println(median);
        System.out.println(estimatedTime);
    }
    static int med3(int a, int b, int c){
        if(a>=b)
            if(b>=c)
                return b;
            else if(c>=a)
                return a;
            else
                return c;
         else if(a>c)
             return a;
         else if(b>c)
             return c;
         else
             return b;
    }
}
