class Employee {
    int id;
    String name;

    Employee() {
        id = 201;
        name = "Rahul";
    }

    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.display();
    }
}
