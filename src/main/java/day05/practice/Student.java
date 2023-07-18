package day05.practice;

public class Student {

	String name;
	int id;
	Department department;

	public Student (String name, int id, Department department) {
		this.name = name;
		this.id = id;
		this.department = department;
	}


	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", department=" + department.toString() + "]";
	}

}