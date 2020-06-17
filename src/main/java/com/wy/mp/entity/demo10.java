package com.wy.mp.entity;


import java.io.*;

/**
 * 转换流
 * @author lanwei
 * @email 335747949@qq.com
 */
public class demo10 {
    public static void main(String[] args) throws IOException {
        //write_utf8();
        //write_gbk();
        read_utf8();
    }

    private static void read_utf8() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\idea-space\\Javaprojects\\IDEAProjects\\mp\\gbk.txt"));

        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = isr.read())!=-1){
            System.out.print((char) len);
        }
        isr.close();
    }

    private static void write_gbk() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\idea-space\\Javaprojects\\IDEAProjects\\mp\\gbk.txt"), "gbk");
        osw.write("你好");
        osw.flush();
        osw.close();
    }

    private static void write_utf8() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\idea-space\\Javaprojects\\IDEAProjects\\mp\\utf8.txt"));
        osw.write("你好");
        osw.flush();
        osw.close();
    }
}
