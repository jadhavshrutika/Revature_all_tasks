package task_29_july;
import java.util.*;
public class StringProb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = "mom madam convert every";
		
		System.out.println("Task1 : " +makeLastCharUpperCase(s));
		System.out.println("Task2 : " +makeMiddleOrFirstCharUpperCase(s));
		System.out.println("Task3 : " +reversePalindrome(s));
	}
	
	public static StringBuilder makeLastCharUpperCase(String s) {
		StringBuilder sb = new StringBuilder();
		String[] str = s.split(" ");
		for (int i = 0; i < str.length; i++) {
			sb.append(str[i].substring(0,str[i].length()-1)).append(Character.toUpperCase(str[i].charAt(str[i].length()-1))).append(" ");
		}
		return sb;
	}
	
	public static StringBuilder makeMiddleOrFirstCharUpperCase(String s) {
		StringBuilder sb = new StringBuilder();
		String[] str = s.split(" ");
		for (int i = 0; i < str.length; i++) {
			if(str[i].length()%2!=0) {
				sb.append(str[i].substring(0, str[i].length()/2)).append(Character.toUpperCase(str[i].charAt(str[i].length()/2))).append(str[i].substring(str[i].length()/2+1)).append(" ");
			} else {
				sb.append(Character.toUpperCase(str[i].charAt(0))).append(str[i].substring(1)).append(" ");
			}
		}
		return sb;
	}
	
	public static StringBuilder reversePalindrome(String s) {
		StringBuilder sb = new StringBuilder();
		String[] str = s.split(" ");
		for (int i = 0; i < str.length; i++) {
			if(new StringBuilder(str[i]).reverse().toString().equals(str[i])) {
				sb.append(str[i]).append(" ");
			} else {
				sb.append(new StringBuilder(str[i]).reverse()).append(" ");
			}
		}
		return sb;
	}

}
