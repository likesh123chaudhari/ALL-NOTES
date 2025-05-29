package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.model.Product;

public class ProductDaoImpl implements ProductDao{
	static Connection conn;
	static PreparedStatement prodselect;
	static {
		conn=DBUtil.getMyconnection();
		try {
			
			prodselect=conn.prepareStatement("select * from prodcat where catid=?");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public List<Product> getAllProduct(int c) {
		try {
			prodselect.setInt(1, c);
			ResultSet rs=prodselect.executeQuery();
			List<Product> pList=new ArrayList<>();
			while(rs.next()) {
				Product product=new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4),rs.getInt(5));
				pList.add(product);
			}
			return pList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<Product> findManyByCid(String[] parr) { //[14,16]
		StringBuilder stringBuilder = new StringBuilder();

	    for (int i = 0; i < parr.length; i++) {
	        stringBuilder.append("?,");  
	    }
	    String placeHolders = stringBuilder.deleteCharAt(stringBuilder.length() - 1)
	      .toString();
	    try {
	    String sql = "select * from prodcat where pid in (" + placeHolders + ")";
	    System.out.println("sql : "+sql);
	    PreparedStatement preparedStatement = conn.prepareStatement(sql);
	   
	    //it will replace ? with actual pid
	    for (int i = 1; i <= parr.length; i++) {
	        preparedStatement.setInt(i,Integer.parseInt(parr[i - 1]));
	    }
	        
	        
			ResultSet rs=preparedStatement.executeQuery();
			List<Product> pList=new ArrayList<>();
			while(rs.next()) {
				Product product=new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4),rs.getInt(5));
				pList.add(product);
			}
			return pList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return null;
	}
}
