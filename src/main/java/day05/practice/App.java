package day05.practice;

public class App {

	public static void main(String[] args) {
		Department dept1 = new Department("CSE", 123);

		Student stud1 = new Student("Siva", 333, dept1);

		System.out.println(stud1.toString());

	}
}
