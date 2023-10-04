

public class Main {
    public static void main(String[] args) {
        
         int n =5;
        
         //  square(n);
          
          triangle17(n);
        
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
        for(int i=0; i<=n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("  ");
            }
            for(int j =0; j<=2*i; j++){
                    System.out.print("* ");
                }
       //   for(int j=0; j<n-i; j++){
       //           System.out.print(" ");
       //      }
            System.out.println();
        }
    }
    static void triangle8(int n){
        for(int i=0; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int j =0; j<=2*n - 2*i ; j++){
                    System.out.print("*");
                }
           // for(int j=0; j<i; j++){
           //         System.out.print(" ");
           //     }
            System.out.println();
        }
    }
   //shadow triangle
    static void triangle9(int n){
        triangle7(n);
        triangle8(n);
    }
   //flip triangle
    static void triangle10(int n){
       
        // 1st method

   // triangle1(n);
   // triangle2(n);

        //2nd method

     for(int i=1; i<= 2*n-1; i++) {
        int stars = i;
        if(i > n) stars = 2*n-i;
        for(int j =1; j<=stars; j++){
            System.out.print("*");
        }
        System.out.println();
     }  

    }
    static void triangle11(int n){

     for(int i=0; i<=n; i++) {
        int start = 1;
        if(i % 2 ==0) start = 1;
        else start = 0;
        for(int j =0; j<=i; j++){
            System.out.print(start);
            start = 1-start;
        }
        System.out.println();
     }  

    }

    static void triangle12(int n){
     int space = 2*n-2;
     for(int i=1; i<=n; i++) {
        
        for(int j =1; j<=i; j++){
            System.out.print(j);
            
        }
        
        for(int j =1; j<=space; j++){
            System.out.print(" ");
           
        }
        for(int j =i; j>=1; j--){
            System.out.print(j);
            
        }
        System.out.println();
        space -= 2;

     }  

    }
    static void triangle13(int n){
        int num = 1;
        for(int i = 1; i<=n; i++){
            
            for(int j = 1; j<=i; j++){
                System.out.print(num+" ");  
                num++;        
            }
            
            System.out.println();
        }
    }

    static void triangle14(int n){
        
        for(int i = 0; i<=n; i++){
            for(char ch = 'A'; ch<='A'+ i ; ch++ ){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    static void triangle15(int n){
        for(int i =1; i<=n; i++){
            for(char ch = 'A'; ch<='A'+n-i ; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }

    }
    static void triangle16(int n){
        for(int i =0; i<=n; i++){
            
            for(int j = 0; j<=i;j++){
                System.out.print((char)((int)('A'+i)) + " ");
            }
            System.out.println();
        }
    }

    static void triangle17(int n){
        for(int i = 0; i<=n; i++){
          for(int j = 0; j<=n-i; j++){
            System.out.print(" ");
          } 
          char ch ='A';
          int bp = (2*i+1)/2;
          for(int j = 1; j<=2*i+1; j++){
            System.out.print(ch);
            if(j<=bp)ch++;
            else ch--;
          }  
          for(int j = 0; j<=n-i-1; j++){
            System.out.print(" ");
          } 
          System.out.println();  
        }
    }
}

