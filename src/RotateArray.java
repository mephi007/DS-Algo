import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4,5,6,7};
		rotate(nums,3);
		System.out.println(Arrays.toString(nums));
	}
	
	 public static void rotate(int[] arr, int k) {
	     k = k%arr.length;
	        		revArr(arr, 0,arr.length-k-1);
			revArr(arr,arr.length-k, arr.length-1);
			revArr(arr,0,arr.length-1);
	    }
	    
	    private static void revArr(int[] arr, int start, int end) {
			while(start <=end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
		}
}
