import java.io.BufferedWriter;
import java.io.File;
import java.io.Writer;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {		
File file = new File("WriteTest.txt");
		public static void useFileWriter(String content, String filePath) {
				 	        Writer writer = null;
				 				 	        try {
										 	            writer = new FileWriter(filePath);
				                 		 	            writer.write(content);
						 	 
						 	                     } catch (IOException e) {
								 	 
								 	            System.err.println("Error writing the file : ");
								 	            
								 	 
								 	        } finally {
									 	                if (writer != null) {
												 	                try {
						            				 	                    writer.close();
													 	                } catch (IOException e) {
                								 	 
				                                                     			System.err.println("Error closing the file : ");
																 	                    														 	                }
																 	            }
																 	 
																 	        }
																 	    }
																		}
																 
