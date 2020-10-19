package pathTraversal;

import java.util.UUID;
import java.io.File;

public class PTTest3 {
    private final String BASE_DIRECTORY = "src/";
    public void test(String filename, String subDirName) {
        try {
            String dirpath = getvalue(BASE_DIRECTORY) + subDirName + "subsubdir/";
            File dictionaryFile = new File(dirpath + filename);
            dictionaryFile.delete();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.print("sdfsf");
    }

    public String getvalue(String str){
        return str+ "tempdir/";
    }

}