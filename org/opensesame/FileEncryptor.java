package org.opensesame;

import java.io.FileWriter;
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
		         File file = new File();
				 System.out.println("Enter the name of the file", + file);
				       file.createNewFile();
				         FileWriter writer = new FileWriter(file); 
					         writer.write(data.getBytes(), 0, data.length()); 
			      	       writer.flush();
						         writer.close();
	   						         FileReader fr = new FileReader(file); 
								       char [] a = new char[50];
								         fr.read(a); // reads the content to the array
									       for(char c : a)
								             System.out.print(c); //prints the characters one by one
	          							       fr.close();
		return null;
	}

}

