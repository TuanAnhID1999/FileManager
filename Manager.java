package FileManager;

public class Manager {
    public final String AUDIO = "Music Player";
    public final String VIDEO = "Video Player";
    public final String DOCUMENT = "Doc Viewer";
    public final String IMAGE = "Gallery";

    public void showAllFile() {
        System.out.println("Show all files ");

    }

    public void openFile(File file) {
        System.out.println("Open file " + file.getNameFile() + "(path = " + file.getPathFile() + ") using " + file.getApp());

    }

    public void deleteFile(File file) {
        System.out.println("Delete file " + file.getNameFile());
    }

    public void shareFile(File nameFile, String shareWith, String application) {
        System.out.println("Share file " + nameFile.getNameFile() + "(" + nameFile.getPathFile() + ")" + " with " + shareWith + " via " + application + " successfully");
    }


    public void moveFile(File nameFile, String nameFileNew) {
        System.out.println(("Move file " + nameFile.getNameFile() + "(path = " + nameFile.getPathFile() + ")" + " to MyFile/Favorite (path = " + nameFileNew + ") successfully"));

    }

    public void renameFile(File nameFile, String change) {
        System.out.println("Rename file " + nameFile.getNameFile() + "(path = " + nameFile.getPathFile() + ")" + " successfully. New name is " + change + "(path = MyFiles/Video/" + change + ")");
    }


}
