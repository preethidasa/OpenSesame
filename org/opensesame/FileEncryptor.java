package org.opensesame;

import org.jasypt.util.text.BasicTextEncryptor;
import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.StringBuffer;

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
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
		StringBuffer sb = new StringBuffer();
		while ((line = br.readLine()) != null) {
				sb.append(line);
		}
		br.close();
		System.out.println("file contents read: " + sb);
		return sb.toString();
	}

	private File writeFile( String fileContents, String fileName ) throws IOException {

		// TODO write a file whose contents are fileContents and name is fileName
		System.out.println("Writing contents " +  fileContents  + " to  file: " + fileName);
		return null;
	}

}
