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
        this.setPathFile();
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

    public void setNameFile(String nameFile) {
        this.nameFile = nameFile;
        this.setPathFile();
    }

    public void setSizeFile(float sizeFile) {
        this.sizeFile = sizeFile;
    }

    public void setLocationFile(String locationFile) {
        this.locationFile = locationFile;
        this.setPathFile();
    }

    public void setPathFile() {
        this.pathFile = this.locationFile + "/" + this.nameFile;
    }

    public void setAppUse(String appUse) {
        this.appUse = appUse;
    }

    @Override
    public String toString() {
        return "File{" +
                "nameFile='" + nameFile + '\'' +
                ", sizeFile=" + sizeFile +
                ", locationFile='" + locationFile + '\'' +
                ", pathFile='" + pathFile + '\'' +
                ", appUse='" + appUse + '\'' +
                '}';
    }
}
