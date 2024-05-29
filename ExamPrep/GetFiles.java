import java.io.File;

public class GetFiles {
    static int fc = 0;
    static int dc = 0;

    public static void main(String[] args) {
        String dirPath = "F:/SGGS/New folder/gpa";
        getFilesAndFolders(dirPath);
        System.out.println("FileCount : " + fc + " DirectoryCount : " + dc);

    }

    static void getFilesAndFolders(String path) {
        File dir = new File(path);
        File[] files = dir.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    fc++;
                    System.out.println("File :  " + file.getName());
                }
                if (file.isDirectory()) {
                    dc++;
                    System.out.println("Folder :    " + file.getName());
                }
            }
        } else {
            System.out.println("error");
        }
    }
}
