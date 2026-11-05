package fileHandling;

import java.io.File;
import java.io.IOException;

/**
 * filehandlingpractice
 */
public class filehandlingpractice {

    public static void main(String[] args) throws IOException{
        File f = new File("collections/Map");
        // if (f.exists()) {
        //     f.delete();
        // }
        // System.out.println(f.mkdir());

        // for(File filename : f.listFiles()){
        //     System.out.println(filename);
        // }

        // System.out.println(f.isFile());
        // System.out.println(f.isDirectory());

        // f.createNewFile();
        // System.out.println(f.setWritable(true));
        // System.out.println(f.canWrite());
        // System.out.println(f.isHidden());
        // System.out.println(f.getAbsolutePath());


        // File f2 = new File("./start.java");
        // System.out.println(f2.canExecute()); 
        
        File f3 = new File("collections/list/LinkedList/practice1.java");
        File fc = new File("./filecreating.java");


        if (fc.exists()) {
            fc.delete();
        }
        else fc.createNewFile();
    }
}