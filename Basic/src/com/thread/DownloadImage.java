package com.thread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class DownloadImage implements Runnable{
    private String url;
    private String name;

    public DownloadImage(String url,String name){
        this.url= url;
        this.name = name;

    }
    @Override
    public void run() {
        WebDownloader webdownloader = new WebDownloader();
        webdownloader.downloader(url,name);
        System.out.println("下载的文件名为"+ name);
    }

    public static void main(String[] args) {
        DownloadImage downloadImage1 = new DownloadImage("https://img0.baidu.com/it/u=256816879,771155532&fm=253&fmt=auto&app=120&f=JPEG?w=1204&h=800","test1.jpg");
        DownloadImage downloadImage2 = new DownloadImage("https://img0.baidu.com/it/u=256816879,771155532&fm=253&fmt=auto&app=120&f=JPEG?w=1204&h=800","test2.jpg");
        DownloadImage downloadImage3 = new DownloadImage("https://img0.baidu.com/it/u=256816879,771155532&fm=253&fmt=auto&app=120&f=JPEG?w=1204&h=800","test3.jpg");
//    downloadImage1.start();
//    downloadImage2.start();
//    downloadImage3.start();
        new Thread(downloadImage1).start();
        new Thread(downloadImage2).start();
        new Thread(downloadImage3).start();

    }

}
class WebDownloader{
    public void downloader(String url,String name){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO 异常");
        }
    }
}

