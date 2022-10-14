import java.util.Arrays;
public class _1512 {
    public static int numIdenticalPairs(int[] nums) {
        int i=0,j=0,k=0;

        for(i=0;i<nums.length;i++)
        {
            for(j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                    k++;;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }
}
