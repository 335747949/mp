package com.wy.mp.entity;

import sun.awt.SunHints;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;



/**
 * @author lanwei
 * @email 335747949@qq.com
 */
public class demo07 {
    public static void main(String[] args) throws IOException {
        /**
         * Properties集合key,value 默认都是字符串类型，所以不用写泛型
         * setProperty() 相当于HashTable的put()方法
         * stringPropertyNames() 相当于map集合中的keyset()方法
         * getProperty(key) 相当于map集合中的get(key)方法
         *
         */
        Properties properties = new Properties();

        properties.setProperty("jay","180");
        properties.setProperty("jj","175");
        properties.setProperty("eson","168");
        properties.setProperty("pom","181");

        Set<String> set = properties.stringPropertyNames();

        for (String key : set) {
            String value = properties.getProperty(key);
            System.out.println(key+">>>>"+value);
        }

        test();
        test01();
    }

    private static void test01() throws IOException {

        /**
         * load()方法 将硬盘中的保存键值对的文件 读取到集合中
         */
        Properties properties = new Properties();

        properties.load(new FileReader("D:\\idea-space\\Javaprojects\\IDEAProjects\\mp\\prop.txt"));

        Set<String> set = properties.stringPropertyNames();
        for (String key : set) {
            String value = properties.getProperty(key);
            System.out.println(key+"="+value);
        }
    }

    private static void test() throws IOException {

        /**
         * store()方法 将集合中的临时数据，持久化的写出硬盘中  字符输出流可以写中文，字节输出流不可以写中文，注释不可以写中文
         */
        Properties properties = new Properties();

        properties.setProperty("jay","180");
        properties.setProperty("林俊杰","175");
        properties.setProperty("eson","168");
        properties.setProperty("pom","181");

        properties.store(new FileWriter("D:\\idea-space\\Javaprojects\\IDEAProjects\\mp\\prop.txt"),"");


    }
}
