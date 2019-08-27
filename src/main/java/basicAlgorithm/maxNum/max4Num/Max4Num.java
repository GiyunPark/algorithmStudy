package basicAlgorithm.maxNum.max4Num;

public class Max4Num {

    public static void main(String[] args){
        int maxNum=Max4Num.max4(1,4,6,2);
        System.out.println(maxNum);

        int[] arrayNum={1,4,6,2};
    }
    static int max4(int a, int b, int c, int d){
        int max= a;
        if(b>max)
            max=b;
        if(c>max)
            max=c;
        if(d>max)
            max=d;
        return max;
    }

}
