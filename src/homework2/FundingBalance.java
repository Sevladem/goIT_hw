package homework2;

import java.util.*;

public class FundingBalance {

    public static void main(String[] args) {
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
                balances[i] = Calculator.calculateBalance(balances[i],-in.nextDouble(),0);
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
