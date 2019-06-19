package FileManager;


public class MainFile {


    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.showAllFile(Manager.ALLFILE);

        System.out.println();
        File audio = new Audio("best-song.mp3", 50, "Myfile/Audio");
        manager.showAllFile(Manager.VIDEO);
        manager.detailsFile(audio);
        manager.openFile(audio);
        manager.deleteFile(audio);
        manager.shareFile(audio,"Tuấn Anh", "Zalo");
        manager.moveFile(audio, "Myfile/Favorit");
        manager.renameFile(audio,"yêu lại từ đầu");


        File image = new Image("nice-pic.png", 80, "Myfile/Image");


        File document = new Document("tailieu", 40, "Myfiles/Document");


        File video = new Video("excited-film.mp4", 60, "MyFiles/Video");


//        manager.moveFile(video, "MyFiles/FavoriteTuanAnh");
//        manager.shareFile(video, "Tuấn Anh", "faceBook");


    }
}