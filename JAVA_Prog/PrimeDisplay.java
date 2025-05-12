class PrimeDisplay{
	public static void isPrime(int num){
	boolean flag=true;
	for(int i=2;i<num;i++){
		if(num%i == 0)
			flag=false;
	}
		if(flag)
		System.out.println(num);

}

    public static void main(String[] args) {
        if (args.length == 3) {
            for(int j=0;j<3;j++){
		isPrime(Integer.parseInt(args[j]));
}
        } else {
            System.out.println("Enter 3 input parameters");
        }
    }
}





