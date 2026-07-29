class Car {
    String brand;
    int year;

    Car() {
        brand = "Toyota";
        year = 2024;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.display();
    }
}
