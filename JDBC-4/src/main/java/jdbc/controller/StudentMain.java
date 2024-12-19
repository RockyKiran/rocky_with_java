package jdbc.controller;

import java.sql.SQLException;
import java.util.Scanner;

import jdbc4.dao.StudentCrud;
import jdbc4.dto.Student;

//import jdbc4.dto.Student;

// controller----- user interface(console)---->scanner
                 //execution starts---main()
public class StudentMain {
	static StudentCrud crud=new StudentCrud();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("........😍WELCOME BUDDY😍..............");
		
		boolean value=true;
		do {
			System.out.println();
			System.out.println("..........What you want,can you chose in below option:-- \n \n 1.Save \n 2.Delete \n 3.Update \n 4.Fetch \n 5.Exit");
			int key=sc.nextInt();
			switch (key) {
			case 1:System.out.println("saved dudee😉😉😉.....");
			save();
				break;
			case 2:System.out.println("Deleted dudee🫡🫡🫡.....");
			
			break;
			case 3:System.out.println("Updated dudee😒😒😒.....");
			
			break;
			case 4:System.out.println("Fetched dudee😑😑😑.....");
			
			break;
			case 5:System.out.println("exit dudee😏😏😏....."); 
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
		Student student=new Student(id, name, email, phNo, gender, age, qulification);
		try {
			crud.saveStudent(student);
		} catch (SQLException e) {
//			e.printStackTrace();
			 save();
			
		}
		
	
		
	}
}
