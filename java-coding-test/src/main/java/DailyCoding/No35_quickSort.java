package DailyCoding;

import java.util.Arrays;

public class No35_quickSort {
    public static void main(String[] args) {
        No35_quickSort test = new No35_quickSort();

//        int[] ints = test.quickSort(new int[]{3, 1, 21});
//        Arrays.stream(ints).forEach(System.out::println);
    }

    public int[] quickSort(int[] arr) {
        // TODO:
        if(arr.length < 2) return arr;

        int pivot = arr.length / 2;
        int left = 0;
        int right = arr.length - 1;
        int pivotNum = arr[pivot];

        while(left < right){
            int leftNum = arr[left];
            int rightNum = arr[right];
            if(leftNum >= pivotNum && rightNum <= pivotNum){
                arr[left] = rightNum;
                arr[right] = leftNum;
                left++;
                right--;
            }
            if(leftNum < pivotNum) left++;
            if(rightNum > pivotNum) right--;
        }

        int[] leftArr = Arrays.copyOfRange(arr, 0, pivot);
        int[] rightArr = Arrays.copyOfRange(arr, pivot, arr.length);
        int[] leftSortArr = quickSort(leftArr);
        int[] rightSortArr = quickSort(rightArr);

        int[] result = new int[arr.length];

        System.arraycopy(leftSortArr, 0, result, 0, leftSortArr.length);
        System.arraycopy(rightSortArr, 0, result, leftSortArr.length, rightSortArr.length);

        return result;
    }
}
