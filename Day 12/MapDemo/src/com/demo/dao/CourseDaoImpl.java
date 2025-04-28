package com.demo.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import javax.print.DocFlavor.STRING;

import com.demo.beans.Coordinator;

public class CourseDaoImpl implements CourseDao{
     static Map<String,Coordinator> cmap;
     static {
    	 cmap=new HashMap<>();
    	 cmap.put("DAC", new Coordinator(1,"Savita","Pune"));
    	 cmap.put("DTISS", new Coordinator(2,"Vidya","Pune"));
    	 cmap.put("DVLSI", new Coordinator(3,"Rajesh","Mumbai"));
     }
     
	@Override
	public boolean save(String cname, Coordinator c) {
		Scanner sc =new Scanner(System.in);
		if(!cmap.containsKey(cname)) {
			cmap.put(cname, c);
			return true;
		}
			
		else {
			System.out.println("duplicate key, do you want to ovrwrite?");
			String ch=sc.next();
			if(ch.equals("y")) {
				//overwrite the value of the key
				cmap.put(cname, c);
				return true;
			}
			return false;
			
				
		}
		
	}

	@Override
	public Map<String, Coordinator> findAll() {
		return cmap;
	}

	@Override
	public boolean removeByCname(String cnm) {
		if(cmap.remove(cnm)==null)
			return false;
		return true;
	}

	@Override
	public boolean updateCoordinator(String cnm, Coordinator coordinator) {
		if(cmap.containsKey(cnm)) {
			cmap.put(cnm, coordinator);
			return true;
		}
		return false;
	}

	@Override
	public boolean updateCourseName(String ocnm, String ncnm) {
		Coordinator c=cmap.remove(ocnm);
		if(c!=null) {
			cmap.put(ncnm, c);
			return true;
		}
		return false;
	}

	@Override
	public Coordinator findByCourseName(String cnm) {
		return cmap.get(cnm);
	}

	//find course name based on given coordinator id
	@Override
	public String findByCoordinatorId(int cid) {
		Set<String> cset=cmap.keySet();
		for(String cname:cset) {
			Coordinator c=cmap.get(cname);
			if(c.getCid()==cid)
				return cname;
		}
		return null;
	}

	@Override
	public List<String> findCoursesByCity(String ct) {
		List<String> clist=new ArrayList<>();
		Set<String> cset=cmap.keySet();
		for(String cname:cset) {
			Coordinator c=cmap.get(cname);
			if(c.getAddr().equals(ct))
			  clist.add(cname);
		}
		if(clist.size()>0)
		    return clist;
		return null;
	}

	@Override
	public Map<String, Coordinator> arrangeByCname() {
		Set<String> cset=cmap.keySet();
		Map<String,Coordinator> tmap=new TreeMap<>();
		for(String cname:cset) {
			Coordinator c=cmap.get(cname);
			tmap.put(cname, c);
		}
		return tmap;
	}
	

}
