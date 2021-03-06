import java.io.*;
public class praktik1{
	// Main
   public static void main(String args[]) throws IOException {
      InputStreamReader masukan = null;

      try {
         masukan = new InputStreamReader(System.in);
         System.out.println("masukan huruf!, masukan 'q' untuk keluar dari program. ");
         char tersimpan;
         do {
            tersimpan = (char) masukan.read();
            System.out.print(tersimpan);
         } while(tersimpan != 'q');
      }finally {
         if (masukan != null) {
			System.out.println(" BYE!!!");
            masukan.close();
         }
      }
   }
}