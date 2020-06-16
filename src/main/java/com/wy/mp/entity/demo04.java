package com.wy.mp.entity;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author lanwei
 * @email 335747949@qq.com
 */
public class demo04 {
    public static void main(String[] args) throws IOException {

        /**
         * io流  复制（一读一写）
         */
        Long s = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\图片素材\\包图网_700192烟雾烟火元素素材.png");

        FileOutputStream fos = new FileOutputStream("D:\\包图网_700192烟雾烟火元素素材.png");

        byte[] bytes = new byte[1024*4];

        int len = 0;
        while ((len = fis.read(bytes)) != -1){

            fos.write(bytes,0,len);
        }

        //释放资源，先释放写的（写完肯定就读完了）
        fos.close();
        fis.close();
        Long e = System.currentTimeMillis();
        System.out.println("总耗时："+(e-s)+"毫秒");
    }
}
