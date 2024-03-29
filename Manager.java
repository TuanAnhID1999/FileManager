package FileManager;

public class Manager {

    public static  final String ALLFILE = "";
    public static  final String MUSSIC = "Music";
    public static  final String VIDEO = "Video";
    public static  final String DOCUMENT = "Document";
    public static  final String IMAGE = "Image";


    public void showAllFile(String fileTypes) {
        System.out.println("Show all files " + fileTypes);

    }


    public void openFile(File file) {
        System.out.println("Open file " + file.getNameFile() + "(path = " + file.getPathFile() + ") using " + file.getApp());

    }

    public void deleteFile(File file) {
        System.out.println("Delete file " + file.getNameFile() + " path " + file.getPathFile() + " success ! ");

    }

    public void detailsFile(File file){
        System.out.println(file.toString());
    }

    public void shareFile(File nameFile, String shareWith, String application) {
        System.out.println("Share file " + nameFile.getNameFile() + "(" + nameFile.getPathFile() + ")" + " with " + shareWith + " via " + application + " successfully");
    }


    public void moveFile(File file, String newPathFile) {
        String oldFile = file.getPathFile();
        file.setLocationFile(newPathFile);
        System.out.println("Move file " + file.getNameFile() + " with path file (" + oldFile + ") to " + file.getPathFile() + " success ! " );
        System.out.println(file.getPathFile());
    }

    // set name vs set loction thì set lại path
    public void renameFile( File file , String newNameChange) {
        String oldName = file.getNameFile();
        String oldPath = file.getPathFile();
        file.setNameFile(newNameChange);
       // file.setPathFile( file.getLocationFile()+file.getNameFile());
        System.out.println("Rename file '" + oldName + "' Old path '"+ oldPath + "' to '" +" New name '"+ file.getNameFile()+ "' New path '"+ file.getPathFile() +  "' success ! ");
       // System.out.println("Name " + file.getNameFile()+ " location "+ file.getLocationFile() + " Path "+ file.getPathFile());
    }


}
