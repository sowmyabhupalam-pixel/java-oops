class Employee {
    int id = 101;
    String name = "Rahul";

    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.display();
    }
}  
