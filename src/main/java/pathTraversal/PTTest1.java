package pathTraversal;

import java.util.UUID;
import java.io.File;

public class PTTest1 {
    private final String BASE_DIRECTORY = "src";
    public void test(String filename) {
        try {
            File dictionaryFile = new File(BASE_DIRECTORY + filename);
            delFile(dictionaryFile);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.print("sdfsf");
    }

    private void delFile(File f) {
        f.delete();
    }
}