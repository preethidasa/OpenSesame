package org.opensesame;

import java.io.FileWriter;
import org.jasypt.util.text.BasicTextEncryptor;
import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
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
		File file = new File(fileName);
  		file.createNewFile();
		BufferedWriter writer = null;
		try {
    			writer = new BufferedWriter( new FileWriter(file));
    			writer.write(fileContents);

		} catch ( IOException e) {
		} finally {
    			try {
        			if ( writer != null)
        				writer.close( );
    			} catch ( IOException e) {
    			}
		}		
		return file;
	}

}

