package hibernate2project.controller;

import java.sql.SQLException;
import java.util.Scanner;

import javax.persistence.Persistence;


import hibernate2project.dto.Useerrr;
import hibernate2projrct.dao.CrudUseerrr;

public class UserMain {
	static CrudUseerrr crud = new CrudUseerrr();
	static Scanner sc = new Scanner(System.in);
	

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("........😍WELCOME BUDDY😍..............");

		boolean value = true;
		do {
			System.out.println();
			System.out.println(
					"..........What you want,can you chose in below option:-- \n \n 1.Registration \n 2.Login \n 3.Exit");
			int key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("saved dudee😉😉😉.....");
				save();
				break;
			case 2:
				System.out.println("login  dudee🫡🫡🫡.....");
				login();
				break;
			case 3:
				System.out.println("exit dudee😏😏😏.....");
				value = false;
				break;
			default:
				System.out.println("Enter Proper Value bro... (use ur Common sense😤😤)");
			}
		} while (value);

		System.out.println(".........Thank you Buddy For Doing SomeThing😂😂..........");
		System.out.println("............Visit again😁😁😁 ........");
	}

	private static void login() {
		System.out.println("Enter your proper Gmail in String type:- ");
		String gamil=sc.next();
		System.out.println("Enter your phone Number in int type:- ");
		long num=sc.nextLong();
		try {
			crud.loginUser(gamil, num);
			boolean value=true;
			do {
				System.out.println();
				System.out.println("..........What you want to do...... \n can you chose in below option:-- \n \n 1.Profile \n 2.Update \n 3.Delete \n 4.Fetch \n 5.Exit");
				int key=sc.nextInt();
				switch (key) {
				case 1:System.out.println("Profile dudee😉😉😉.....");
				
					break;
				case 2:System.out.println("Updated dudee🫡🫡🫡.....");
				update();
				break;
				case 3:System.out.println("Deleted dudee😒😒😒.....");
				
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
			
			
			
			
		} catch (Exception e) {
			System.out.println("Please enter your correct mail and password");
			login();
		}
		
	}

	

	private static void save() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter name in String Type:- ");
		String name = sc.next();
		System.out.println("Enter gmail in String Type:- ");
		String email = sc.next();
		System.out.println("Enter phone_No in Integer Type:- ");
		long phNo = sc.nextLong();
		System.out.println("Enter gender in String Type:- ");
		String gender = sc.next();
		System.out.println("Enter age in Integer Type:- ");
		int age = sc.nextInt();
		System.out.println("Enter mark in integer Type:- ");
		double mark = sc.nextDouble();
		Useerrr Userr = new Useerrr(name, email, phNo, age, mark);
		crud.userSave(Userr);

	}
	private static void update() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Useerrr user=new Useerrr();
		System.out.println("Enter which id you want to update in Integer Type:- ");
		int id=sc.nextInt();
		user.setId(id);

		boolean value=true;
		do {
			System.out.println("Which coulumn u want to update ");
			System.out.println("1.name \n 2.age \n 3.mark \n 4.phno \n 5.email \n 6.Exit");
			int key=sc.nextInt();
			switch (key) {
			case 1:{	
				System.out.println("Enter new name in String Type:- ");
				String name=sc.next();
				user.setName(name);
			}
				break;
			case 2:{
			System.out.println("Enter new age in String Type:- ");
			int age=sc.nextInt();
			user.setAge(age);
			}
			break;
			
			
			case 3:{
				System.out.println("Enter gender in String Type:- ");
				Double mark=sc.nextDouble();
				user.setMark(mark);
			}
			break;
			case 4:{
				System.out.println("Enter phno in String Type:- ");
				long phno=sc.nextLong();
				user.setPhNo(phno);
			}
			break;
			case 5:{
				System.out.println("Enter email in String Type:- ");
				String email=sc.next();
				user.setEmail(email);
			}
			break;
			
			case 6:System.out.println("exit dudee😏😏😏....."); 
			value=false;
			break;
			default:
				System.out.println("Enter Proper Value bro... (use ur Common sense😤😤)");
			}
		} while (value);
		
		
		System.out.println(user);	
		
		crud.userUpdate(user);
		
		
	}

}
