package homework6.task1;

import java.util.Arrays;
import java.util.Random;

public class ArraysMain {

    private static final int SIZE = 10;

    public static void main(String[] args) {

        int[] intArray = initIntArray(SIZE);

        int[] intModulus;

        System.out.println("int array = %d" + Arrays.toString(intArray));
        System.out.println(String.format("int sum = %d", ArraysUtils.sum(intArray)));
        System.out.println(String.format("int min = %d",ArraysUtils.min(intArray)));
        System.out.println(String.format("int max = %d",ArraysUtils.max(intArray)));
        System.out.println(String.format("int max positive = %d",ArraysUtils.maxPositive(intArray)));
        System.out.println(String.format("int multiplication = %d",ArraysUtils.multiplication(intArray)));

        intModulus = ArraysUtils.modulus(intArray);
        System.out.println(String.format("int modulus of first element = %d",intModulus[0]));
        System.out.println(String.format("int modulus of last element = %d",intModulus[1]));

        System.out.println(String.format("int second largest element = %d",ArraysUtils.secondLargest(intArray)));

    }

    private static int[] initIntArray(int size) {
        int[] array = new int[size];
        final Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(100)-50;
        }
        return array;
    }

}
