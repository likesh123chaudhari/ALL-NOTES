package com.demo.dao;

import java.util.List;
import java.util.Map;

import com.demo.beans.Coordinator;

public interface CourseDao {

	boolean save(String cnm, Coordinator c);

	Map<String, Coordinator> findAll();

	boolean removeByCname(String cname);

	boolean updateCoordinator(String cnm, Coordinator coordinator);

	boolean updateCourseName(String ocnm, String ncnm);

	Coordinator findByCourseName(String cnm);

	String findByCoordinatorId(int cid);

	List<String> findCoursesByCity(String ct);

	Map<String, Coordinator> arrangeByCname();

}
