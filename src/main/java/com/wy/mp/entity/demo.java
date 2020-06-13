package com.wy.mp.entity;

import com.sun.org.apache.xpath.internal.SourceTree;

import javax.swing.plaf.metal.MetalBorders;
import java.security.Key;
import java.util.*;


/**
 * @author lanwei
 * @email 335747949@qq.com
 */
public class demo {
    public static void main(String[] args) {

//        show();
//        show01();
//        show02();
//        show03();
//        show04();
        show05();
        ArrayList<String> poke = new ArrayList<>();

        String[] colours = {"♥","♠","♣","♦"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};

        poke.add("大王");
        poke.add("小王");
        for(String colour : colours){
            for(String number : numbers){
                poke.add(colour+number);
            }
        }

        Collections.shuffle(poke);
        ArrayList<String> play01 = new ArrayList<>();
        ArrayList<String> play02 = new ArrayList<>();
        ArrayList<String> play03 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        for(int i = 0 ; i<poke.size();i++){
            if(i>=51){
                dipai.add(poke.get(i));
            }else if (i%3 == 0){
                play01.add(poke.get(i));
            }else if (i%2 == 0){
                play02.add(poke.get(i));
            }else {
                play03.add(poke.get(i));
            }
        }

        System.out.println("========================================");
        System.out.println("========================================");
        System.out.println("玩家01："+play01);
        System.out.println("玩家02："+play02);
        System.out.println("玩家03："+play03);
        System.out.println("底牌："+dipai);


    }


    public static void show(){

        Map<String,Integer> map = new HashMap<>();

        map.put("刘德华",50);
        map.put("周杰伦",40);
        map.put("薛之谦",30);
        map.put("林俊杰",40);
        map.put("华晨宇",30);

        boolean key = map.containsKey("周杰伦");

        System.out.println(key);
    }

    public static void show01(){
        Map<String,Integer> map = new HashMap<>();

        map.put("刘德华",50);
        map.put("周杰伦",40);
        map.put("薛之谦",30);
        map.put("林俊杰",40);
        map.put("华晨宇",30);

        Set<String> set = map.keySet();

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            Integer integer = map.get(key);
            System.out.println(key+"="+integer);

        }

    }

    public static void show02(){
        Map<String,Integer> map = new HashMap<>();

        map.put("刘德华",50);
        map.put("周杰伦",40);
        map.put("薛之谦",30);
        map.put("林俊杰",40);
        map.put("华晨宇",30);

        Set<String> set = map.keySet();

        for(String key : set){

            Integer value = map.get(key);
            System.out.println(value);
        }

    }

    public static void show03(){
        Map<String,Integer> map = new HashMap<>();

        map.put("刘德华",50);
        map.put("周杰伦",40);
        map.put("薛之谦",30);
        map.put("林俊杰",40);
        map.put("华晨宇",30);

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        for(Map.Entry<String ,Integer> entry : entrySet){

            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"="+value);
        }
    }


    public static void show04(){
        Map<String,Integer> map = new HashMap<>();

        map.put("刘德华",50);
        map.put("周杰伦",40);
        map.put("薛之谦",30);
        map.put("林俊杰",40);
        map.put("华晨宇",30);

        Set<String> set = map.keySet();

        for (String key : set) {
            Integer value = map.get(key);
            System.out.println(key+"-->"+value);
        }

    }

    /**
     * 判断一个字符串每个字符出现的次数
     *
     * 1.通过Scanner获取到一个字符串
     * 2.通过toCharArray()将字符串转换为数组
     * 3.遍历数组，获取每一个字符
     * 4.使用获取获取到的字符，去判断map集合是否有key值
     *      key存在：
     *          通过key获取到value值
     *          value++
     *          将key，value  put到map中
     *      key值不存在：
     *          ***首次put
     *          直接将（key，1）put到map中
     *  5.遍历map
     */
    public static void show05(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = scanner.nextLine();

        Map<Character,Integer> map = new HashMap<>();
        for(Character character :str.toCharArray()){
            if(map.containsKey(character)){
                Integer value = map.get(character);
                value++;
                map.put(character,value);
            }else {
                map.put(character,1);
            }
        }
        for(Character key : map.keySet()){
            Integer value = map.get(key);
            System.out.println(key+"--->>>"+value);
        }
    }
}

