package com.jang.libjava;

public class Test2 {

    //오버로딩
    int add(int x,int y){
        return x+y;
    }

    float add(float x, float y){
        return x+y;
    }

    String add(String x,String y) {
        return x+y;
    }

    float add(int x, float y) {
        return x+y;
    }

    float add(float x, int y) {
        return x+y;
    }

    int add(int x, int y, int z) {
        return x+y+z;
    }
}
