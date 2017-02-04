package homework2;

class CalculationsOnArrays {

    private CalculationsOnArrays(){

    }

    public static int secondLargest(int[] array) {

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

    public static double secondLargest(double[] array) {
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

    public static int[] modulus(int[] array) {
        int[] modulus = new int[2];
        modulus[0] = Math.abs(array[0]);
        modulus[1] = Math.abs(array[array.length-1]);
        return modulus;
    }

    public static double[] modulus(double[] array) {
        double[] modulus = new double[2];
        modulus[0] = Math.abs(array[0]);
        modulus[1] = Math.abs(array[array.length-1]);
        return modulus;
    }

    public static long multiplication(int[] array) {
        long multiplication = array[0];
        for (int i = 1; i < array.length; i++) {
            multiplication*=array[i];
        }
        return multiplication;
    }

    public static double multiplication(double[] array) {
        double multiplication = array[0];
        for (int i = 1; i < array.length; i++) {
            multiplication*=array[i];
        }
        return multiplication;
    }

    public static int maxPositive(int[] array) {
        int max = 0;
        for (int anArray : array) {
            if (anArray > max && anArray > 0) {
                max = anArray;
            }
        }
        return max;
    }

    public static double maxPositive(double[] array) {
        double max = 0;
        for (double anArray : array) {
            if (anArray > max && anArray > 0) {
                max = anArray;
            }
        }
        return max;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]>max){
                max= array[i];
            }
        }
        return max;
    }

    public static double max(double[] array) {
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]>max){
                max= array[i];
            }
        }
        return max;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]<min){
                min= array[i];
            }
        }
        return min;
    }

    public static double min(double[] array) {
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]<min){
                min= array[i];
            }
        }
        return min;
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum+=element;
        }
        return sum;
    }

    public static double sum(double[] array) {
        double sum = 0;
        for (double element : array) {
            sum+=element;
        }
        return sum;
    }

}
