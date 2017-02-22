package homework4.task3;

import homework4.task1.Bank;
import homework4.task2.Currency;

public class EUBank extends Bank {
    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        switch (this.getCurrency()) {
            case EUR:
                return 2200;
            case USD:
                return 2000;
            default:
                return 0;
        }
    }

    @Override
    public int getLimitOfFunding() {
        switch (this.getCurrency()) {
            case EUR:
                return 20000;
            case USD:
                return 10000;
            default:
                return 0;
        }
    }

    @Override
    public int getMonthlyRate() {
        switch (this.getCurrency()) {
            case EUR:
                return 1;
            case USD:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public int getCommission(int summ) {

        if(summ<1000){
            switch (this.getCurrency()) {
                case EUR:
                    return 2;
                case USD:
                    return 5;
                default:
                    return 0;
            }
        } else {
            switch (this.getCurrency()){
                case EUR:
                    return 4;
                case USD:
                    return 7;
                default:
                    return 0;
            }
        }
    }
}
