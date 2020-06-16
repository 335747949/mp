package com.wy.mp.entity;


import java.io.FileWriter;
import java.io.IOException;

/**
 * @author lanwei
 * @email 335747949@qq.com
 */
public class demo05 {
    public static void main(String[] args) throws IOException {
//        FileReader fr = new FileReader("D:\\idea-space\\Javaprojects\\IDEAProjects\\mp\\a.txt");
//
//        char[] chars = new char[1024];
//        int len = 0;
//        while ((len = fr.read(chars))!=-1){
//
//            //public String(char value[], int offset, int count)  将字符数组转化为字符串输出
//            System.out.print(new String(chars,0,len));
//        }
//        fr.close();


        FileWriter fw = new FileWriter("D:\\idea-space\\Javaprojects\\IDEAProjects\\mp\\b.txt",true);

//        fw.write("你好");
//        fw.flush();
//        fw.write("北京欢迎你！");
//        fw.flush();

//        fw.write("遥远的东方有一条龙！",3,7);

        for(int i=0;i<=10;i++){
            fw.write("HelloWorld"+i+"\r\n");
        }

        fw.close();
    }
}
