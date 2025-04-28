package com.demo.dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.demo.beans.ContractEmp;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;

public class EmployeeDaoImpl implements EmployeeDao{
	static Set<Employee> eset;
	static{
		eset=new HashSet<>();
		eset.add(new SalariedEmp(1,"Rajan",new Date(2020,04,27), "Gaming", "Designer", 444444));
		eset.add(new SalariedEmp(2,"Bhavika",new Date(2020,04,22),"bimedicle","analyst",333333));
		eset.add(new ContractEmp(3,"Revati",new Date(2001,11,22),"design","designer",40,12000));
		eset.add(new ContractEmp(4,"Amruta",new Date(1997,11,22),"Admin","manager",34,10000));
	}
	@Override
	public boolean save(Employee e) {
		return eset.add(e);
	}
	@Override
	public Set<Employee> findAll() {
		return eset;
	}
	@Override
	public boolean removeById(int id) {
	    return eset.remove(new SalariedEmp(id));
	}
	@Override
	public Employee findById(int id) {
		/*for(Employee e:eset) {
			if(e.getPid()==id) {
				return e;
			}
		}*/
		/*Iterator<Employee> it=eset.iterator();
		while(it.hasNext()) {
			Employee e=it.next();
			if(e.getPid()==id) {
				return e;
			}
		}*/
		
		Optional<Employee> e1=eset.stream().filter(e->e.getPid()==id).findFirst();
		if(e1.isPresent()) {
			return e1.get();
		}
			
		return null;
	}
	@Override
	public List<Employee> findByName(String nm) {
		//List<Employee> elist=new ArrayList<>();
		/*for(Employee e:eset) {
			if(e.getPname().equals(nm)) {
				elist.add(e);
			}
		}*/
		/*Iterator<Employee> it=eset.iterator();
		while(it.hasNext()) {
			Employee e=it.next();
			if(e.getPname().equals(nm))
				elist.add(e);
		}*/
		List<Employee> elist=eset.stream()
				       .filter(e->e.getPname().equals(nm))
				       .collect(Collectors.toList());
		if(elist.size()>0)
			return elist;
		return null;
	}
	@Override
	public List<Employee> findBySalary(double sal) {
		//List<Employee> elist=new ArrayList<>();
		/*for(Employee e :eset) {
			if(e instanceof SalariedEmp) {
				if(((SalariedEmp) e).getSal()>sal) {
					elist.add(e);
				}
			}else if(e instanceof ContractEmp){
				if(((ContractEmp) e).getcharges()>sal) {
					elist.add(e);
				}
			}
		}*/
		/*Iterator<Employee> it=eset.iterator();
		while(it.hasNext()) {
			Employee e=it.next();
			if(e instanceof SalariedEmp && ((SalariedEmp) e).getSal()>sal) {
				elist.add(e)
			}else {
				if(e instanceof ContractEmp && ((ContractEmp) e).getcharges()>sal) {
					elist.add(e);
				}
			}
		}*/
		List<Employee> elist=eset.stream().filter(e->{
			if(e instanceof SalariedEmp )
				return ((SalariedEmp) e).getSal() >sal;
			else if(e instanceof ContractEmp) {
				return ((ContractEmp) e).getcharges() >sal;
			}
			return false;
		}).collect(Collectors.toList());
		if(elist.size()>0)
			return elist;
		return null;
	}
	@Override
	public boolean modifyById(int id, double sal) {
		Employee e=findById(id);
		if(e!=null) {
			if(e instanceof SalariedEmp) {
				((SalariedEmp) e).setSal(sal);
			}else if( e instanceof ContractEmp) {
				((ContractEmp) e).setCharges(sal);
			}
			return true;
		}
		return false;
	}
	@Override
	public Set<Employee> arrangeById() {
		Set<Employee> tset=new TreeSet<>();
		for(Employee e:eset) {
			tset.add(e);
		}
		return tset;
	}
	@Override
	public List<Employee> arrangeByName() {
		Comparator<Employee> c=(e1,e2)->e1.getPname().compareTo(e2.getPname());
		List<Employee> elist=new ArrayList<>();
		for(Employee e:eset) {
			elist.add(e);
		}
		elist.sort(c);
		return elist;
	}
	@Override
	public List<Employee> arrangeBySal() {
		Comparator<Employee> c=(e1,e2)->{
			double m1=0,m2=0;
			if(e1 instanceof SalariedEmp) {
				m1=((SalariedEmp) e1).getSal();
			}else if(e1 instanceof ContractEmp){
				m1=((ContractEmp) e1).getcharges();
			}
			if(e2 instanceof SalariedEmp) {
				m2=((SalariedEmp) e2).getSal();
			}else if(e2 instanceof ContractEmp){
				m2=((ContractEmp) e2).getcharges();
			}
			return (int)(m1-m2);
		};
		List<Employee> elist=new ArrayList<>();
		for(Employee e:eset) {
			elist.add(e);
		}
		elist.sort(c);
		return elist;
	}
	

}
