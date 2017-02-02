package homework2;

import java.util.*;

/**
 * Created by Сергей on 02.02.2017.
 */
public class task4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        String ownerName;
        double withdrawal;
        boolean ownerNameNotFound = true;

        System.out.print("Input owner name: ");
        ownerName = in.nextLine();
        for (int i = 0; i < ownerNames.length; i++) {
            if(ownerNames[i].equals(ownerName)){
                System.out.print("Input withdrawal: ");
                withdrawal = in.nextDouble();
                balances[i] = getBalance(balances[i],withdrawal);
                System.out.printf("%s %.1f",ownerName,balances[i]);
                ownerNameNotFound = false;
                break;
            }
        }

        if (ownerNameNotFound){
            System.out.println("NO (owner not found)");
        }
    }

    private static double getBalance(double balance, double withdrawal) {
        return balance + withdrawal;
    }

}
