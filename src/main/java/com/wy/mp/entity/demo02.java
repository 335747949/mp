package com.wy.mp.entity;


import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author lanwei
 * @email 335747949@qq.com
 */
public class demo02 {
    public static void main(String[] args) throws IOException {

        /**
         * FileOutputStream构造方法
         *      FileOutputStream(String name)
         *      FileOutputStream(File file)
         *      写入硬盘的目的地
         */

        FileOutputStream fos =  new FileOutputStream("D:\\idea-space\\Javaprojects\\IDEAProjects\\mp\\a.txt",true);

        //fos.write(150515150);

        for(int i = 0;i<=10;i++){
            byte[] bytes = "你好".getBytes();
            fos.write(bytes);
            fos.write("\r\n".getBytes());

        }
        fos.close();


    }
}
