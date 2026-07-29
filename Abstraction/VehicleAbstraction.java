abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.start();
    }
}
