interface Calculator {
    int add(int a, int b);
}

class SimpleCalculator implements Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        SimpleCalculator sc = new SimpleCalculator();
        System.out.println("Sum = " + sc.add(10, 20));
    }
}
