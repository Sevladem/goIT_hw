package homework2;

import java.util.*;

/**
 * Created by Сергей on 02.02.2017.
 * It is task2
 */
public class CalculateBalance {

    private static final int PERCENT_OF_COMMISSION = 5;

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner in = new Scanner(System.in);
        double balance;
        double commission;

        System.out.print("Input balance: ");
        calculator.setBalance(in.nextDouble());
        System.out.print("Input withdrawal: ");
        calculator.setWithdrawal(in.nextDouble());

        calculator.calculate(PERCENT_OF_COMMISSION);
        balance = calculator.getBalance();
        commission = calculator.getCommission();


        if (balance < 0){
            System.out.println("NO");
        }else {
            System.out.printf("OK %.1f %.1f",commission,balance);
        }

    }

}
