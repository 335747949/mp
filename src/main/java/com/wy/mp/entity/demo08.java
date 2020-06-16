package com.wy.mp.entity;


import java.io.*;

/**
 * 字节缓冲流
 * @author lanwei
 * @email 335747949@qq.com
 */
public class demo08 {
    public static void main(String[] args) throws IOException {
        buffOut();
        buffInput();
    }

    private static void buffInput() throws IOException {

        /**
         * 字节输入缓冲流
         */

        FileInputStream fis = new FileInputStream("D:\\idea-space\\Javaprojects\\IDEAProjects\\mp\\prop.txt");

        BufferedInputStream bis = new BufferedInputStream(fis);

        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes))!=-1){
            System.out.print(new String(bytes,0,len));
        }
        bis.close();
    }

    private static void buffOut() throws IOException {

        /**
         * 字节输出缓冲流
         */
        FileOutputStream fos = new FileOutputStream("D:\\idea-space\\Javaprojects\\IDEAProjects\\mp\\prop.txt",true);

        BufferedOutputStream bos = new BufferedOutputStream(fos);

        bos.write("helloworld".getBytes());

        bos.write("\t\n".getBytes());

        bos.flush();

        bos.close();
    }
}
