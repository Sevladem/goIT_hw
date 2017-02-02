package homework2;

import java.util.*;

/**
 * Created by Сергей on 02.02.2017.
 */
public class task3 {

    public static final int PERCENT_OF_COMMISION = 5;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        String ownerName;
        double withdrawal;
        double balance = 0;
        double commision;

        System.out.print("Input owner name: ");
        ownerName = in.nextLine();
        for (int i = 0; i < ownerNames.length; i++) {
            if(ownerNames[i].equals(ownerName)){
                System.out.print("Input withdrawal: ");
                withdrawal = in.nextDouble();
                commision = getCommision(withdrawal);
                balance = balances[i];
                if (balances[i]<(commision+withdrawal)) {
                    System.out.println("NO");
                }else {
                    balances[i] -= commision+withdrawal;
                    System.out.printf("OK %.1f %.1f",withdrawal,balances[i]);
                }
                break;
            }
        }

        if (balance == 0){
            System.out.println("NO (owner not found)");
        }
    }

    private static double getCommision(double withdrawal) {
        double commision;
        commision = withdrawal*PERCENT_OF_COMMISION/100;
        return commision;
    }
}
