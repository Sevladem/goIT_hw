package homework2;

/**
 * Created by Сергей on 04.02.2017.
 * It is util class for task1 (WorkOnArrays)
 */
class CalculationsOnArrays {

    int secondLargest(int[] array) {

        int buf;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j]< array[j+1]){
                    buf = array[j];
                    array[j] = array[j+1];
                    array[j+1] = buf;
                }
            }
        }
        return array[1];
    }

    double secondLargest(double[] array) {
        double buf;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j]< array[j+1]){
                    buf = array[j];
                    array[j] = array[j+1];
                    array[j+1] = buf;
                }
            }
        }
        return array[1];
    }

    int[] modulus(int[] array) {
        int[] modulus = new int[2];
        modulus[0] = Math.abs(array[0]);
        modulus[1] = Math.abs(array[array.length-1]);
        return modulus;
    }

    double[] modulus(double[] array) {
        double[] modulus = new double[2];
        modulus[0] = Math.abs(array[0]);
        modulus[1] = Math.abs(array[array.length-1]);
        return modulus;
    }

    long multiplication(int[] array) {
        long multiplication = array[0];
        for (int i = 1; i < array.length; i++) {
            multiplication*=array[i];
        }
        return multiplication;
    }

    double multiplication(double[] array) {
        double multiplication = array[0];
        for (int i = 1; i < array.length; i++) {
            multiplication*=array[i];
        }
        return multiplication;
    }

    int maxPositive(int[] array) {
        int max = 0;
        for (int anArray : array) {
            if (anArray > max && anArray > 0) {
                max = anArray;
            }
        }
        return max;
    }

    double maxPositive(double[] array) {
        double max = 0;
        for (double anArray : array) {
            if (anArray > max && anArray > 0) {
                max = anArray;
            }
        }
        return max;
    }

    int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]>max){
                max= array[i];
            }
        }
        return max;
    }

    double max(double[] array) {
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]>max){
                max= array[i];
            }
        }
        return max;
    }

    int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]<min){
                min= array[i];
            }
        }
        return min;
    }

    double min(double[] array) {
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]<min){
                min= array[i];
            }
        }
        return min;
    }

    int sum(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum+=element;
        }
        return sum;
    }

    double sum(double[] array) {
        double sum = 0;
        for (double element : array) {
            sum+=element;
        }
        return sum;
    }

}
