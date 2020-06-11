package com.wy.mp.entity;

import javax.swing.plaf.metal.MetalBorders;
import java.util.ArrayList;
import java.util.Collections;


/**
 * @author lanwei
 * @email 335747949@qq.com
 */
public class demo {
    public static void main(String[] args) {

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
        //System.out.println(poke);


        Collections.shuffle(poke);
        //System.out.println(poke);

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

}

