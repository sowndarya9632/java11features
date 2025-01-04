package featues11;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

 public class FileExample {
	public static void main(String[] args) throws Exception {
		Path filePath = Path.of("sample.txt");
// Write to a file
		Files.writeString(filePath, "Java 11 File API is cool!",StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
// Read from a file
		String content = Files.readString(filePath);
		System.out.println(content);
	}
}