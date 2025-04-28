package com.demo.test;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.demo.beans.Coordinator;
import com.demo.service.CourseService;
import com.demo.service.CourseServiceImpl;

public class TestCourseMgnt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CourseService cservice=new CourseServiceImpl();
		int choice=0;
		do {
			System.out.println("1. add new course\n2. delete course\n3. modify course coordinator");
			System.out.println("4. modify course name\n5.display all\n 6. display by coursename");
			System.out.println("7. display courses in sorted order\n8. display course of a particular coodinator");
			System.out.println("9. display course of all cordinators who stays in given city\n 10.exit\n choice: ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				boolean status=cservice.addNewCourse();
				if(status) {
					System.out.println("course added");
				}else {
					System.out.println("course exists");
				}
				break;
			case 2:
				System.out.println("enter coursename to delete");
				String cnm=sc.next();
				status=cservice.deleteByCname(cnm);
				if(status) {
					System.out.println("deleted successfully");
				}else {
					System.out.println("not found");
				}
				break;
			case 3:
				System.out.println("enter course name to modify coordinator");
				cnm=sc.next();
				System.out.println("enter coordinator id");
				int cid=sc.nextInt();
				System.out.println("enter coordinator name");
				String coornm=sc.next();
				System.out.println("enter coordinator address");
				String addr=sc.next();
				status=cservice.modifyCoordinator(cnm,new Coordinator(cid, coornm, addr));
				
				if(status) {
					System.out.println("modified succesfully");
				}else {
					System.out.println("notfound");
				}
				break;
			case 4:
				System.out.println("enetr old coursename");
				String ocnm=sc.next();
				System.out.println("enetr new coursename");
				String ncnm=sc.next();
				status=cservice.modifyCourseName(ocnm,ncnm);
				if(status) {
					System.out.println("coursename modified");
				}else {
					System.out.println("not found");
				}
				break;
			case 5:
				Map<String,Coordinator> hm=cservice.getAll();
				hm.forEach((c,coor)->{
					System.out.println("course name :  "+c+"  coordinator: "+coor);
				});
				break;
			case 6:
				System.out.println("enetr course name to search");
				cnm=sc.next();
				Coordinator c=cservice.getByCourseName(cnm);
				if(c!=null) {
					System.out.println(cnm+"----->"+c);
				}else {
					System.out.println("not found");
				}
				break;
			case 7:
				Map<String,Coordinator> tmap=cservice.sortByCourename();
				tmap.forEach((cname,c1)->{
					System.out.println(cname+"---->"+c1);
				});
				break;
			case 8:
				System.out.println("enetr coordinator id to search coursename");
				cid=sc.nextInt();
				String cname=cservice.getByCoordinatorId(cid);
				if(cname!=null) {
					System.out.println("Course name :" +cname);
				}else {
					System.out.println("not found");
				}
				
				break;
			case 9:
				System.out.println("enter city");
				String ct=sc.next();
				List<String> clist=cservice.getCoursesByCity(ct);
				if(clist!=null) {
					clist.forEach(System.out::println);
				}else{
					System.out.println("not found");
				}
				break;
			case 10:
				sc.close();
				System.out.println("Thank you for visiting.......");
				break;
			default:
				System.out.println("wrong choice...");
			}
			
		}while(choice!=10);

	}

}
