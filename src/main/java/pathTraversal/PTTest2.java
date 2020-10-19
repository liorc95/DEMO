package pathTraversal;

import java.util.UUID;
import java.io.File;

public class PTTest2 {
    private final String BASE_DIRECTORY = "src";
    public void test(String file) {
        System.out.print("sdfsf");
        sink(file);
    }

    private void sink(String filename) {
        int a =0;
        File dictionaryFile = new File(BASE_DIRECTORY , filename);
        dictionaryFile.delete();
    }
}
