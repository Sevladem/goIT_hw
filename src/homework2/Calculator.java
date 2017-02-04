package homework2;

class Calculator {

    private Calculator(){

    }

    public static double calculateCommission(double withdrawal, int percentOfCommission){

        return withdrawal*percentOfCommission/100;

    }

    public static double calculateBalance(double balance, double withdrawal, double commission){

        return balance - withdrawal - commission;

    }


}
