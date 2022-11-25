package com;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Model {
    //一组牌
    int value; //权值
    int num;// 手数 (几次能够走完，没有挡的情况下)
    List<String> a1 = new CopyOnWriteArrayList<String>(); //单张
    List<String> a2 = new CopyOnWriteArrayList<String>(); //对子
    List<String> a3 = new CopyOnWriteArrayList<String>(); //3带
    List<String> a123 = new CopyOnWriteArrayList<String>(); //连子
    List<String> a112233 = new CopyOnWriteArrayList<String>(); //连牌
    List<String> a111222 = new CopyOnWriteArrayList<String>(); //飞机
    List<String> a4 = new CopyOnWriteArrayList<String>(); //炸弹
}
