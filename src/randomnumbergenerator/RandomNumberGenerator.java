
package randomnumbergenerator;


import java.util.Scanner;

/**
 *
 * @author Mohamed Hany
 */
public class RandomNumberGenerator {

   
    public static void main(String[] args) {
       
        
        Scanner In = new Scanner(System.in);
        
        System.out.println("Enter Any number to choose The algorithm :");
        System.out.println("1) Multiplicative congruential generator (MCG) ");
        System.out.println("2) Inversive congruential generator (ICG)");
        System.out.println("3) Multiple Recursive generator (MRG)");
        System.out.println("4) Lagged Fibonacci generator (LFG)");
        System.out.println("5) Mid Square Method (MSM)");
        
        int number = In.nextInt();
        int x0 ; 
        int a  ;
        float m ;
      
        
        if(number == 1)
        {
                System.out.println("Input X0 , A , M respectivly:");
                x0 = In.nextInt();
                a= In.nextInt();
                m = In.nextFloat();
                MCG(x0,a,m);
                
        }
        
        if(number == 2)
        {
           
                System.out.println("Input  X0 , A , M respectivly:");
                x0 = In.nextInt();
                a= In.nextInt();             
                m = In.nextFloat();
                ICG(x0,a,m);
                
        }
         
        if(number == 3)
        {
                System.out.println("Input X0, M respectivly:");
                x0 = In.nextInt();
                m = In.nextFloat();
                MRG(x0,m);
                
        }
        
        if(number == 4)
        { 
                System.out.println("Input  X0, X1 , M respectivly:");
                x0= In.nextInt();
                int x1 = In.nextInt();
                m = In.nextFloat();
                LFG(x0,x1,2,1,m);
                
       }
         if(number == 5)
         {
                System.out.println(" Please Enter The Seed Value :");
                x0= In.nextInt();
                middleSquareMethod(x0);
     
        }
           
         
    }
    
    public static void MCG (int x1, int a, float m){
        float [] arr = new float[10];
        float formula ;
        float RN ;
        float X = x1;
        for(int i = 0; i < 10; i++){
            formula = (a * X) % m;
            RN = formula/m;
            arr[i] = RN ;
            System.out.println(arr[i]);
            X = formula;
           
                      
        }  
        
        for(int j=2;j<10;j++) {
            
            if (arr[1] == arr[j]) {
                
              int repeatation = j - 1;
              System.out.println("Sequence Length = " + repeatation);
                
              break ;
            }
           
        }
        
        
    }
    
    
    public static void ICG (int x1, int a , float m){
        float [] arr5 = new float[10];
        float formula ;
        float RN ;
        float X = x1;
        for(int i = 0; i < 10; i++){
            
            formula = ((1/X*a)) % m;
            RN = formula/m;
            arr5[i] = RN ;
            System.out.println(arr5[i]);
            X = formula;
        }
        
     
        for(int j=2;j<10;j++) {
            
            if (arr5[1] == arr5[j]) {
                
              int repeatation = j - 1;
              System.out.println("Sequence Length = " + repeatation);
                
              break ;
            }
            
            else {
                System.out.println("Sequence Length = No repetition ");
                break ;
            }
           
        }  
        
    }
    
    public static void MRG (int x1, float m){
        float [] arr3 = new float[10];
        float formula ;
        int [] multipliers = {42,23,6,45,10,19,24,12,161,45};
        float RN ;
        float total_ax = 50 + x1;
        float X = x1;
        for(int i = 0; i < 10; i++){
            
            total_ax += (multipliers[i]) *  X;
            
            formula = total_ax % m;
            RN = formula/m;
            arr3[i] = RN ;
            System.out.println(arr3[i]);
            X = formula;
            
        }
        
        for(int j=2;j<10;j++) {
            
            if (arr3[1] == arr3[j]) {
                
              int repeatation = j - 1;
              System.out.println("Sequence Length = " + repeatation);
                
              break ;
            }
            
            else {
                System.out.println("Sequence Length = No repetition ");
                break ;
            }
      
           
        }  
        
    }
    
    public static void LFG (int x1, int x2, int j, int k, float m){
        float [] X = new float[15];
        X[0] = x1;
        X[1] = x2;
        float formula ;
        float RN ;
        for(int i = j+1; i < 15; i++){
            formula = (X[i-j] + X[i-k]) % m;
            RN = formula/m;
            X[i] = RN ;
            System.out.println(X[i]);
            X[i] = formula;
        }
        
        
        for(int z=2;z<10;z++) {
            
            if (X[1] == X[z]) {
                
              int repeatation = z - 1;
              System.out.println("Sequence Length = " + repeatation);
                
              break ;
            }
            
            else {
                System.out.println("Sequence Length = No repetition ");
                break ;
            }
           
        }  
        
        

        
        
    }
    
    public static void middleSquareMethod (int seedvalue){
        float [] arr2 = new float[10];
        int x = seedvalue;
        int square ;
        String squared ;
        int midvalue ;
        for(int i = 0; i < 10;i++){
            square = x * x;
            squared = square+"";
            if(squared.length() < 8){
                for(int j = 0; j < 8 - squared.length();j++ ){
                    squared = "0"+squared;
                }
            }
            String temp = squared.charAt(2)+""+squared.charAt(3)+""+squared.charAt(4)+""+squared.charAt(5);
            midvalue = Integer.parseInt(temp);
            System.out.println((float)midvalue / 10000);
            x = midvalue;
            arr2[i] = x ;
            
        }
        
        for(int k=2;k<10;k++) {
            
            if (arr2[0] == arr2[k]) {
                    
                
              int repeatation = k - 1;
              System.out.println("Sequence Length = " + repeatation);
                
              break ;
            }
            
            else {
                System.out.println("Sequence Length = No repetition ");
                break ;
            }
           
        }  
              
        
    }
}

