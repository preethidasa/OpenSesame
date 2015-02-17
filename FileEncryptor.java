import org.jasypt.util.text.BasicTextEncryptor;
import java.io.File;
import java.io.IOException;

public class FileEncryptor {

	public File encrypt(File fileToBeEncrypted) throws IOException {
		BasicTextEncryptor bte = new BasicTextEncryptor();
        	bte.setPassword("HelloWorld");

		String fileContents = readFile(fileToBeEncrypted);        	
		String encryptedContents = bte.encrypt(fileContents);
		String encryptedFileName = fileToBeEncrypted.getName() + "_encrypted";
		return writeFile(encryptedContents, encryptedFileName);

	}

	private String readFile( File file ) throws IOException {
		// TODO read file and convert the text in the file to a single string
		return "dummy string";
	}

	private File writeFile( String fileContents, String fileName ) throws IOException {

		// TODO write a file whose contents are fileContents and name is fileName
		return null;
	}

}
