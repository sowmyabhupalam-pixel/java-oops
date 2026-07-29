class Car {
    private String model;

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Toyota Innova");
        System.out.println("Model: " + car.getModel());
    }
}
