import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FilenameUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;




@WebServlet("/SearchServlet")
public class Search extends HttpServlet {
	private String filePath;
	public void init() {
		 filePath = getServletContext().getInitParameter("file-upload"); 
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<String> results = new ArrayList<String>();
		String input=req.getParameter("input");
		
		
		File[] files = new File("C:/Users/CBT/Desktop/Resumes").listFiles();
		//If this pathname does not denote a directory, then listFiles() returns null. 
		
		
		for (File file : files) {
			if (file.isFile()) {
				if(FilenameUtils.getExtension(filePath+"'\'"+file).equals("pdf")) {
				
				String filename=file.getPath();
			      //Loading an existing document
			     
			      PDDocument document = PDDocument.load(file);

			      //Instantiate PDFTextStripper class
			      PDFTextStripper pdfStripper = new PDFTextStripper();

			      //Retrieving text from PDF document
			      String text = pdfStripper.getText(document);
			      
			      text = text.replace("\n", " ").replace("\r", " ");
			     
			       boolean found=false;
			      
			       if(text.contains(input)) {
			        	 System.out.println("Found");
			        	 found=true;
			        	 results.add(FilenameUtils.getBaseName(filename));
			         }

			      if(found==false) {
			    	  System.out.println("not found");
			      }
			      

			      
			      //Closing the document
			      document.close();
			}else if(FilenameUtils.getExtension(filePath+"'\'"+file).equals("docx")) {
				

			}//end of docx
		}//end if isFile() checking
		
		
	}//end of fileloop
		System.out.println("result : "+results);
		req.setAttribute("results", results);
		req.getRequestDispatcher("./home").forward(req, resp);
	}//end of doPost()
}//end of class

