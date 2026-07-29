interface Bank {
    void deposit();
}

class SBI implements Bank {
    public void deposit() {
        System.out.println("Amount deposited successfully");
    }

    public static void main(String[] args) {
        SBI bank = new SBI();
        bank.deposit();
    }
}
