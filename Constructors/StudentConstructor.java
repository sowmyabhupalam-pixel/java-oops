class Student {
    int id;
    String name;

    Student() {
        id = 101;
        name = "Sai";
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
