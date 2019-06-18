package FileManager;

public class Video extends File {


    public Video(String nameFile, int sizeFile, String locationFile) {
        super(nameFile, sizeFile, locationFile);
        this.appUse = "Video Player";

    }

    @Override
    public String toString() {
        return " Video ";
    }
}
