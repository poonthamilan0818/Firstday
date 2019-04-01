package org.firstclass;

public class MyClass {
	public static void main(String[] args) {
		String s = "qwerty keyboard";
		int a = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'e') {
				a++;
			}
		}
		System.out.println("e:" + a);
	}
}
