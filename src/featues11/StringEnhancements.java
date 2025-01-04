package featues11;

public class StringEnhancements {
	public static void main(String[] args) {
		String str = " Hello, Java 11! ";
		System.out.println(str.isBlank()); // false
		System.out.println(str.strip()); // "Hello, Java 11!"
		System.out.println("A\nB\nC".lines().count()); // 3
		System.out.println("Hi ".repeat(3)); // Hi Hi Hi
	}
}