package pyramid;

public class Triangle {

    public static void main(String[] args){

        Triangle.getTriangle01(10);
        Triangle.getTriangle02(10);
        Triangle.getTriangle03(10);
        Triangle.getTriangle04(10);
    }

    static void getTriangle01(int n){
        for(int i=1; i<=n; i++){
            for(int j=i; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void getTriangle02(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void getTriangle03(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void getTriangle04(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<n-i+1; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
