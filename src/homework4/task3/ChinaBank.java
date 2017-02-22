package homework4.task3;

import homework4.task1.Bank;
import homework4.task2.Currency;

public class ChinaBank extends Bank {

    private  static final int LIMIT_OF_WITHDRAWAL_EUR = 150;
    private  static final int LIMIT_OF_WITHDRAWAL_USD = 100;
    private  static final int LIMIT_OF_FUNDING_EUR = 5000;
    private  static final int LIMIT_OF_FUNDING_USD = 10000;
    private  static final int MONTHLY_RATE_EUR = 0;
    private  static final int MONTHLY_RATE_USD = 1;
    private  static final int LOW_COMMISSION_EUR = 10;
    private  static final int HIGHT_COMMISSION_EUR = 11;
    private  static final int LOW_COMMISSION_USD = 3;
    private  static final int HIGHT_COMMISSION_USD = 5;
    private  static final int LIMIT_FOR_CHANGE_OF_COMMISSION = 1000;

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        switch (this.getCurrency()) {
            case EUR:
                return LIMIT_OF_WITHDRAWAL_EUR;
            case USD:
                return LIMIT_OF_WITHDRAWAL_USD;
            default:
                return 0;
        }
    }

    @Override
    public int getLimitOfFunding() {
        switch (this.getCurrency()) {
            case EUR:
                return LIMIT_OF_FUNDING_EUR;
            case USD:
                return LIMIT_OF_FUNDING_USD;
            default:
                return 0;
        }
    }

    @Override
    public int getMonthlyRate() {
        switch (this.getCurrency()) {
            case EUR:
                return MONTHLY_RATE_EUR;
            case USD:
                return MONTHLY_RATE_USD;
            default:
                return 0;
        }
    }

    @Override
    public int getCommission(int summ) {

        switch (this.getCurrency()) {
            case EUR:
                return (summ < LIMIT_FOR_CHANGE_OF_COMMISSION ? LOW_COMMISSION_EUR : HIGHT_COMMISSION_EUR);
            case USD:
                return (summ < LIMIT_FOR_CHANGE_OF_COMMISSION ? LOW_COMMISSION_USD : HIGHT_COMMISSION_USD);
            default:
                return 0;
        }

    }
}
