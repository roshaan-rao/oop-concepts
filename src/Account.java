public class Account {

    private float balance;

    public void deposit(float balance) {
        if (balance > 0)
            this.balance += balance;
    }

    public void withdraw(float balance) {
        if (balance > 0)
            this.balance -= balance;
    }

    public float getBalance() {
        return balance;
    }
}
