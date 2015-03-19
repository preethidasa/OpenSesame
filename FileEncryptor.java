import org.jasypt.util.text.BasicTextEncryptor;
import java.io.File;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

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
		String  thisLine = null;
      try{
         BufferedReader br = new BufferedReader("WriteTest.txt");
         while ((thisLine = br.readLine()) != null) {
            System.out.println(thisLine);
         }       
      }catch(Exception e){
         e.printStackTrace();
      }
		return "dummy string";
	}

		public class WriteToFile {		
File file = new File("WriteTest.txt");
		public static void useFileWriter(String content, String filePath) {
				 	        Writer writer = null;
				 				 	        try {
										 	            writer = new FileWriter(filePath);
				                 		 	            writer.write(content);
						 	 
						 	                     } catch (IOException e) {
								 	 
								 	            System.err.println("Error writing the file : ");
								 	            
                     								 	 e.printStackTrace();
								 	        } finally {
									 	                if (writer != null) {
												 	                try {
						            				 	                    writer.close();
													 	                } catch (IOException e) {
                								 	 
				                                                     			System.err.println("Error closing the file : ");
														                          e.printStackTrace();		 	                    														 	                }
																 	            }
																 	 
																 	        }
																 	    }
																		}
		
	}



