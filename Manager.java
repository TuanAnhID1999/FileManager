package FileManager;

public class Manager {


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
        System.out.println("file information {" + " fileName="+ file.getNameFile() + ", fileSize = "+ file.getSizeFile()+ ", fileLocation = " + file.locationFile + ", filePath ="+ file.getPathFile()+ ", openApp=" + file.getApp() + "}");
    }

    public void shareFile(File nameFile, String shareWith, String application) {
        System.out.println("Share file " + nameFile.getNameFile() + "(" + nameFile.getPathFile() + ")" + " with " + shareWith + " via " + application + " successfully");
    }


    public void moveFile(File file, String newPathFile) {
        String oldFile = file.getPathFile();
        file.setPathFile(newPathFile);
        System.out.println("Move file " + file.getNameFile() + " with path file (" + oldFile + ") to " + file.getPathFile() + " success ! " );
        System.out.println(file.getPathFile());
    }

    public void renameFile( File file , String newNameChange) {
        String oldName = file.getNameFile();
        file.setNameFile(newNameChange);
        System.out.println("Rename file '" + oldName + "' to '" + newNameChange +  "' success ! ");
        System.out.println(file.getNameFile());
    }


}
