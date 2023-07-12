package day03.practice;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "naresh");
        Employee employee2 = new Employee(2, "suresh");
        
        System.out.println("id = " + employee.getId() + ", name = " + employee.getName());
        System.out.println("id = " + employee2.getId() + ", name = " + employee2.getName());
    }
}
