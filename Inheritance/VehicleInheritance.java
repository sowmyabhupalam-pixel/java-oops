class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
    }
}
