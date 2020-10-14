
public class HouseRobberII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,3,2};
		System.out.println(rob(nums));
	}
	public static int rob(int[] nums) {
        int n= nums.length;
        if(n == 0) return 0;
        if(n == 1) return nums[0];
        int max1 = helpingRob(nums, 0, n-2);
        int max2 = helpingRob(nums, 1, n-1);
        return Math.max(max1, max2);
    }
    
    public static int helpingRob(int[] nums, int i, int j){
        if(i == j){
            return nums[i];
        }
        int[] dp = new int[nums.length];
        dp[i] = nums[i];
        dp[i+1] = Math.max(nums[i+1], nums[i]);
        for(int k = i+2; k<=j; k++){
            dp[k] = Math.max(dp[k-2]+nums[k], dp[k-1]);
        }
        return dp[j];
    }
}
