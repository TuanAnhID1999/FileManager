package FileManager;

public class Audio extends File {


    public Audio(String nameFile, float sizeFile, String locationFile) {
        super(nameFile, sizeFile, locationFile);
        this.appUse = "Music Player";
        System.out.println("Show all Audio files");


    }


}
