package homework2;

import java.util.*;

/**
 * Created by Сергей on 02.02.2017.
 * It is task4
 */
public class FundingBalance {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner in = new Scanner(System.in);
        double[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        String ownerName;
        boolean ownerNameIsFound = false;

        System.out.print("Input owner name: ");
        ownerName = in.nextLine();
        for (int i = 0; i < ownerNames.length; i++) {
            if(ownerNames[i].equals(ownerName)){
                System.out.print("Input withdrawal: ");
                calculator.setWithdrawal(-in.nextDouble());
                calculator.setBalance(balances[i]);
                calculator.calculate(0);
                balances[i] = calculator.getBalance();
                System.out.printf("%s %.1f",ownerName,balances[i]);
                ownerNameIsFound = true;
                break;
            }
        }

        if (!ownerNameIsFound){
            System.out.println("NO (owner not found)");
        }
    }

}
