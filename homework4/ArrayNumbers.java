
public class ArrayNumbers {
	public int getBiggest(int[] nums) {
		int biggest = nums[0];
		for(int i=1; i<nums.length; i++) {
			if(nums[i] > biggest) {
				biggest = nums[i];
			}
		}
		return biggest;
	}
	
	public int getPositiveSum(int[] nums) {
		int sum = 0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i] > 0) {
				sum += nums[i];
			}
		}
		return sum;
	}
	
	public int getNegativeAmount(int[] nums) {
		int amount = 0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i] < 0) {
				amount ++;
			}
		}
		return amount;
	}
	
	public String morePositiveOrNegative(int[] nums) {
		int negative = this.getNegativeAmount(nums);
		if ((nums.length - negative) > negative) {
			return "There are more positive numbers";
		} 
		return "There are more negative numbers";
	}
	
	public static void main(String[] args) {
		ArrayNumbers arr = new ArrayNumbers();
		int[] ints = {1,2,3,4,5,-6,7,8,9,10};
		System.out.println(arr.getBiggest(ints));
		System.out.println(arr.getPositiveSum(ints));
		System.out.println(arr.getNegativeAmount(ints));
		System.out.println(arr.morePositiveOrNegative(ints));
		
		
	}
}
