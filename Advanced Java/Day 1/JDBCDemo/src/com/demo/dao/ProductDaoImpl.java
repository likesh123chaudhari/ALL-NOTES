package com.demo.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.demo.model.Product;

public class ProductDaoImpl implements ProductDao{
	static Connection conn;
	static PreparedStatement selprod;
	static {
		
		try {
			conn=DBUtil.getMyconnection();
			selprod=conn.prepareStatement("select * from product");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Product> findAll() {
		
		try {
			ResultSet rs = selprod.executeQuery();
			List<Product> plist=new ArrayList<>();
			while(rs.next()) {
				//Date dt=rs.getDate(5);
				//LocalDate ldt=dt.toLocalDate();
				Product p=new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getFloat(4),null,rs.getInt(6));
				plist.add(p);
				
			}
			return plist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

}
