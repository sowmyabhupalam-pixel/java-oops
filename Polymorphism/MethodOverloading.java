class MethodOverloading {

    void display() {
        System.out.println("No parameters");
    }

    void display(String name) {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.display();
        obj.display("Sai Sowmya");
    }
}
