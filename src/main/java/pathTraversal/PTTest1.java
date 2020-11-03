package pathTraversal;

import java.io.File;

// Base Directory: /users/ws/profiles/
// Unsafe filename: ../../../etc/passwd
// Canonical unsafe-file: /users/ws/profiles/../../../etc/passwd ----->>>  /etc/passwd ---->>>>
// Vulnerability!

public class PTTest1 {
  private final String BASE_DIRECTORY = "/users/ws/profiles/";

  public void test(String filename) {
    try {
      String newBaseDir = getDir(BASE_DIRECTORY);
      File myFile = new File(newBaseDir + filename);
      deleteFile(myFile);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
  
  private String getDir(String baseDir){
    return baseDir + "subDir";
  }

  private void deleteFile(File f) {
    f.delete();
  }
}
