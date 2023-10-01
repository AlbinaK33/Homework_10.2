package org.example.http;

import org.jsoup.Jsoup;

import java.io.IOException;

public class HttpStatusChecker {

    protected String getStatusImage(int code) throws IOException {
        String url = "https://http.cat/" + code +".jpg";
        Jsoup.connect(url).ignoreContentType(true).execute();
        return url;
    }
}

