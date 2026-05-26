import java.util.Arrays;

public class Sum2SortedQuestion {
    public static int[] SumSolution(int nums[],int target){
        int left=0;
        int right=nums.length-1;
        while(left<right){
             int sum=nums[left]+nums[right];
             if(sum==target){
                return new int[]{left+1,right+1};

             }else if(sum<target){
                left++;
             }else{
                right--;
             }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int ans[]= SumSolution(new int[]{1,2,3,4,5,6,7}, 5);
        System.out.println(Arrays.toString(ans));
    }
}
