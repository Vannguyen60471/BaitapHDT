/*
* ngày tạo: Nov 03, 2021
* tên tác giả: Nguyễn Hoàng Trọng văn
*/
package com.vannht2008110055.lab8;

public class Vuong extends ChuNhat{
    private Double canh; 
    public Double getCanh() {
        return canh;
    }
    public void setCanh(Double canh) {
        this.canh = canh;
    }
    public void xuat(){
        System.out.println("Diện Tích và Chu Vi Hình Vuông ");
        System.out.println("Diện Tích : " +getCanh()*getCanh());
        System.out.println("Chu Vi    : " +getCanh()*4);
    }
    
}
