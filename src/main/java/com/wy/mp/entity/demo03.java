package com.wy.mp.entity;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author lanwei
 * @email 335747949@qq.com
 */
public class demo03 {
    public static void main(String[] args) throws IOException {

        /**
         * FileInputStream:字节输入流
         *      构造方法：
         *      FileInputStream(String name);
         *      FileInputStream(File file);
         *      参数：读取文件的数据源
         */

        FileInputStream fis = new FileInputStream("D:\\idea-space\\Javaprojects\\IDEAProjects\\mp\\a.txt");
//
//        int len = 0;
//        while((len = fis.read())!=-1){
//            System.out.print((char)len);
//        }


        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = fis.read(bytes)) !=-1){
            System.out.println(len);
            System.out.println(new String(bytes,0,len));
        }
    }
}
