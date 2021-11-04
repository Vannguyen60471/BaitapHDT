/*
* ngày tạo: Nov 04, 2021
* tên tác giả: Nguyễn Hoàng Trọng văn
*/
package com.vannht2008110055.kiemtragiuaky;

public class KhachHang extends Nguoi {
    private String tenCongTy;
    private double triGiaHoaDon;


    KhachHang(){}
    public void setTenCongty(String tenCongty) {
        this.tenCongTy = tenCongty;
    }
    public String getTenCongty() {
        return tenCongTy;
    }

    public void setGiaTrihoaDon(double giaTrihoaDon) {
        this.triGiaHoaDon = giaTrihoaDon;
    }
    public double getGiaTrihoaDon() {
        return triGiaHoaDon;
    }

   
    public String toString() {
        String s ; 
        s = "\nTên khách hàng : "+getHoTen() + "\n" +"Địa chỉ : "+getDiaChi() + "\nTên công ty : " + getTenCongty() + "\n" + "Trị giá đơn hàng : " + getGiaTrihoaDon();
        return s; 
   

    
    }
    public void setTriGiaDonHang(int i) {
    }
    
}

