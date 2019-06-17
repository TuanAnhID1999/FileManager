package FileManager;

public class Image extends File {


    public Image(String nameFile, float sizeFile, String locationFile) {
        super(nameFile, sizeFile, locationFile);
        this.appUse = "Gallery";
        System.out.println("Show all Image files");
    }


}
