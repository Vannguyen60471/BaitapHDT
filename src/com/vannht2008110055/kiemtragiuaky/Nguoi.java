/*
* ngày tạo: Nov 04, 2021
* tên tác giả: Nguyễn Hoàng Trọng văn
*/
package com.vannht2008110055.kiemtragiuaky;

public class Nguoi {
    private String hoTen;
    private String diaChi;


   Nguoi(){}

    public String getHoTen() {
        return hoTen;
    }
    public   void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }
    public   void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() { 
      
        return super.toString();
    }

    protected void xuat()
    {
        System.out.println("Họ và Tên : "+hoTen);
        System.out.println("Địa chỉ   : "+diaChi);
    }
}