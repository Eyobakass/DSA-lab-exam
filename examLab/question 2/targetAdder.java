package examLab;

public class targetAdder {
	public static void examiner(int[]array, int target) {
		for (int i=0;i<array.length-1;i++) {
			for(int j=i+1;j<array.length;j++) {
				if (array[i]+array[j]==target) {
					System.out.println("["+i+","+j+"]");
					return;
				}
			}
		}
	}
	public static void main(String[] args){
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		examiner(nums,target);
	}
}
