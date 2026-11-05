package fileHandling;

import java.io.File;
import java.io.IOException;

/**
 * filecreating
 */
public class filecreating {

    public static void main(String[] args) throws IOException{
        File folderCreating = new File("./Projects/LibraryManagement/");
        File fileCreating = new File(folderCreating+"/book.java");

        // Create a File
        fileCreating.createNewFile();


        // Delete a File
        // if (fileCreating.exists()) {
        //     fileCreating.delete();
        // }

        // create a Folder
        // if (!folderCreating.exists()) {
        //     folderCreating.mkdir();
        // }

        // folderCreating.mkdir();
        
        // delete a Folder
        // if (folderCreating.exists()) {
        //     folderCreating.delete();
        // }
        
    }
}