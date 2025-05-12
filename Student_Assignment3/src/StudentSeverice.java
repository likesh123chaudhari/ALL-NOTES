import java.util.Scanner;
public class StudentSeverice {
		static Student[] sarr = new Student[10];
		static  int count=0;
		
		public static void addStudent() {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter The Student ID :");
			int sid = sc.nextInt();
			
			sc.nextLine();
			System.out.println("Enter The Student Name :");
			String sname = sc.nextLine();
			
			
			
		sarr[count] = new Student(sid, sname);
			count++;
		}
		
		public static void dispStudent() {
			for(int i=0; i<count; i++) {
				System.out.println(sarr[i]);
			}
		}
		
		
		public static Student SearchById(int sid) {
			  for(int i=0; i<count; i++) {
				  if(sarr[i].getSid()==sid) {
					  return sarr[i];
				  }
			  }
			return null;
		}
		
		public static Student[] SearchByName(String sname){
			Student[] s=new Student[count];
			int c=0;
			
			for(int i=0;i<count; i++) {
				if(sarr[i].getSname().equals(sname)) {
					s[c]=sarr[i];
					c++;
				}
				
				
			}
			if(c>0)
				return s;
			else 
				return null;
		}

		
		
	}

}
