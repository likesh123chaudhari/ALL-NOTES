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
	static PreparedStatement selprod,selbyid,selByPrice,sorteddata,updateprod,insprod,delproduct;
	static {
		
		try {
			conn=DBUtil.getMyconnection();
			selprod=conn.prepareStatement("select * from product");
			selbyid=conn.prepareStatement("select * from product where pid=?");
			selByPrice=conn.prepareStatement("select * from product where price>?");
			sorteddata=conn.prepareStatement("select * from product order by price");
			updateprod=conn.prepareStatement("update product set price=?,qty=? where pid=?");
			insprod=conn.prepareStatement("insert into product values(?,?,?,?,?,?)");
			delproduct=conn.prepareStatement("delete from product where pid=?");
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
				Date dt=rs.getDate(5);
				LocalDate ldt=null;
				if(dt!=null) {
					ldt=dt.toLocalDate();
				}
			    Product p=new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getFloat(4),ldt,rs.getInt(6));
				plist.add(p);
				
			}
			return plist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

	@Override
	public void closeMyConnection() {
		DBUtil.closeMyConnection();
		
	}

	@Override
	public Product findById(int id) {
		try {
			selbyid.setInt(1, id);
			ResultSet rs=selbyid.executeQuery();
			if(rs.next()) {
				Date dt=rs.getDate(5);
				LocalDate ldt=null;
				if(dt!=null) {
					ldt=dt.toLocalDate();
				}
				Product p=new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getFloat(4),ldt,rs.getInt(6));
				return p;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<Product> findByPrice(float pr) {
		try {
			selByPrice.setFloat(1, pr);
			ResultSet rs=selByPrice.executeQuery();
			List<Product> plist=new ArrayList<>();
			while(rs.next()) {
				Date dt=rs.getDate(5);
				LocalDate ldt=null;
				if(dt!=null) {
					ldt=dt.toLocalDate();
				}
				Product p=new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getFloat(4),ldt,rs.getInt(6));
				plist.add(p);
				
			}
			if(plist.size()>0) {
				return plist;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Product> findSortedData() {
		ResultSet rs;
		try {
			rs = sorteddata.executeQuery();
			List<Product> plist=new ArrayList<>();
			while(rs.next()) {
				Date dt=rs.getDate(5);
				LocalDate ldt=null;
				if(dt!=null) {
					ldt=dt.toLocalDate();
				}
				Product p=new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getFloat(4),ldt,rs.getInt(6));
				plist.add(p);
				
			}
			return plist;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean changeProduct(int id, float pr, int qty) {
		try {
			updateprod.setFloat(1, pr);
			updateprod.setInt(2, qty);
			updateprod.setInt(3,id);
			int n=updateprod.executeUpdate();
			return n>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean saveProduct(Product p) {
		try {
			insprod.setInt(1,p.getPid() );
			insprod.setString(2, p.getPname());
			insprod.setInt(3,p.getQty());
			insprod.setFloat(4,p.getPrice());
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
	public boolean removeById(int id) {
		try {
			delproduct.setInt(1, id);
			int n=delproduct.executeUpdate();
			return n>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
