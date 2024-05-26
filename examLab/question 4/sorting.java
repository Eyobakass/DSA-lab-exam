package examLab;

public class sorting {
	public static int highestNumber(int[] bubble) {
	 for(int i = bubble.length - 1; i >= 0; i--) {
		 for(int j = 0; j < i; j++) {
			 //do swap adjacent files after comparison
			 if(bubble[j] > bubble[j + 1]) {
			 int temp = bubble[j];
			 bubble[j] = bubble[j + 1];
			 bubble[j + 1] = temp;
			 }
		 }
	 }
	 return bubble[bubble.length-1];
	}
	public static void main(String[] args) {
		int[] array= {3,9,5,1,8};
		System.out.println(highestNumber(array));
	}
}
