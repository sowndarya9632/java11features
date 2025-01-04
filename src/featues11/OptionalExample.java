package featues11;

import java.util.Optional;

public class OptionalExample {
	public static void main(String[] args) {
		Optional<String> opt = Optional.of("Java 11");
		opt.ifPresentOrElse(System.out::println, () -> System.out.println("No value present"));
		Optional<String> emptyOpt = Optional.empty();
		System.out.println(emptyOpt.isEmpty()); // true
	}
}
