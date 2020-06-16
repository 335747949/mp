package com.wy.mp.entity;

import java.io.*;

/**
 * 缓冲流读写
 * @author lanwei
 * @email 335747949@qq.com
 */
public class demo09 {
    public static void main(String[] args) throws IOException {

        Long s = System.currentTimeMillis();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("d:\\6a63f6246b600c334c3e91cb1e4c510fd9f9a16a.jpg"));

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("e:\\6a63f6246b600c334c3e91cb1e4c510fd9f9a16a.jpg"));

        byte[] bytes = new byte[1024];
        int len = 0 ;
        while((len = bis.read(bytes))!=-1){
            //bos.write(len);
            bos.write(bytes,0,len);
        }
        bos.close();
        bis.close();
        Long e = System.currentTimeMillis();
        System.out.println("耗时："+(e-s)+"毫秒");
    }
}
