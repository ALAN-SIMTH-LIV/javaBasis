package day3.train_three;

import java.io.Serializable;

public class BankAccount implements Serializable {
    private String accountNumber;
    private double balance;

    public BankAccount(){};

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    /**
     * 存款
     * @param amount 数量
     */
    public void deposit(double amount){
        this.balance = amount;
    }

    /**
     * 取款
     * @param amount 数量
     */
    public void withdraw(double amount){
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
