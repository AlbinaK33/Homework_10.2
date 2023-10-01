package org.example.http;

import org.jsoup.Connection;
import org.jsoup.Jsoup;

import java.io.*;

public class HttpStatusImageDownloader {

    protected void downloadStatusImage(int code) throws IOException {
        String url = new HttpStatusChecker().getStatusImage(code);
        String nameFile = code + ".png";

        Connection connection = Jsoup.connect(url).ignoreContentType(true);
        InputStream inputStream = connection.execute().bodyStream();
        OutputStream outputStream = new FileOutputStream(nameFile);

        byte[] buffer = new byte[1024];
        int readByte;

        while ((readByte = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, readByte);
        }

        outputStream.flush();
        inputStream.close();
        outputStream.close();
    }
}

