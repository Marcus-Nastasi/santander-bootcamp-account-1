package Entities.Accounts;

public class Account {

    private final int accountNumber;
    private final Double amount;

    public Account(int accountNumber, Double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public Double getAmount() {
        return amount;
    }
}

