package day05.practice;

public class Department {

	String deptName;
	int deptId;

	public Department(String deptName, int deptId) {
		this.deptId = deptId;
		this.deptName = deptName;
	}

	public void printDeptDetails() {
		System.out.println("Department Name: " + deptName);
		System.out.println("Department Id: " + deptId);
	}

	
	public String toString() {
		return "deptName=" + deptName + ", deptId=" + deptId;
	}
}