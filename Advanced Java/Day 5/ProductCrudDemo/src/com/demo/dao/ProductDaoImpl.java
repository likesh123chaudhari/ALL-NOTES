package com.demo.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.demo.model.Product;

public class ProductDaoImpl implements ProductDao{
	static Connection con;
	static PreparedStatement getAllProd,insprod,getprodById,updateById,delById;
	static {
		con=DBUtil.getMyconnection();
		try {
			getAllProd=con.prepareStatement("select * from product");
			insprod=con.prepareStatement("insert into product values(?,?,?,?,?,?)");
			getprodById=con.prepareStatement("select * from product where pid=?");
			updateById=con.prepareStatement("update product set pname=?,qty=?,price=? where pid=?");
			delById=con.prepareStatement("delete from product where pid=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public List<Product> findAllProducts() {
		try {
			ResultSet rs=getAllProd.executeQuery();
			List<Product> plist=new ArrayList<>();
			LocalDate ldt=null;
			Product p=null;
			while(rs.next()) {
				if(rs.getString(5)!=null) {
					 ldt=LocalDate.parse(rs.getString(5),DateTimeFormatter.ofPattern("yyyy-MM-dd"));
					 p=new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getFloat(4),ldt,rs.getInt(6));
			    }else {
			    	 
					 p=new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getFloat(4),null,rs.getInt(6));
			    }
				plist.add(p);
			}
			if(plist.size()>0) {
				return plist;
			}else {
				return null;
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public boolean save(Product p) {
		try {
			insprod.setInt(1, p.getPid());
			insprod.setString(2, p.getPname());
			insprod.setInt(3 ,p.getQty());
			insprod.setFloat(4, p.getPrice());
			insprod.setDate(5, Date.valueOf(p.getExpdate()));
			insprod.setInt(6, p.getCid());
			int n=insprod.executeUpdate();
			return n>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	@Override
	public Product findById(int pid) {
		try {
			getprodById.setInt(1, pid);
			ResultSet rs=getprodById.executeQuery();
			LocalDate ldt=null;
			Product p=null;
			if(rs.next()) {
				if(rs.getString(5)!=null) {
					 ldt=LocalDate.parse(rs.getString(5),DateTimeFormatter.ofPattern("yyyy-MM-dd"));
					 p=new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getFloat(4),ldt,rs.getInt(6));
			    }else {
			    	 
					 p=new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getFloat(4),null,rs.getInt(6));
			    }
				return p;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public boolean modifyProduct(Product p) {
		try {
			updateById.setString(1, p.getPname());
			updateById.setInt(2, p.getQty());
			updateById.setFloat(3, p.getPrice());
			updateById.setInt(4, p.getPid());
			int n=updateById.executeUpdate();
			return n>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public boolean removeById(int pid) {
		try {
			delById.setInt(1, pid);
			int n=delById.executeUpdate();
			return n>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	

}
