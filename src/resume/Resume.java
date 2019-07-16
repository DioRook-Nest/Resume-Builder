package resume;

import java.awt.Desktop;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;



class Resume{
    public static void main (String args[]) throws IOException{
        File file1= new File ("Html\\template.html");
String contents = new String(Files.readAllBytes(Paths.get("cv-template\\CV-Template\\index.html")));

//FileReader fr= new FileReader(file1);
//BufferedReader br=new BufferedReader(fr);
//String contents=br.read(fr);
    

System.out.println("Contents old : " + contents);
String title = "Resume Builder";
String body = "First step to Our Project Success";
contents = contents.replace("$title", title);
contents= contents.replace("$body", body);
contents= contents.replace("$name", body);
contents= contents.replace("$body", body);
System.out.println("\n\n\n\nContents (new) : " + contents);
File file2 = new File("Html\\new.html");
           

      FileWriter fw = new FileWriter( file2 );
    BufferedWriter bw = new BufferedWriter( fw );
    bw.write( contents );
    bw.close( );    
    Desktop.getDesktop().open(file2);
    

}

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
