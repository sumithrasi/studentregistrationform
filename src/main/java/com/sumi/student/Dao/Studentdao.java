package com.sumi.student.Dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import java.util.ArrayList;


import com.sumi.student.Entity.Studententity;

public class Studentdao {

	private Connection con;
	private PreparedStatement pst;
	
	private ResultSet rs;

	public Connection getConnect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/b6835", "root", "sumithra");
		} catch (Exception e) {
			System.err.println(e);
		}
		return con;
	}
	public int insertStudent(int Rollno,String name, int Contactno,String city,String Emailid,int standard) throws SQLException
	 {
		{
		int n = 0;
		
		con = getConnect();
		pst = con.prepareStatement("insert into student values(?,?,?,?,?,?)");
		pst.setInt(1, Rollno);
		pst.setString(2, name);
		pst.setInt(3, Contactno);
		pst.setString(4,city );
		pst.setString(5,Emailid );
		pst.setInt(6, standard);
		
		n = pst.executeUpdate();
	/*} catch (SQLException e) {
		e.printStackTrace();
	}*/
	return n;
}
	}
	

	public Studententity viewStudent(int Rollno) {
		try {
			con = getConnect();
			ResultSet rs = null;
			pst = con.prepareStatement("select * from student where Rollno=?");
			pst.setInt(1, Rollno);
			rs = pst.executeQuery();
			if(rs.next())
			{
				return new Studententity(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getInt(6));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	

	public ArrayList<Studententity> viewsStudent() {
		ArrayList<Studententity> al = new ArrayList<Studententity>();
		try {
			con = getConnect();
			ResultSet rs = null;
			pst = con.prepareStatement("select * from student");
			rs = pst.executeQuery();
			while(rs.next())
			{
				al.add(new Studententity(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getInt(6)));
			}
			return al;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	

	public int updateStudent(int Rollno,String name, int Contactno,String city,String Emailid,int standard) throws SQLException{
		  {
		int n = 0;
		try {
			con = getConnect();
			Statement st = con.createStatement();
			String sql = "update student set Rollno='"+Rollno+"' where name='"+name+"'and Contactno='"+
					Contactno+"'and+ city='"+city+"'and+Emailid='"+Emailid+"'and+standard='"+standard+"'";
					
			n = st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}
	
	}
	

	public int deleteStudent(int Rollno) {
int n = 0;
		
		try {
			con = getConnect();
			pst = con.prepareStatement("delete from student where Rollno = ?");
			pst.setInt(1, Rollno);
			n = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}



}
	
		