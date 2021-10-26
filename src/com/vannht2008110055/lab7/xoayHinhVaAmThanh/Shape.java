/*
* ngày tạo: Oct 26, 2021
* tên tác giả: Nguyễn Hoàng Trọng văn
*/
package com.vannht2008110055.lab7.xoayHinhVaAmThanh;

public class Shape {
    private String sound = "a";
    protected String Xoay(){
            System.out.println("Xoay hình 360 độ !!");
        return sound;
    }
    protected String PhatRaAmThanh(){
            System.out.println("Phát ra âm thanh : "+ sound +"  !!! ");
        return sound;
    }
}
