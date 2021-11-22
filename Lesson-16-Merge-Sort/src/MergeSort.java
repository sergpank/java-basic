import java.util.Arrays;

public class MergeSort {

    public int[] sort(int[] array) {
        if (array.length > 1) {
            int[] left = sort(Arrays.copyOfRange(array, 0, array.length / 2));
            int[] right = sort(Arrays.copyOfRange(array, array.length / 2, array.length));

            return merge(left, right);
        }
        return array;
    }

    private int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        //while (iL < left.length || iR < right.length) {
        for (int iL = 0, iR = 0, i = 0; iL < left.length || iR < right.length; i++) {
            int element;
            if (iL == left.length) {
                element = right[iR++];
            }
            else if (iR == right.length) {
                element = left[iL++];
            }
            else if (left[iL] < right[iR]) {
                element = left[iL++];
            }
            else {
                element = right[iR++];
            }
            result[i] = element;
        }
        return result;
    }
}
