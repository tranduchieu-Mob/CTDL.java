import java.util.Arrays;
public class _1122 {
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int [] arr3 = new int[10001];
        for(int i=0;i<arr1.length;i++) 
            arr3[arr1[i]]++;
        
        int j=0;
        for(int i=0;i<arr2.length;i++)
           while(arr3[arr2[i]]>0){
               arr1[j] = arr2[i];
               arr3[arr2[i]]--; j++;
           }
        
        for(int i=0;i<arr3.length;i++)
            while(arr3[i]>0){
                arr1[j] = i;
                arr3[i]--; j++;
            }

        return arr1;
    }
    public static void main(String[] args) {
        int [] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int [] arr2 = {2,1,4,3,9,6};
        relativeSortArray(arr1, arr2);
        System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));
    }
}
