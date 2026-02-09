class Account {
    private int id;
    private String holder = null;
    private int balance = 0;
    private int creditLimit = 0;

    // AllArgsConstructor
    public Account(int id, String holder, int balance, int creditLimit) {
        this.id = id;
        this.holder = holder;
        this.balance = balance;
        this.creditLimit = creditLimit;
    }

    // NoArgsConstructor
    public Account() {
        this.id = (int) Math.ceil(Math.random() * 10000);
    }

    public Account(String holder) {
        this.id = (int) Math.ceil(Math.random() * 10000);
        this.holder = holder;
    }

    public String toString() {
        return String.format("Konto Nr. %d (%s), Stand: %d ct, Limit %d ct", id, holder, balance, creditLimit);
    }

    public void processDeposit(int amount) {
        if (amount < 0) return;

        this.balance += amount;
    }

    public void processPayment(int amount) {
        if (amount < 0) return;

        if (this.balance - amount < 1 - creditLimit) {
            System.out.println("Deckung nicht ausreichend!");
            return;
        }

        this.balance -= amount;
    }

    public int getBalance() {
        return this.balance;
    }

    public static void main() {
        Account account = new Account(4711, "Donald Duck", 500, 1000);
        System.out.println(account);
        account.processDeposit(200);
        System.out.println(account);
        account.processPayment(400);
        System.out.println(account);
        account.processPayment(2000);
        System.out.println(account);
    }
}
