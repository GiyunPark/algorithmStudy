package pyramid;

public class Pyramid {

    public static void main(String[] args){
        Pyramid.getStarPyramid(10);
        Pyramid.getNumPyramid(10);
    }

    static void getStarPyramid(int n){
        for(int i=1; i<n; i++){
            for(int j=1; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void getNumPyramid(int n){
        for(int i=1; i<n; i++){
            for(int j=1; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
