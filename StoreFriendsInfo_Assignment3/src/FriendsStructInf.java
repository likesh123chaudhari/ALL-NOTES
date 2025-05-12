import java.util.Arrays;
import java.util.Date;

public class FriendsStructInf{

	//id,name,lastname,hobbies,mobno,email,bdate,address;
	
	private int id;
	private String name;
	private String lastName;
	private Date bdate;
	private String mobno;
	private String email;
	private String address;
	private String[] hobbies;
	
	static int c=1;
	
	 public FriendsStructInf(){
			id=0;
			name=null;
			lastName=null;
			bdate=null;
			mobno = null;
			email = null;
			address = null;
			hobbies= new String[0];
		}
   


    public FriendsStructInf(String name, String lastName,Date bdate, String	mobno, String email,String address, String[] hobbies) {
		this.id=c;
		this.name=name;
		this.lastName=lastName;
		this.bdate=bdate;
		this.mobno=mobno;
		this.email=email;
		this.address=address;
		this.hobbies=hobbies;
         c++;
    }

    
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Date getBdate() {
		return bdate;
	}


	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}


	public String getMobno() {
		return mobno;
	}


	public void setMobno(String mobno) {
		this.mobno = mobno;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String[] getHobbies() {
		return hobbies;
	}


	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}


	@Override
	public String toString() {
		return "Id : " + id + "\nName :" + name + "\nLastName : " + lastName + "\nBdate : " + bdate
				+ "\nMobno : " + mobno + "\nEmail : " + email + "\nAddress : " + address + "\nHobbies :"
				+ Arrays.toString(hobbies);
	}	
	
    
    
}
