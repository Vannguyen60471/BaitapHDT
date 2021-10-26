/*
* ngày tạo: Oct 26, 2021
* tên tác giả: Nguyễn Hoàng Trọng văn
*/
package com.vannht2008110055.lab7.xoayHinhVaAmThanh;

public class Triangle extends Shape {
    String amThanh = "Triangle music";
    boolean click = true;

    void turn(){
        System.out.println(" Xoay 360");
        click = true;
    }
    void playMusic(){
        if(click == true){
            System.out.println("Nhạc đang được phát"+amThanh);

        }
        else
        System.out.println("Lỗi Phát");
    }
    
}
