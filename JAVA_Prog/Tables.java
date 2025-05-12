/*1. accept a number, through command line and display the 
table of the number*/

class Tables{
// Display Table 
public static void tab(int n){

int tb=0;



 for(int i=1;i<=10; i++){

  tb=n*i;

System.out.println(n+"x"+i+" : " + tb);     

}


//return 0;
}


  
public static void main(String args[]){

if(args.length==1){
 int n= Integer.parseInt(args[0]);
 tab(n);
}
else{
System.out.println("Invalid Data");
}


}

}