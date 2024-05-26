package examLab;
import java.util.Stack;
public class reverserStack {
	public static String reverser(String string) {
		Stack<Character> stack=new Stack<Character>();
		String demo="";
		for (int i=0;i<string.length();i++) {
			stack.push(string.charAt(i));
		}
		for(int i=0;i<string.length();i++) {
			demo+=stack.pop();
		}
		return demo;
	}
	public static void main(String[] args) {
		String string="hello";
		System.out.println(reverser(string));
	}
}
