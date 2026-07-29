class SquareMethod {
    int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        SquareMethod obj = new SquareMethod();
        System.out.println("Square = " + obj.square(5));
    }
}
