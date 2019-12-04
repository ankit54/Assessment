import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FilenameUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
public class ResumeSearch {

   public static void main(String args[]) throws IOException {

	   
	   String filename="D://resume_sample.pdf";
      //Loading an existing document
      File file = new File(filename);
      PDDocument document = PDDocument.load(file);

      //Instantiate PDFTextStripper class
      PDFTextStripper pdfStripper = new PDFTextStripper();

      //Retrieving text from PDF document
      String text = pdfStripper.getText(document);
      
      text = text.replace("\n", " ").replace("\r", " ");
      System.out.println(text);
       boolean found=false;
      
      String[] arr = text.split(" ");
      

      for ( String ss : arr) {
         if(ss.contains("MVP")) {
        	 System.out.println("Found");
        	 found=true;
        	 break;
         }
      }
      if(found==false) {
    	  System.out.println("not found");
      }
      
      System.out.println(FilenameUtils.getBaseName(filename)+"."+FilenameUtils.getExtension(filename));
      //Closing the document
      document.close();

   }
}