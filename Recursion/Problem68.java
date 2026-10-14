// Binary Search using Recursion



class Problem68 {


      int fxn(int[] arr, int target, int mid, int left, int right) {

        if (left > right) {
            return -1;
        }

        mid = left + (right - left) / 2;

        if (arr[mid] > target) {
            return fxn(arr, target, mid, left, mid - 1);
        }

        if (arr[mid] < target) {
            return fxn(arr, target, mid, mid + 1, right);
        }

        return mid;
    }
    public int search(int[] nums, int target) {
         return fxn(nums, target, 0, 0, nums.length - 1);
    }
}

