package homework2;

import java.util.*;

/**
 * Created by Сергей on 02.02.2017.
 * It is task1
 */
public class WorkOnArrays {

    private static final int SIZE = 10;

    public static void main(String[] args) {

        int[] intArray = initIntArray(SIZE);
        double[] doubleArray = initDoubleArray(SIZE);

        CalculationsOnArrays calculator = new CalculationsOnArrays();

        int[] intModulus;
        double[] doubleModulus;

        System.out.println("int array = %d" + Arrays.toString(intArray));
        System.out.println("double array = " + Arrays.toString(doubleArray));

        System.out.println(String.format("int sum = %d",calculator.sum(intArray)));
        System.out.println(String.format("double sum = %.2f",calculator.sum(doubleArray)));

        System.out.println(String.format("int min = %d",calculator.min(intArray)));
        System.out.println(String.format("double min = %.2f",calculator.min(doubleArray)));

        System.out.println(String.format("int max = %d",calculator.max(intArray)));
        System.out.println(String.format("double max = %.2f",calculator.max(doubleArray)));

        System.out.println(String.format("int max positive = %d",calculator.maxPositive(intArray)));
        System.out.println(String.format("double max positive = %.2f",calculator.maxPositive(doubleArray)));

        System.out.println(String.format("int multiplication = %d",calculator.multiplication(intArray)));
        System.out.println(String.format("double multiplication = %.2f",calculator.multiplication(doubleArray)));

        intModulus = calculator.modulus(intArray);
        System.out.println(String.format("int modulus of first element = %d",intModulus[0]));
        System.out.println(String.format("int modulus of last element = %d",intModulus[1]));

        doubleModulus = calculator.modulus(doubleArray);
        System.out.println(String.format("double modulus of first element = %.2f",doubleModulus[0]));
        System.out.println(String.format("double modulus of last element = %.2f",doubleModulus[1]));

        System.out.println(String.format("int second largest element = %d",calculator.secondLargest(intArray)));
        System.out.println(String.format("double second largest element = %.2f",calculator.secondLargest(doubleArray)));

    }

    private static int[] initIntArray(int size) {
        int[] array = new int[size];
        final Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(100)-50;
        }
        return array;
    }

    private static double[] initDoubleArray(int size) {
        double[] array = new double[size];
        final Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextDouble()*100-50;
        }
        return array;
    }

}
