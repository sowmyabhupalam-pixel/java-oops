abstract class Employee {
    abstract void work();
}

class Manager extends Employee {
    void work() {
        System.out.println("Manager manages the team");
    }

    public static void main(String[] args) {
        Manager m = new Manager();
        m.work();
    }
}
