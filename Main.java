import org.opensesame.FileEncryptor;
import java.io.File;
import java.io.IOException;


public class Main {
		public static void main(String[] args) throws IOException {
				File file = new File("test");
				FileEncryptor encryptor = new FileEncryptor();
				encryptor.encrypt(file);

			}
}
