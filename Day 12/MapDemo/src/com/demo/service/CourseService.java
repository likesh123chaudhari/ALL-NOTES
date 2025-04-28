package com.demo.service;

import java.util.List;
import java.util.Map;

import com.demo.beans.Coordinator;

public interface CourseService {

	boolean addNewCourse();

	Map<String, Coordinator> getAll();

	boolean deleteByCname(String cnm);

	boolean modifyCoordinator(String cnm, Coordinator coordinator);

	boolean modifyCourseName(String ocnm, String ncnm);

	Coordinator getByCourseName(String cnm);

	String getByCoordinatorId(int cid);

	List<String> getCoursesByCity(String ct);

	Map<String, Coordinator> sortByCourename();

}
