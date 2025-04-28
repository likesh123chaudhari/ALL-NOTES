package com.demo.service;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.demo.beans.Coordinator;
import com.demo.dao.CourseDao;
import com.demo.dao.CourseDaoImpl;

public class CourseServiceImpl implements CourseService{
	private CourseDao cdao;

	public CourseServiceImpl() {
		super();
		this.cdao = new CourseDaoImpl();
	}

	@Override
	public boolean addNewCourse() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter course name");
		String cnm=sc.next();
		System.out.println("Enter cid");
		int cid=sc.nextInt();
		System.out.println("Enter name of coordinator");
		String coonm=sc.next();
		System.out.println("enetr coordinator Address");
		String addr=sc.next();
		Coordinator c=new Coordinator(cid, coonm, addr);
		return cdao.save(cnm,c);
	}

	@Override
	public Map<String, Coordinator> getAll() {
		return cdao.findAll();
	}

	@Override
	public boolean deleteByCname(String cnm) {
		return cdao.removeByCname(cnm);
	}

	@Override
	public boolean modifyCoordinator(String cnm, Coordinator coordinator) {
		return cdao.updateCoordinator(cnm,coordinator);
	}

	@Override
	public boolean modifyCourseName(String ocnm, String ncnm) {
		return cdao.updateCourseName(ocnm,ncnm);
	}

	@Override
	public Coordinator getByCourseName(String cnm) {
		return cdao.findByCourseName(cnm);
	}

	@Override
	public String getByCoordinatorId(int cid) {
		return cdao.findByCoordinatorId(cid);
	}

	@Override
	public List<String> getCoursesByCity(String ct) {
		return cdao.findCoursesByCity(ct);
	}

	@Override
	public Map<String, Coordinator> sortByCourename() {
		return cdao.arrangeByCname();
	}
	

}
