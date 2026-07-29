class Rectangle {
    int length;
    int width;

    Rectangle() {
        length = 10;
        width = 5;
    }

    void area() {
        System.out.println("Area = " + (length * width));
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.area();
    }
}
