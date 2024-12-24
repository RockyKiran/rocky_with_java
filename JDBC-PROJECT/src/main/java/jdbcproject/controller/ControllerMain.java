package jdbcproject.controller;

import java.sql.SQLException;
import java.util.Scanner;

import jdbcproject.dao.StudentRestr;
import jdbcproject.dto.StudentDetails;


public class ControllerMain {
	static StudentRestr crud=new StudentRestr();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("........😍WELCOME BUDDY😍..............");
		boolean value=true;
		do {
			System.out.println();
			System.out.println("..........What you want,can you chose in below option:-- \n \n 1.Registration \n 2.Login \n 3.Exit");
			int key=sc.nextInt();
			switch (key) {
			case 1:System.out.println("saved dudee😉😉😉.....");
			save();
				break;
			case 2:System.out.println("Login dudee🫡🫡🫡.....");
			break;
			case 3:System.out.println("exit dudee😏😏😏....."); 
			value=false;
			break;
			default:
				System.out.println("Enter Proper Value bro... (use ur Common sense😤😤)");
			}
		} while (value);
		
		System.out.println(".........Thank you Buddy For Doing SomeThing😂😂..........");
		System.out.println("............Visit again😁😁😁 ........");
	}
	private static void save() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id in Integer Type:- ");
		int id=sc.nextInt();
		System.out.println("Enter name in String Type:- ");
		String name=sc.next();
		System.out.println("Enter gmail in String Type:- ");
		String email=sc.next();
		System.out.println("Enter phone_No in Integer Type:- ");
		long phNo=sc.nextLong();
		System.out.println("Enter gender in String Type:- ");
		String gender=sc.next();
		System.out.println("Enter age in Integer Type:- ");
		int age=sc.nextInt();
		System.out.println("Enter Qualification in String Type:- ");
		String qulification=sc.next();
		System.out.println("Enter password in String Type:- ");
		String password=sc.next();
		System.out.println("Enter address in String Type:- ");
		String add=sc.next();
		StudentDetails student=new StudentDetails(id, name, email, phNo, gender, age, password, add, qulification);
		try {
			crud.saveStudent(student);
		} catch (SQLException e) {
			 save();
		}

	}

}
