package homework2;

import java.util.*;

public class WorkOnArrays {

    private static final int SIZE = 10;

    public static void main(String[] args) {

        int[] intArray = initIntArray(SIZE);
        double[] doubleArray = initDoubleArray(SIZE);

        int[] intModulus;
        double[] doubleModulus;

        System.out.println("int array = %d" + Arrays.toString(intArray));
        System.out.println("double array = " + Arrays.toString(doubleArray));

        System.out.println(String.format("int sum = %d",CalculationsOnArrays.sum(intArray)));
        System.out.println(String.format("double sum = %.2f",CalculationsOnArrays.sum(doubleArray)));

        System.out.println(String.format("int min = %d",CalculationsOnArrays.min(intArray)));
        System.out.println(String.format("double min = %.2f",CalculationsOnArrays.min(doubleArray)));

        System.out.println(String.format("int max = %d",CalculationsOnArrays.max(intArray)));
        System.out.println(String.format("double max = %.2f",CalculationsOnArrays.max(doubleArray)));

        System.out.println(String.format("int max positive = %d",CalculationsOnArrays.maxPositive(intArray)));
        System.out.println(String.format("double max positive = %.2f",CalculationsOnArrays.maxPositive(doubleArray)));

        System.out.println(String.format("int multiplication = %d",CalculationsOnArrays.multiplication(intArray)));
        System.out.println(String.format("double multiplication = %.2f",CalculationsOnArrays.multiplication(doubleArray)));

        intModulus = CalculationsOnArrays.modulus(intArray);
        System.out.println(String.format("int modulus of first element = %d",intModulus[0]));
        System.out.println(String.format("int modulus of last element = %d",intModulus[1]));

        doubleModulus = CalculationsOnArrays.modulus(doubleArray);
        System.out.println(String.format("double modulus of first element = %.2f",doubleModulus[0]));
        System.out.println(String.format("double modulus of last element = %.2f",doubleModulus[1]));

        System.out.println(String.format("int second largest element = %d",CalculationsOnArrays.secondLargest(intArray)));
        System.out.println(String.format("double second largest element = %.2f",CalculationsOnArrays.secondLargest(doubleArray)));

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
