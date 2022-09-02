package com.sumi.student;

import java.sql.SQLException;
import java.util.Scanner;
import com.sumi.student.Entity. Studententity ;
import com.sumi.student.service.Studentservice;


/**
 * Hello world!
 *
 */
public class App 
{
	  public static void main( String[] args )
	    {
		  Studentservice   as = new Studentservice();
			int Rollno,Contactno,standard ;
			String name,Emailid,city;
			char ch = 'Y';
			while(ch == 'Y')
			{
			System.out.println("*******Student Registration form***********");
			System.out.println("1)Add student\n2)View student\n3)Views student\n4)Updatestudent\n5)Delete student\n");
			Scanner ip = new Scanner(System.in);
			System.out.println("Enter your choice: ");
			int option = ip.nextInt();
			switch(option)
			{
				case 1:
					System.out.println("Enter student  details:");
					int count = ip.nextInt();;
					as.addStudent(count);
					break;
				case 2:
					System.out.println("Enter the  Rollno:");
					 Rollno = ip.nextInt();
					System.out.println(as.viewStudent( Rollno));
					break;
				case 3:
					for( Studententity a:as.viewsStudent())
					{
						System.out.println(a);
					}
					break;
				case 4:
					

					System.out.println("Enter the  Rollno :");
					 Rollno = ip.nextInt();
					System.out.println("Enter the  name :");
					name = ip.next();
					System.out.println("Enter the Contactno..");
					Contactno =ip.nextInt();
					System.out.println("Enter the city :");
					city = ip.next();
					System.out.println("Enter the Emailid :");
					Emailid = ip.next();
					System.out.println("Enter the standard :");
					standard = ip.nextInt();
					
					
				try {
					as.updateStudent(Rollno,name, Contactno,city,Emailid,standard);
				} catch (SQLException e) {
					System.out.println(e);
					e.printStackTrace();
				}
					break;
				
			
				
				case 5:
					System.out.println("Enter the  Rollno:");
					 Rollno = ip.nextInt();
					as.deleteStudent( Rollno);
					break;
				
				default:
					System.out.println("Invalid Choice..");
					break;
			}
			System.out.println("Enter Y to continue...");
			ch = ip.next().charAt(0);
			}
			System.out.println("Thank you for using...");
	    }

	    }


