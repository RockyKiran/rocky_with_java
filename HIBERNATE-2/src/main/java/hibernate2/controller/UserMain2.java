package hibernate2.controller;


import java.util.Scanner;

import javax.management.loading.PrivateClassLoader;

import hibernate2.dao.UserCrud;
import hibernate2.dto.User;


public class UserMain2 {
static UserCrud crud = new UserCrud();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("........😍WELCOME BUDDY😍..............");
		
		boolean value=true;
		do {
			System.out.println();
			System.out.println("..........What you want,can you chose in below option:-- \n \n 1.Save \n 2.Update \n 3.Delete \n 4.Fetch \n 5.Exit");
			int key=sc.nextInt();
			switch (key) {
			case 1:System.out.println("saved dudee😉😉😉.....");
			save();
				break;
			case 2:System.out.println("Deleted dudee🫡🫡🫡.....");
			update();
			break;
			case 3:System.out.println("Updated dudee😒😒😒.....");
			
			break;
			case 4:System.out.println("Fetched dudee😑😑😑.....");
			fetch();
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
		System.out.println("Enter Address in String Type:- ");
		String add=sc.next();
//		User student=new User(name, email, phNo, age, gender, add);
		User student=new User(id,name, email, phNo, age, gender, add);
//		crud.userSave(student);
		

	}
	private static void fetch() {
//		crud.userFetch(1);
	}
	private static void update() {
		Scanner sc=new Scanner(System.in);
		User user=new User();
		System.out.println("Enter which id you want to update in Integer Type:- ");
		int id=sc.nextInt();
		user.setId(id);

		boolean value=true;
		do {
			System.out.println("Which coulumn u want to update ");
			System.out.println("1.name \n 2.age \n 3.address \n 4.gender \n 5.phno \n 6.email \n 7.Exit");
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
				
				System.out.println("Enter address in String Type:- ");
				String address=sc.next();
				user.setAddress(address);
			}
			break;
			case 4:{
				System.out.println("Enter gender in String Type:- ");
				String gender=sc.next();
				user.setGender(gender);
			}
			case 5:{
				System.out.println("Enter phno in String Type:- ");
				long phno=sc.nextLong();
				user.setPhNo(phno);
			}
			case 6:{
				System.out.println("Enter email in String Type:- ");
				String email=sc.next();
				user.setEmail(email);
			}
			break;
			case 7:System.out.println("exit dudee😏😏😏....."); 
			value=false;
			break;
			default:
				System.out.println("Enter Proper Value bro... (use ur Common sense😤😤)");
			}
		} while (value);
		
		
		System.out.println(user);	
		
//		crud.userUpdate(user);
		
	}

}
