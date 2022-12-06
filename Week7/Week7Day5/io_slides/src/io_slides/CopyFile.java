package io_slides;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class CopyFile {

	   public static void main(String args[]) throws IOException, FileNotFoundException {  
	      FileInputStream in = null;
	      FileOutputStream out = null;

	      try {
	         in = new FileInputStream("C:\\Users\\theve\\OneDrive\\Desktop\\TTS2\\TTS\\Week7\\Week7Day5\\io_slides\\src\\input.txt");
	         out = new FileOutputStream("C:\\Users\\theve\\OneDrive\\Desktop\\TTS2\\TTS\\Week7\\Week7Day5\\io_slides\\src\\output.txt");
	         
	         int c;
	         while ((c = in.read()) != -1) {
	            out.write(c);
	         }
	      }finally {
	         if (in != null) {
	            in.close();
	         }
	         if (out != null) {
	            out.close();
	         }
	      }
	   }
	}
