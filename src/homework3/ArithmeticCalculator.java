package homework3;

public class ArithmeticCalculator {
    public static void main(String[] args) {

        Arithmetic calc1 = new Arithmetic();
        Adder calc2 = new Adder();

        System.out.println(calc1.add(3,6));
        System.out.println(calc2.add(3,6));
        System.out.println(calc2.check(3,6));

    }
}
