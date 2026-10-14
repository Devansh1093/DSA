/*

Given an array of integers arr[], find the minimum and maximum elements in the array using recursion only. The first element of the output represents the minimum value, and the second element represents the maximum value in the array.

Examples:

Input: arr[] = [1, 4, 3, -5, -4, 8, 6]
Output: [-5, 8]
Explanation: -5 is the minimum and 8 is the maximum element in the array

Input: arr[] = [12, 3, 15, 7, 9]
Output: [3, 15]
Explanation: 3 is the minimum and 15 is the maximum element in the array


*/


public class Problem67 {
    int[] fxn(int[] arr, int n, int max, int min) {

    if (n == 0) {
        int[] nums = new int[2];
        nums[0] = min;
        nums[1] = max;
        return nums;
    }

    if (arr[n - 1] > max) {
        max = arr[n - 1];
    }

    if (arr[n - 1] < min) {
        min = arr[n - 1];
    }

    return fxn(arr, n - 1, max, min);
}
}
