import java.util.Arrays;

public class MaxMinAverage {
    public int[] getMaxMinAverage(int[] array) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] newArray = new int[3];
        if (array.length == 0) {
            newArray = new int[0];
        } else if (array.length == 1) {
            newArray = new int[]{array[0], array[0], array[0]};
            } else if (array.length == 2) {
            if (array[0] >= array[1]) {
                newArray = new int[]{array[0], array[1], (array[0] + array[1]) / 2};
                    } else {
                    newArray = new int[]{array[1], array[0], (array[0] + array[1]) / 2};
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
                if (array[i] < min) {
                    min = array[i];
                }
                sum += array[i];
            }
            newArray = new int[]{max, min, sum / array.length};
        }
        return newArray;
    }

    public static void main(String[] args) {
        MaxMinAverage maxMinAverage = new MaxMinAverage();
        System.out.println(Arrays.toString(maxMinAverage.getMaxMinAverage(new int[]{-3, 0, 155, -39, 1003})));
    }
}
