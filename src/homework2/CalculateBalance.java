package homework2;

import java.util.*;

public class CalculateBalance {

    private static final int PERCENT_OF_COMMISSION = 5;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double balance;
        double withdrawal;
        double commission;

        System.out.print("Input balance: ");
        balance = in.nextDouble();
        System.out.print("Input withdrawal: ");
        withdrawal = in.nextDouble();

        commission = Calculator.calculateCommission(withdrawal,PERCENT_OF_COMMISSION);
        balance = Calculator.calculateBalance(balance,withdrawal,commission);

        if (balance < 0){
            System.out.println("NO");
        }else {
            System.out.printf("OK %.1f %.1f",commission,balance);
        }

    }

}
