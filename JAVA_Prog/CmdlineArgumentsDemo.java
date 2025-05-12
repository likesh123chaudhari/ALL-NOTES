class CmdlineArguments{
      public static boolean isPrime(int n){
     
      for(int i=2; i<n; i++){
      if(n%i==0){
     return false;
}
}

return true;         

}
public static void sumPrime(String[] arr){
     int sum =0;
   for(int i=0; i<arr.length; i++){
    int num = Integer.parseInt(arr[i]);
   

   if(isPrime(num)){
   sum += num;          
}
     
}
 System.out.println(sum);
} 


      
public static void main(String args[]){
	if(args.length>0){

       sumPrime(args);

}		
else{
	  System.out.println("Plz Enter Some ParaMeters ....");
}
}


}

