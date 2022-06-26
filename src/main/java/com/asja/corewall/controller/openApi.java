package com.asja.corewall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @Description 转发外部请求
 * @Author ASJA
 * @Create 2022-06-25 11:01
 */
@Controller
@RequestMapping("//openApi")
public class openApi {

    @Autowired
    private RestTemplate restTemplate;

//    @RequestMapping("/test")
//    public Im test (){
//        ResponseEntity<byte[]> responseEntity =  restTemplate.exchange("https://th.wallhaven.cc/small/wy/wygmrr.jpg", HttpMethod.GET,null,byte[].class);
//        return responseEntity.getBody();
//
//    }

    @RequestMapping(value = "/get")
    @ResponseBody
    public void getImage(HttpServletResponse response) throws IOException {
        File file = new File("D:\\code\\wallCopy\\script\\full\\wallhaven-y8p69g.jpg");
        FileInputStream inputStream = new FileInputStream(file);
        byte[] bytes = new byte[inputStream.available()];

        response.setContentType("image/jpeg");
        OutputStream out = response.getOutputStream();
        out.write(bytes);
        out.flush();
        //关闭响应输出流
        out.close();

    }

    @RequestMapping(value = "/image",produces = MediaType.IMAGE_JPEG_VALUE)
    @ResponseBody
    public byte[] getImage() throws Exception {
        URL url = new URL("https://th.wallhaven.cc/small/96/96w8e8.jpg");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
        conn.setRequestMethod("GET");
        conn.setConnectTimeout(5 * 1000);
        InputStream inStream = conn.getInputStream();// 通过输入流获取图片数据
        byte[] btImg = readInputStream(inStream);// 得到图片的二进制数据
        return btImg;
    }

    public static byte[] readInputStream(InputStream inStream) throws Exception {
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[inStream.available()];
        int len = 0;
        while ((len = inStream.read(buffer)) != -1) {
            outStream.write(buffer, 0, len);
        }
        inStream.close();
        return outStream.toByteArray();
    }


}
