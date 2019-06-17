package FileManager;

public class File {
    protected String nameFile;
    protected float sizeFile;
    protected String locationFile;
    protected String pathFile;
    protected String appUse;


    public File(String nameFile, float sizeFile, String locationFile) {
        this.nameFile = nameFile;
        this.sizeFile = sizeFile;
        this.locationFile = locationFile;
        this.pathFile = locationFile + "/" + nameFile;
    }


    public String getNameFile() {
        return nameFile;
    }


    public float getSizeFile() {
        return sizeFile;
    }


    public String getLocationFile() {
        return locationFile;
    }


    public String getPathFile() {
        return pathFile;
    }


    public String getApp() {
        return appUse;
    }


}
