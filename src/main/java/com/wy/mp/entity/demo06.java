package com.wy.mp.entity;



import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * IO流  try....catch
 * @author lanwei
 * @email 335747949@qq.com
 */
public class demo06 {
    public static void main(String[] args) {
//        FileWriter fw = null;
//        try {
//            fw = new FileWriter("D:\\idea-space\\Javaprojects\\IDEAProjects\\mp\\b.txt");
//
//            for(int i=0;i<=10;i++){
//                fw.write("HelloWorld"+i+"\r\n");
//            }
//        }catch (IOException e){
//            e.printStackTrace();
//        }finally {
//            if(fw != null){
//                try {
//                    fw.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }


        try (
                FileWriter fw = new FileWriter("D:\\idea-space\\Javaprojects\\IDEAProjects\\mp\\b.txt")
        ){
            for (int i = 0;i<=10;i++){
                fw.write("HelloWorld"+i+"\r\n");
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
