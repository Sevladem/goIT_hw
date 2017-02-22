package homework4.task5;

import homework4.task1.Bank;
import homework4.task4.User;

public class BankSystemImpl implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {
        Bank bank = user.getBank();
        double balance = user.getBalance();
        double commission = amount*bank.getCommission(amount)/100;
        if(amount<bank.getLimitOfWithdrawal() && balance+commission>amount){
            balance -= amount;
            balance -= commission;
            user.setBalance(balance);
        }
    }

    @Override
    public void fundUser(User user, int amount) {
        Bank bank = user.getBank();
        if(amount<bank.getLimitOfFunding()){
            double balance = user.getBalance();
            double commission = amount*bank.getCommission(amount)/100;
            balance += amount;
            balance -= commission;
            user.setBalance(balance);
        }
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        double balanceOfFromUser = fromUser.getBalance();
        this.withdrawOfUser(fromUser,amount);
        if(balanceOfFromUser!=fromUser.getBalance()){
            this.fundUser(toUser,amount);
        }
    }

    @Override
    public void paySalary(User user) {
        Bank bank = user.getBank();
        user.setBalance(user.getBalance()+bank.getAvrSalaryOfEmployee());

    }
}
