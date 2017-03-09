package homework6.task4;

import java.util.Scanner;

public class CitizenMain {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        CitizenFactory citizenFactory = new CitizenFactory();
        log("Enter the first character of nationality");
        String nationality = in.nextLine();

        while (!nationality.equals("exit")) {
            Citizen newCitizen = citizenFactory.getCitizen(nationality);

            if (newCitizen != null){
                newCitizen.sayHello();
            } else {
                log("Wrong nationality. Try again or input 'exit'");
            }

            nationality = in.nextLine();
        }

    }

    private static void log(String message){
        System.out.println(message);
    }

}
