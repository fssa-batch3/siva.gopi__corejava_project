package day03.practice;

public class Employee {
	 
    private int id;
    private String name;
 
    public Employee(int id, String name) {
        setId(id);
        setName(name);
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("Invalid ID. ID must be a positive integer.");
        }
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Invalid name. Name cannot be null or empty.");
        }
    }
}
