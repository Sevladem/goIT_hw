package homework2;

/**
 * Created by Сергей on 04.02.2017.
 * It is util class for task2(CalculateBalance), tas3(CalculateBalanceOfOwner), task4(FundingBalance)
 */
class Calculator {

    private double balance;
    private double withdrawal;
    private double commission;

    double getBalance() {
        return balance;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    double getWithdrawal() {
        return withdrawal;
    }

    void setWithdrawal(double withdrawal) {
        this.withdrawal = withdrawal;
    }

    double getCommission() {
        return commission;
    }

    void calculate(int persentOfCommision){

        commission = withdrawal*persentOfCommision/100;
        balance -= commission +withdrawal;

    }

}
