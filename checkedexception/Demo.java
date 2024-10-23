package checkedexception;

import java.io.PrintWriter;
import java.io.FileNotFoundException;
 class Demo {

    public static void main(String[] args) {
        
        PrintWriter pw;

        try{
            pw=new PrintWriter("p.txt");
            pw.println("Saved");
        }
        catch(FileNotFoundException f){
            System.out.println(f);
        }
        System.out.println("File Saved Sucessfully!!!");
        
    }
    
}
