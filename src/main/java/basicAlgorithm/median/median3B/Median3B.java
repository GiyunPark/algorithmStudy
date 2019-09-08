package basicAlgorithm.median.median3B;

public class Median3B {

    public static void main(String[] args){
        long startTime=System.nanoTime();
        int median= Median3B.med3(5,3,1);
        long estimatedTime=System.nanoTime()-startTime;
        System.out.println(median);
        System.out.println(estimatedTime);
    }

    static int med3(int a, int b, int c){
        if((b>=a && c<=a) || (b<=a && c>=a))
            return a;
        else if((a>b && c<b) || (a<b && c>b))
            return b;
        return c;
    }
}
