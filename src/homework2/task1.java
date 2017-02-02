package homework2;

import java.util.*;

/**
 * Created by Сергей on 02.02.2017.
 */
public class task1 {

    public static final int SIZE = 10;

    public static void main(String[] args) {

        int[] intArray = new int[SIZE];
        double[] doubleArray = new double[SIZE];

        int[] intModulus;
        double[] doubleModulus;

        intArray = initArray(intArray);
        doubleArray = initArray(doubleArray);

        System.out.println("int array = " + Arrays.toString(intArray));
        System.out.println("double array = " + Arrays.toString(doubleArray));

        System.out.println("int sum = " + sum(intArray));
        System.out.println("double sum = " + sum(doubleArray));

        System.out.println("int min = " + min(intArray));
        System.out.println("double min = " + min(doubleArray));

        System.out.println("int max = " + max(intArray));
        System.out.println("double max = " + max(doubleArray));

        System.out.println("int max positive = " + maxPositive(intArray));
        System.out.println("double max positive = " + maxPositive(doubleArray));

        System.out.println("int multiplication = " + multiplication(intArray));
        System.out.println("double multiplication = " + multiplication(doubleArray));

        intModulus = modulus(intArray);
        System.out.println("int modulus of first element = " + intModulus[0]);
        System.out.println("int modulus of last element = " + intModulus[1]);

        doubleModulus = modulus(doubleArray);
        System.out.println("double modulus of first element = " + doubleModulus[0]);
        System.out.println("double modulus of last element = " + doubleModulus[1]);

        System.out.println("int second largest element = " + secondLargest(intArray));
        System.out.println("double second largest element = " + secondLargest(doubleArray));

    }

    private static int secondLargest(int[] array) {

        int[] copyArray = array;
        int buf;
        for (int i = 0; i < copyArray.length; i++) {
            for (int j = 0; j < copyArray.length-i-1; j++) {
                if (copyArray[j]<copyArray[j+1]){
                    buf = copyArray[j];
                    copyArray[j] = copyArray[j+1];
                    copyArray[j+1] = buf;
                }
            }
        }
        return copyArray[1];
    }

    private static double secondLargest(double[] array) {
        double[] copyArray = array;
        double buf;
        for (int i = 0; i < copyArray.length; i++) {
            for (int j = 0; j < copyArray.length-i-1; j++) {
                if (copyArray[j]<copyArray[j+1]){
                    buf = copyArray[j];
                    copyArray[j] = copyArray[j+1];
                    copyArray[j+1] = buf;
                }
            }
        }
        return copyArray[1];
    }

    private static int[] modulus(int[] array) {
        int[] modulus = new int[2];
        modulus[0] = Math.abs(array[0]);
        modulus[1] = Math.abs(array[array.length-1]);
        return modulus;
    }

    private static double[] modulus(double[] array) {
        double[] modulus = new double[2];
        modulus[0] = Math.abs(array[0]);
        modulus[1] = Math.abs(array[array.length-1]);
        return modulus;
    }

    private static long multiplication(int[] array) {
        long multiplication = array[0];
        for (int i = 1; i < array.length; i++) {
            multiplication*=array[i];
        }
        return multiplication;
    }

    private static double multiplication(double[] array) {
        double multiplication = array[0];
        for (int i = 1; i < array.length; i++) {
            multiplication*=array[i];
        }
        return multiplication;
    }

    private static int maxPositive(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max && array[i]>0){ //the second condition is not necessary
                max= array[i];
            }
        }
        return max;
    }

    private static double maxPositive(double[] array) {
        double max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max && array[i]>0){ //the second condition is not necessary
                max= array[i];
            }
        }
        return max;
    }

    private static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]>max){
                max= array[i];
            }
        }
        return max;
    }

    private static double max(double[] array) {
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]>max){
                max= array[i];
            }
        }
        return max;
    }

    private static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]<min){
                min= array[i];
            }
        }
        return min;
    }

    private static double min(double[] array) {
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]<min){
                min= array[i];
            }
        }
        return min;
    }

    private static int sum(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum+=element;
        }
        return sum;
    }

    private static double sum(double[] array) {
        double sum = 0;
        for (double element : array) {
            sum+=element;
        }
        return sum;
    }

    private static int[] initArray(int[] array) {
        final Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100)-50;
        }
        return array;
    }

    private static double[] initArray(double[] array) {
        final Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextDouble()*100-50;
        }
        return array;
    }

}
