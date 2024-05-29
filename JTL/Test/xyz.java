import java.io.File;
class FilesFoldersExample{
	int fileCounter;
	int folderCounter;
	
	public static void main(String arg[]){
		System.out.println("HI....");
		FilesFoldersExample ffe = new FilesFoldersExample();
		ffe.setNumberOfFilesAndFolders("./packageExamples");
 	}
 	
 	
 	public void setNumberOfFilesAndFolders(String path){
 		File file = new File(path);
 		// System.out.println(file.getName());
 		System.out.println(file.getParent());
 		// System.out.println(file.listFiles()[2].getAbsolutePath());
 	}

}
