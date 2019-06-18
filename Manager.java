package FileManager;

public class Manager {
    public final String AUDIO = "Music Player";
    public final String VIDEO = "Video Player";
    public final String DOCUMENT = "Doc Viewer";
    public final String IMAGE = "Gallery";

    public void showAllFile() {
        System.out.println("Show all files ");

    }

    public void showAllFileOne(File file) {
        System.out.println("Show all" + file + "files");
    }

    public void openFile(File file) {
        System.out.println("Open file " + file.getNameFile() + "(path = " + file.getPathFile() + ") using " + file.getApp());

    }

    public void deleteFile(File file) {
        System.out.println("Delete file " + file.getNameFile());
        file = new File(null,0,null);
        System.out.println(file.getNameFile());
    }

    public void shareFile(File nameFile, String shareWith, String application) {
        System.out.println("Share file " + nameFile.getNameFile() + "(" + nameFile.getPathFile() + ")" + " with " + shareWith + " via " + application + " successfully");
    }


    public void moveFile(File file, String newPathFile) {
        System.out.println(("Move file " + file.getNameFile() + "(path = " + file.getPathFile() + ")" + " to " + newPathFile + " (path = " + newPathFile + "/" + file.getNameFile() + ") successfully"));
        file = new File(file.getNameFile(),newPathFile);
        System.out.println("New path file = " + file.getLocationFile()+ "/" + file.getNameFile());

    }

    public void renameFile(File file, String nameChange) {
        System.out.println("Rename file " + file.getNameFile() + "(path = " + file.getPathFile() + ")" + " successfully. New name is " + nameChange + "(path = " + file.getLocationFile() + "/" + nameChange + ")");
         file = new File(nameChange);
        System.out.println("FILE NAME NEW = " + file.getNameFile());
    }


}
