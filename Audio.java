package FileManager;

public class Audio extends File {


    public Audio(String nameFile, float sizeFile, String locationFile) {
        super(nameFile, sizeFile, locationFile);
        this.appUse = "Music Player";

    }

    @Override
    public String toString() {
        return " Audio ";
    }
}
