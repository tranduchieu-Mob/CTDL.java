import java.util.Arrays;

public class _905 {
    public static int[] sortArrayByParity(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] % 2 == 0) {
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                j++;
            }
        return nums;
    }
    public static void main(String[] args) {
        int [] arr = {3,1,2,4};
        sortArrayByParity(arr);
        System.out.println(Arrays.toString(arr));
    }
}
