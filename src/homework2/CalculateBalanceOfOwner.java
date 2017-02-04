package homework2;

import java.util.*;

public class CalculateBalanceOfOwner {

    private static final int PERCENT_OF_COMMISSION = 5;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        String ownerName;
        double withdrawal;
        double commission;
        double balance = 0;

        System.out.print("Input owner name: ");
        ownerName = in.nextLine();
        for (int i = 0; i < ownerNames.length; i++) {
            if(ownerNames[i].equals(ownerName)){
                System.out.print("Input withdrawal: ");
                withdrawal = in.nextDouble();
                commission = Calculator.calculateCommission(withdrawal,PERCENT_OF_COMMISSION);
                balance = Calculator.calculateBalance(balances[i],withdrawal,commission);
                if (balance<0) {
                    System.out.println("NO");
                }else {
                    balances[i] = balance;
                    System.out.printf("OK %.1f %.1f",withdrawal,balances[i]);
                }
                break;
            }
        }

        if (balance == 0){
            System.out.println("NO (owner not found)");
        }
    }

}
