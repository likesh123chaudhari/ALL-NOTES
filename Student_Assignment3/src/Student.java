import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
			// TODO Auto-generated method stub
	        
		   Scanner sc = new Scanner (System.in);
		   int choice;
		   
		   do{
			   System.out.println("1) Enter New Student \n2) Display Student Data \n3) Search by Id \n4) Search By Name \n5)display The hobies \n6) Exit");
			   System.out.println("Enter The Choice : ");
			   choice=sc.nextInt();
			   
			   switch(choice) {
			     
			   case 1 : StudentService.addStudent();
				   break;
			     
			   case 2 : StudentService.dispStudent();
				   break;
			     
			   case 3 :
				   System.out.println("Enter The Student Id : ");
				   int sid=sc.nextInt();
				   Student s =StudentService.SearchById(sid);
				   if(s != null) {
					   System.out.println(s);
				   }
				   else {
					   System.out.println("No Student Available at This ID \n");
				   }
				   break;
			     
			   case 4 :
				    System.out.println("Enter The Name : ");
				    String sname=sc.nextLine();
				    Student[] snameArr=StudentService.SearchByName(sname);
				    if(snameArr != null) {
				    	for(int i=0;i<snameArr.length;i++) {
				    		if(snameArr[i]==null)
				    			break;
				    		System.out.println(snameArr[i]);
				    	}
				    }
				    else {
				    	System.out.println("Person Not Found ...");
				    }
				   break;
			   
			   case 5 :
				     System.out.println("Enter the SId To Calculate GPA ..");
				     int id=sc.nextInt();
				   Student s1 = StudentService.SearchById(id);
//				     //Student s1 = new Student();
			     System.out.println("GPA of Sid :"+id+" : "+s1.getGpa() );
				    System.out.println();
				   break;
			   case 6 :
				   System.out.println("Thanks For Visiting .....");
				   sc.close();
				   break;
				   
				default : 
					System.out.println("Wrong Choice Plz Try Again ......");
			   }
			   
		   }while(choice != 4);
		}

	}