package githubcopilot;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class FileManager {
    FileManager() {
        
    }
    //get all files in a directory
    public List<File> getFiles(File directory) {
        //get all files in a directory
        List<File> files = Arrays.asList(directory.listFiles());
        return files;
    }
}
