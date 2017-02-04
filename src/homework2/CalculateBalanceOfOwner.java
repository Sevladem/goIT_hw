package homework2;

import java.util.*;

/**
 * Created by Сергей on 02.02.2017.
 * It is task3
 */
public class CalculateBalanceOfOwner {

    private static final int PERCENT_OF_COMMISSION = 5;

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner in = new Scanner(System.in);
        double[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        String ownerName;
        double balance = 0;

        System.out.print("Input owner name: ");
        ownerName = in.nextLine();
        for (int i = 0; i < ownerNames.length; i++) {
            if(ownerNames[i].equals(ownerName)){
                System.out.print("Input withdrawal: ");
                calculator.setWithdrawal(in.nextDouble());
                calculator.setBalance(balances[i]);
                calculator.calculate(PERCENT_OF_COMMISSION);
                balance = calculator.getBalance();
                if (balance<0) {
                    System.out.println("NO");
                }else {
                    balances[i] = balance;
                    System.out.printf("OK %.1f %.1f",calculator.getWithdrawal(),balances[i]);
                }
                break;
            }
        }

        if (balance == 0){
            System.out.println("NO (owner not found)");
        }
    }

}
