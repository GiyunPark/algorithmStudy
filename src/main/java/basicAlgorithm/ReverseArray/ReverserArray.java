package basicAlgorithm.ReverseArray;

import java.util.Arrays;

public class ReverserArray {

    public static void main(String[] args){
        int[] a = new int[]{14,3,5,64,75,23,465,23,65};
        ReverserArray.reverse(a);
        System.out.println(Arrays.toString(a));
    }

    static void reverse(int[] a){
        for(int i=0; i<a.length/2; i++){
            swap(a, i, a.length-i-1);
        }
    }
    static void swap(int[] a, int i, int j){
            int temp = a[i];
            a[i]=a[j];
            a[j]=temp;
    }
}
