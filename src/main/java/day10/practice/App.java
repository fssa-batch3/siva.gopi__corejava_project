package day10.practice;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {

		
		System.out.println("Question 1");
		String email1 = "bakya@gmial.com";
		String email2 = "bakya@gmial.com";

		try {
			if (EmailValidator.isValidEmail(email1)) {
				System.out.println("Valid email :" + email1);
			}

		} catch (InvalidEmailException e) {
			e.printStackTrace();
		}

		System.out.println();
		System.out.println();
		System.out.println();

		
		System.out.println("Question 2");
		UserRegister userRegister = new UserRegister();
		User user1 = new User(1, "siva", "siva8270@.com");
		User user2 = new User(2, "siva ", "siva8270@.com");
		User user3 = new User(3, "siva", "siva8270@.com");
		try {
			userRegister.register(user1);
			userRegister.register(user2);
			userRegister.register(user3);
		} catch (Exception e) {
	
			e.printStackTrace();
		}
		ArrayList<User> userList = userRegister.getUserList();
		for (User user : userList) {
			System.out.println("User ID: " + user.id + ", Name: " + user.name + ", Email: " + user.email);
		}

		
	}

}
