import java.util.Scanner;

public class StudentInfoDemo extends FriendsStructInf{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
		int choice;
		
		do {
			
			
			
			System.out.println("1. Add Friend & its Information \r\n"
					+ "2. Display All Friend \r\n"
					+ "3. Search by id \r\n"
					+ "4. Search by name \r\n"
					+ "5. Display all friend with a particular hobby     \r\n"
					+ "6. Exit");
			
			System.out.println("Enter the Choice : ");
			choice=sc.nextInt();
			
			switch(choice) {
			
			case 1 : FriendsService.AddFriends();
				break;
				
			case 2 : FriendsService.DispAllFriends();
				break;
			
			case 3 :
				System.out.println("Enter the Id : ");
				int id = sc.nextInt();
				FriendsStructInf f = FriendsService.SearchById(id);
				if(f!=null) {
					System.out.println(f);
				}
				else {
					System.out.println("Sorry The Person Your Trying To Find Is Not There ... ");
				}
				break;
			
			case 4 :
				System.out.println("Enter The Name OF Person : ");
				String name=sc.next();
				
				FriendsStructInf[] nfarr = FriendsService.SearchByName(name);
				
				if(nfarr != null) {
				  	for(int i=0; i<nfarr.length;i++) {
				  		  if(nfarr[i]==null)
				  			  break;
				  		System.out.println(nfarr[i]);
				  		System.out.println();
				  	}
				}
				else
					System.out.println("Sorry The Person Your Trying To Find Is Not There ... ");
				
				break;
		
			case 5 :
				System.out.println("Enter The Hobby To Find The Person ... ");
				String hobby=sc.next();
				FriendsStructInf[] hfarr = FriendsService.displayByHobby(hobby);
				if(hfarr != null) {
				  	for(int i=0; i<hfarr.length;i++) {
				  		  if(hfarr[i]==null)
				  			  break;
				  		System.out.println(hfarr[i]);
				  		System.out.println();
				  	}
				}
				else
					System.out.println("Sorry The Person Your Trying To Find Is Not There ... ");
				
				
				break;
				
			case 6 :
				System.out.println("Thank You For Visting ...");
				sc.close();
				break;
			
				default :
					System.out.println("Wrong Choice .. Plz Renter Your Choice ... ");
			}
			
		}while(choice!=6);
		
	}

}
