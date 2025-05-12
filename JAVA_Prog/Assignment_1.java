/*
1. Accept 3 numbers from command line arguments. If number is prime, then print the table of 
the number. Other wise divide number by 10 and display output 
*/

class Table{
        
public static boolean isPrime(int n){
    
   for(int i=2; i<n; i++){
  
     if(n%i==0){
       return false;
    } 
   
  } 
 return true;
}

public static void tables(int n){
   
   if(isPrime(n)){
      for(int i=1; i<11; i++){
       System.out.println(n+" X "+i+ " = "+(n*i));
    }
   
  }
    else{
    System.out.println("\nNo. is Divide by 10 :"+(n/10));
   }
}

public static void main(String[] args){
  
   if(args.length == 3){
     
       for(int i=0; i<args.length; i++){
          tables(Integer.parseInt(args[i]));
     } 
   }
   else
    {
      System.out.println("Plz Enter Three ParaMeters ... ");
   }
 }

}