package homework4.task4;

import homework4.task1.Bank;

public class User {

    private long id;
    private String name;
    private double balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private Bank bank;

    public User(String name) {
        this.name = name;
        this.balance = 1000;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString(){
        String str = "Name: %s; balance: %.2f";
        return String.format(str,this.name,this.balance);
    }
}
