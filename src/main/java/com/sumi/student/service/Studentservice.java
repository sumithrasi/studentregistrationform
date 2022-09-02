package com.sumi.student.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import com.sumi.student.Entity. Studententity;
import com.sumi.student.Dao.Studentdao;


public class Studentservice {
	private Studentdao accDao = new Studentdao();
	private Scanner ip = new Scanner(System.in);
	
	public boolean addStudent(int count) {
		int n = 0;
		while(count > 0)
		{
			System.out.println("Enter the  Rollno :");
			int Rollno = ip.nextInt();
			System.out.println("Enter the  name :");
			String name = ip.next();
			System.out.println("Enter the Contactno..");
			int Contactno =ip.nextInt();
			System.out.println("Enter the city :");
			String city = ip.next();
			System.out.println("Enter the Emailid :");
			String Emailid = ip.next();
			System.out.println("Enter the standard :");
			int standard = ip.nextInt();
			
			
			try {
			if(accDao.insertStudent(Rollno,name, Contactno,city,Emailid,standard)==1);
				n++;
			}catch(Exception e)
			{
				System.out.println(e);
			}
			count--;
		}
		if(n>0)
			return true;
		else
			return false;
	}
	

	public  Studententity viewStudent(int Rollno) {
		return accDao.viewStudent(Rollno);
		
	}
	
	public  ArrayList < Studententity> viewsStudent() {
		return accDao.viewsStudent();
		
	}

	public int updateStudent(int Rollno,String name,int  Contactno,String city,String Emailid,int standard) throws SQLException{
		 {
		return accDao.updateStudent(Rollno,name, Contactno,city,Emailid,standard);

	}
	}
	public boolean deleteStudent(int Rollno) {
		accDao.deleteStudent(Rollno);
		return true;
		
	}

	

	
	
	}




