package homework2;

import java.util.*;

/**
 * Created by Сергей on 02.02.2017.
 */
public class task2 {

    public static final int PERCENT_OF_COMMISION = 5;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double balance;
        double withdrawal;
        double commision;
        System.out.print("Input balance: ");
        balance = in.nextDouble();
        System.out.print("Input withdrawal: ");
        withdrawal = in.nextDouble();

        commision = getCommision(withdrawal);

        if (balance<(commision+withdrawal)){
            System.out.println("NO");
        }else {
            balance -= commision+withdrawal;
            System.out.printf("OK %.1f %.1f",commision,balance);
        }

    }

    private static double getCommision(double withdrawal) {
        double commision;
        commision = withdrawal*PERCENT_OF_COMMISION/100;
        return commision;
    }

}
