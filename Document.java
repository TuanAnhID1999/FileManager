package FileManager;

public class Document extends File {


    public Document(String nameFile, int sizeFile, String locationFile) {
        super(nameFile, sizeFile, locationFile);
        this.appUse = "Doc Viewer";
        System.out.println("Show all Document files");
    }


}
