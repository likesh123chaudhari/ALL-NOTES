import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class FriendsService {
    
	 static int count =0;
	
     
	static FriendsStructInf[] farr= new FriendsStructInf[100];
	 
	
	
	public static void AddFriends() {
		 Scanner sc =new Scanner(System.in);
		//id,name,lastname,hobbies,mobno,email,bdate,address
		
		System.out.println("Enter The Name OF Friend : ");
		String name= sc.nextLine();
		
		System.out.println("Enter The Last Name : ");
		String lastName=sc.nextLine();
		
		System.out.println("Enter The  Bdate : ");
		String dt=sc.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date bdate=null;
		
		try{
			bdate=sdf.parse(dt);
			
		}
		catch(ParseException e){
			e.printStackTrace();
		}
		
		System.out.println("Enter The MobNO : ");
		String mobno=sc.nextLine();
		
		System.out.println("Enter The Email : ");
		String email=sc.nextLine();
	 
		System.out.println("Enter The Address : ");
		String address =sc.nextLine();
	 
		System.out.println("Enter How Many Hobbies You Have : ");
		int h=sc.nextInt();
		sc.nextLine();
		
		 String[] hobbies = new String[h];
		 
		 for(int i=0; i<h; i++) {
			 System.out.println("Enter your "+(i+1)+ " Hobby :");
			 hobbies[i]=sc.next();
		 }
	     
//		 farr[count]=new FriendsStructInf(name, lastName, bdate, mobno, email, address, hobbies);
		 farr[count]=new FriendsStructInf(name, lastName, bdate, mobno, email, address, hobbies);
		 
		 count++;
		 
	}



	public static void DispAllFriends() {
		System.out.println("\n");
		for(int i=0; i<count; i++) {
			
			System.out.println(farr[i]+"\n");
		
		}
		
	}



	public static FriendsStructInf SearchById(int id) {
		
		for(int i=0; i<count; i++) {
			
			if(farr[i].getId()==id) {
				
				return farr[i];
			}
			
		}
		return null;
	}



	public static FriendsStructInf[] SearchByName(String name) {
		FriendsStructInf[] nfarr = new FriendsStructInf[count];
		int c=0;
		
		for(int i=0; i<count ; i++) {
			
			if(farr[i].getName().equalsIgnoreCase(name)){
				nfarr[c]=farr[i];
				c++;
			}
			
		}
		
		if(c>0) {
			return nfarr;
		}
		else
			return null;
		
	}



	public static FriendsStructInf[] displayByHobby(String hobby) {
		FriendsStructInf[] hfarr = new FriendsStructInf[count];
		int c=0;
		
		for(int i =0; i<count; i++){
			String[] hobby1=farr[i].getHobbies();
			
			for(int j=0; j<hobby1.length;j++) {
				if(hobby1[j].equalsIgnoreCase(hobby)) {
					hfarr[c]=farr[i];
					c++;
				}
			}
			
		}
		if(c>0)
			return hfarr;
		else
		return null;
	}
       
}
