
public class TestString {

	public static void main(String[] args) {
		String s="Hello";
		String s1="Hello";
		String s2=s;
		String s3=new String("Hello");
		System.out.println(s==s1); //true
		System.out.println(s==s3);  //false
		System.out.println(s.equals(s3)); //true

	}

}
