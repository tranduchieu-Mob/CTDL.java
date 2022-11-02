import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _442 {
    public static void main(String[] args) {
        int [] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 1;
        Arrays.sort(nums);
        while(j < nums.length){
            if(nums[i] == nums[j]){
                list.add(nums[i]);
            }
            i++;
            j++;
        }
        return list;
    }
}
