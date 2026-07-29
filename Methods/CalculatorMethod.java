class CalculatorMethod {
    int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        CalculatorMethod obj = new CalculatorMethod();
        System.out.println("Result = " + obj.add(15, 25));
    }
}
