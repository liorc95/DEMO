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
      String newBase = getbaseDir(BASE_DIRECTORY);
      File myFile = new File(newBase + filename);
      deleteFile(myFile);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
  
  private String getbaseDir(String base){
    return base +"subDir";
  }

  private void getFile1(String fileName){
    getFile2(fileName);
  }
  
private void getFile2(String fileName){
  getFile3(fileName);
  }
  private void getFile3(String fileName){
    getFile4(fileName);
  }
  private void getFile4(String fileName){
    test(fileName);
  }
 
  
  private void deleteFile(File f) {
    f.delete();
  }
}
