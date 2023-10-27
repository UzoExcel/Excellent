package oop.Interface;

public class Account implements BankActivities{
    private Double balance;
    @Override
    public void deposit(Double amount) {
        this.balance = this.balance + amount;
    }

    @Override
    public Double viewBalance() {
        return this.balance;
    }

    @Override
    public Double withdraw(Double amount) {
        double v = this.balance - amount;
        return v;
    }
}
