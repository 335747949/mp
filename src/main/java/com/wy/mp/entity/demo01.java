package com.wy.mp.entity;



import java.util.*;

/**
 * @author lanwei
 * @email 335747949@qq.com
 */
public class demo01 {


    /**
     * 集合综合练习：有序斗地主
     *
     * 1.准备牌
     * 2.洗牌
     * 3.发牌
     * 4.看牌
     */

    public static void main(String[] args) {

        HashMap<Integer,String> poke = new HashMap<>();
        ArrayList<Integer> pokeIndex = new ArrayList<>();
        String[] colours = {"♠","♥","♣","♦"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};

        Integer index = 0;
        poke.put(index,"大王");
        pokeIndex.add(index);
        index++;
        poke.put(index,"小王");
        pokeIndex.add(index);
        index++;

        for(String number : numbers){
            for(String colour : colours){
                poke.put(index,colour+number);
                pokeIndex.add(index);
                index++;
            }
        }
//        System.out.println(poke);
//        System.out.println(pokeIndex);

        Collections.shuffle(pokeIndex);

//        System.out.println("打乱顺序的牌的key："+pokeIndex);

        ArrayList<Integer> play01 = new ArrayList<>();
        ArrayList<Integer> play02 = new ArrayList<>();
        ArrayList<Integer> play03 = new ArrayList<>();
        ArrayList<Integer> dipai = new ArrayList<>();

        for(int i=0;i<pokeIndex.size();i++){
            Integer in = pokeIndex.get(i);
            if(i>=51){
                dipai.add(in);
            }else if(i%3 == 0){
                play01.add(in);
            }else if(i%3 == 1){
                play02.add(in);
            }else if(i%3 == 2){
                play03.add(in);
            }
        }
//        System.out.println("play01的牌："+play01);
//        System.out.println("play02的牌："+play02);
//        System.out.println("play03的牌："+play03);
//        System.out.println("底牌："+dipai);


        Collections.sort(play01);
        Collections.sort(play02);
        Collections.sort(play03);

        //看牌
        lookPoke("刘德华",poke,play01);
        lookPoke("周润发",poke,play02);
        lookPoke("周星驰",poke,play03);
        lookPoke("底牌",poke,dipai);

    }

    public static void lookPoke(String name,Map<Integer,String> poke,ArrayList<Integer> list){
        System.out.print(name+": ");
        for(Integer key : list){
            String value = poke.get(key);
            System.out.print(value+" ");
        }
        System.out.println();
    }

}
