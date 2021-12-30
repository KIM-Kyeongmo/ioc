package kr.co.ezenac.ioc;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class UrlEncoder {

    public String encode(String message) {
        try {
            return URLEncoder.encode(message,"utf-8");
        } catch (UnsupportedEncodingException e) {
            System.out.println("오류 발생");
            e.printStackTrace();
            return null;
        }
    }
}
