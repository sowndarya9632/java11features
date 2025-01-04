package featues11;

import java.util.List;

public class LambdaVarExample {
	public static void main(String[] args) {
		List<String> names = List.of("Alice", "Bob", "Charlie");
		names.forEach((var name) -> System.out.println(name.toUpperCase()));
	}
}