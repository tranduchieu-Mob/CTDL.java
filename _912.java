import java.util.Arrays;

public class _912 {
    public static int[] sortArray(int[] nums) {
        mergesort(nums, 0, nums.length - 1);
        return nums;
    }

    public static void mergesort(int[] nums, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergesort(nums, start, mid);
            mergesort(nums, mid + 1, end);
            merge(nums, start, mid, end);
        }
    }

    public static void merge(int[] nums, int start, int mid, int end) {
        int i = start, j = mid + 1, k = 0;
        int[] temp = new int[end - start + 1];
        while (i <= mid && j <= end) {
            if (nums[i] < nums[j])
                temp[k++] = nums[i++];
            else
                temp[k++] = nums[j++];
        }
        while (i <= mid) {
            temp[k++] = nums[i++];
        }
        while (j <= end) {
            temp[k++] = nums[j++];
        }
        for (int p = start; p <= end; p++) {
            nums[p] = temp[p - start];
        }
    }

    public static void main(String[] args) {
        int[] nums = { 5, 2, 3, 1 };
        sortArray(nums);
        System.out.println(Arrays.toString(nums));
    }
}
