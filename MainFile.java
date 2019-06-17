package FileManager;


public class MainFile {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.showAllFile();

        System.out.println();
        File audio = new Audio("best-song.mp3", 50, "Myfile/Audio");
        manager.openFile(audio);
        manager.deleteFile(audio);


        File image = new Image("nice-pic.png", 80, "Myfile/Image");
        manager.openFile(image);


        File document = new Document("tailieu", 40, "Myfiles/Document");
        manager.openFile(document);


        File video = new Video("excited-film.mp4", 60, "MyFiles/Video");
        manager.openFile(video);
        manager.renameFile(video, "phimhay.mp4");
        manager.moveFile(video, "MyFiles/Favorite/phimhay.mp4");
        manager.shareFile(video, "Tuấn Anh", "faceBook");


    }
}