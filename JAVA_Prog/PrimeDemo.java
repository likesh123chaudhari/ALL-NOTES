/* 2. accept 3 numbers from command line, display only prime numbers */


class PrimeDemo{

    void prime(int num1, int num2, int num3){
     boolean cnt=true;       


// for num 1 to check prime or not

    for(int i=2 ; i<num1; i++){
    if(num1%i == 0){
    cnt=false;  
 }
 }

if(cnt){
  System.out.println(num1);

}  

// for num 2 to check prime or not
cnt=true;
for(int i=2 ; i<num2; i++){
    if(num2%i == 0){
    cnt=false;
 }
 }
if(cnt){
System.out.println(num2);
}



// for num 3 to check prime or not
cnt=true;
for(int i=2 ; i<num3; i++){
    if(num3%i == 0){
   cnt=false;
 }
 }

if(cnt){
 System.out.println(num3);
}    

}     

public static void main(String args[]){

   if(args.length==3){
       int num1=Integer.parseInt(args[0]);
       int num2=Integer.parseInt(args[1]);
       int num3=Integer.parseInt(args[2]);
    
     PrimeDemo d = new PrimeDemo();
     d.prime(num1,num2,num3);

   }
   else{
    System.out.println("Invalid Arguments .. Plz Pass Only Three Parameters ..");
   }
}

}