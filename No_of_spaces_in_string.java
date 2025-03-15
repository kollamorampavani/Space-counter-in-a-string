package strings;

import java.util.Scanner;

public class No_of_spaces_in_string {
	public static int spaces(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	     System.out.println("enter string");
	     String s=scan.nextLine();
	     int res=spaces(s);
	     System.out.println(res);
	}

}
