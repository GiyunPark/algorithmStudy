package basicAlgorithm.minNum.min4Num;

public class Min4Num {

    public static void main(String[] args){
        int minNum=Min4Num.min4(5,32,1,5);
        System.out.println(minNum);
    }
    static int min4(int a, int b, int c, int d){
        int min= a;
        if(b<min)
            min=b;
        if(c<min)
            min=c;
        if(d<min)
            min=d;

        return min;
    }
}
