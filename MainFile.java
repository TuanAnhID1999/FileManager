package FileManager;


public class MainFile {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.showAllFile();

        System.out.println();
        File audio = new Audio("best-song.mp3", 50, "Myfile/Audio");
        manager.showAllFileOne(audio);
        manager.openFile(audio);
        manager.deleteFile(audio);


        File image = new Image("nice-pic.png", 80, "Myfile/Image");
        manager.showAllFileOne(image);
        manager.openFile(image);
        manager.renameFile(image,"tuan_anh.png");


        File document = new Document("tailieu", 40, "Myfiles/Document");
        manager.showAllFileOne(document);
        manager.openFile(document);


        File video = new Video("excited-film.mp4", 60, "MyFiles/Video");
        manager.showAllFileOne(video);
        manager.openFile(video);
        manager.renameFile(video, "phimhay.mp4");
        manager.moveFile(video, "MyFiles/FavoriteTuanAnh");
        manager.shareFile(video, "Tuấn Anh", "faceBook");


    }
}