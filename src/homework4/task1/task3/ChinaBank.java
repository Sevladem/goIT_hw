package homework4.task1.task3;

import homework4.task1.Bank;
import homework4.task2.Currency;

public class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        switch (this.getCurrency()) {
            case EUR:
                return 150;
            case USD:
                return 100;
            default:
                return 0;
        }
    }

    @Override
    public int getLimitOfFunding() {
        switch (this.getCurrency()) {
            case EUR:
                return 5000;
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
                return 0;
            case USD:
                return 1;
            default:
                return 0;
        }
    }

    @Override
    public int getCommission(int summ) {

        if(summ<1000){
            switch (this.getCurrency()) {
                case EUR:
                    return 10;
                case USD:
                    return 3;
                default:
                    return 0;
            }
        } else {
            switch (this.getCurrency()){
                case EUR:
                    return 11;
                case USD:
                    return 5;
                default:
                    return 0;
            }
        }
    }
}
