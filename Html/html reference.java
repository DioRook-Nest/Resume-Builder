import java.awt.Desktop;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;



class Resume{
    public static void main (String args[]) throws IOException{
        File file1= new File ("C:\\Users\\Stevert Lobo\\Desktop\\Html\\template.html");
String contents = new String(Files.readAllBytes(Paths.get("C:\\Users\\Stevert Lobo\\Desktop\\Html\\template.html")));

//FileReader fr= new FileReader(file1);
//BufferedReader br=new BufferedReader(fr);
//String contents=br.read(fr);
    Desktop.getDesktop().open(file1);

System.out.println("Contents old : " + contents);
String title = "Resume Builder";
String body = "First step to Our Project Success";
contents = contents.replace("$title", title);
contents= contents.replace("$body", body);
System.out.println("\n\n\n\nContents (new) : " + contents);
File file2 = new File("C:\\Users\\Stevert Lobo\\Desktop\\Html\\new.html");
           

      FileWriter fw = new FileWriter( file2 );
    BufferedWriter bw = new BufferedWriter( fw );
    bw.write( contents );
    bw.close( );    
    Desktop.getDesktop().open(file2);
    

}

    
}
