package homework6.task1;

public final class ArraysUtils {

    private ArraysUtils(){

    }

    public static int secondLargest(int[] inArray) {

        int[] array = inArray.clone();
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

    public static int[] modulus(int[] array) {
        int[] intModulus = new int[2];
        intModulus[0] = Math.abs(array[0]);
        intModulus[1] = Math.abs(array[array.length-1]);
        return intModulus;
    }

    public static long multiplication(int[] array) {
        long multiplication = array[0];
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

    public static int max(int[] array) {
        int max = array[0];
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

    public static int sum(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum+=element;
        }
        return sum;
    }

    public static int[] reverse(int[] array){
        int[] returnArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            returnArray[array.length-i-1] = array[i];
        }
        return returnArray;
    }

    public static int[] findEvenElements(int[] array){
        int[] returnArray = new int[array.length];
        int i = 0;

        for (int element : array) {
            if(element%2 == 0){
                returnArray[i] = element;
                i++;
            }
        }

        return returnArray;
    }

}
