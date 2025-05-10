
public class Factorial 
{

//	public static int fact(int n)
//	{
//		if(n==1)
//		{
//			return 1;
//		}
//		return n * fact(n-1);
//		
//	}
//	
//	
//	public static void main(String[] args)
//	{
//		int x = 4;
//		System.out.println(fact(x));
//
//	}

	
	public static int add(int n) {
		if(n==1)
		{
			return 1;
		}
		return n+add(n-1);
	}
	public static void main(String[] args) {
		int x=10;
		System.out.println(add(x));
	}
}
