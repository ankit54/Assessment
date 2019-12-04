import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FilenameUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;




@WebServlet("/SearchServlet2")
public class Search2 extends HttpServlet {
	private String filePath;
	String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
			"[a-zA-Z0-9_+&*-]+)*@" + 
			"(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
			"A-Z]{2,7}$"; 
	public void init() {
		filePath = getServletContext().getInitParameter("file-upload"); 
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<String> results = new ArrayList<String>();
		List<String> mails= new ArrayList<String>();
		String input=req.getParameter("input");
		String[] input2=input.split(",");


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
					for(String key:input2) {
						if(text.toLowerCase().contains(key.toLowerCase())) {
							found=true;
						}else {
							found=false;
							break;
						}
					}
					if(found){
						results.add(FilenameUtils.getBaseName(filename)+"."+FilenameUtils.getExtension(filename));

						Pattern p = Pattern.compile(" (\\S+@\\S+) ");   // the pattern to search for
						Matcher m = p.matcher(text);

						// if we find a match, get the group 
						if (m.find())
						{
							// we're only looking for one group, so get it
							String theGroup = m.group(1);

							// print the group out for verification
							//System.out.println( theGroup);
							mails.add(theGroup);
						}else {
							mails.add("NOT PROVIDED IN RESUME");
						}

					}

					//Closing the document
					document.close();
				}else if(FilenameUtils.getExtension(filePath+"'\'"+file).equals("docx")) {
					try {
		               
		                FileInputStream fis = new FileInputStream(file.getAbsolutePath());

		                XWPFDocument document = new XWPFDocument(fis);

		                List<XWPFParagraph> paragraphs = document.getParagraphs();


		                for (XWPFParagraph para : paragraphs) {
		                    System.out.println(para.getText());
		                }
		                fis.close();
		            } catch (Exception e) {
		                e.printStackTrace();
		            }
						
				}//end of docx
			}//end if isFile() checking


		}//end of fileloop
		//System.out.println("result : "+results);
		req.setAttribute("results", results);
		req.setAttribute("mails", mails);
		req.getRequestDispatcher("./search").forward(req, resp);
	}//end of doPost()
}//end of class

