/*
* ngày tạo: Oct 26, 2021
* tên tác giả: Nguyễn Hoàng Trọng văn
*/
package com.vannht2008110055.lab7.xoayHinhVaAmThanh;

public class Amoeba extends Shape{
    String sound;

    int x;
    int y;

    Amoeba(){}        
    
    public Amoeba(String s){
        sound = s;
    }
    public Amoeba(String s, int xx, int yy){
        sound = s;
        x = xx;
        y = yy;
    }
    void rotate(){


        System.out.println("xoay theo tọa độ x và y");
        System.out.println("x = "+x +" y = "+y);
    }
    void playSound(){
        System.out.println("phát ra file âm thanh có tên "+sound);
    }
    
}
