

public class Main {
    public static void main(String[] args) {
        
        int n =6;
        
       //   square(n);
          triangle7(n);
       

    }
    static void square(int n){
         
        
        for(int i =1 ; i<=n; i++){
            for(int j = 1;j<=5; j++ ) {
                System.out.print("* ");
            }
             System.out.println();
        }
    }
 //--------------------------------------Types of triangle------------------------------------------  

    static void triangle1(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    static void triangle2(int n){

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    static void triangle3(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i ; j++){
                System.out.print(i);
            }
            System.out.println();
        }

    }
    static void triangle4(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
    static void triangle5(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
    static void triangle6(int n){

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print(i);
            }
            System.out.println();
        }

    }

    static void triangle7(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("");
                for(int k=1; k<=j; k++){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}

