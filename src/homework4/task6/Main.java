package homework4.task6;

import homework4.task1.Bank;
import homework4.task1.task3.ChinaBank;
import homework4.task1.task3.EUBank;
import homework4.task1.task3.USBank;
import homework4.task2.Currency;
import homework4.task4.User;
import homework4.task5.BankSystemImpl;

public class Main {
    public static void main(String[] args) {

        Bank[] banks = new Bank[6];
        banks[0] = new USBank(1,"USA", Currency.USD,1,550.0,3,3000);
        banks[1] = new USBank(2,"USA",Currency.EUR,2,650.0,5,2000);
        banks[2] = new EUBank(3,"EU",Currency.USD,3,450.0,7,4000);
        banks[3] = new EUBank(4,"EU",Currency.EUR,4,750.0,9,4000);
        banks[4] = new ChinaBank(5,"China",Currency.USD,5,250.0,11,2000);
        banks[5] = new ChinaBank(6,"China",Currency.EUR,6,850.0,13,3000);

        BankSystemImpl bankSystem = new BankSystemImpl();

        User[] users = new User[6];
        for (int i = 0; i < users.length; i++) {
            users[i] = new User("User"+(i+1));
            users[i].setBank(banks[i]);
        }
        for (int i = 0; i < users.length; i++) {
            bankSystem.withdrawOfUser(users[i],100);
            bankSystem.fundUser(users[i],50);
            bankSystem.transferMoney(users[i],((i+1) == 6 ? users[0] : users[i+1]),150);
            bankSystem.paySalary(users[i]);
            System.out.println(users[i].toString());
        }

    }
}
