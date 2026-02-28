import java.util.ArrayList;
import java.util.List;;

class Downloader extends Thread {
    String image ;
    static int count = 1;
    public Downloader(String image) {
        this.image  = image;
    }
    public void run() {
        System.out.println("downloding" + count ++);
        download(image);
    }
    public void download(String image) {

    }
}

public class ImageDownloader {
    public static void main(String[] args) {
        String[] imager = {"image1", "image2", "image3"};
        List<Thread> list =  new ArrayList<>();
        for(int i  = 0; i < imager.length ;i++) {
            Downloader d = new Downloader(imager[i]);
            d.start();
        }
    }
}