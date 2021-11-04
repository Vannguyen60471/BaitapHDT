/*
* ngày tạo: Nov 04, 2021
* tên tác giả: Nguyễn Hoàng Trọng văn
*/
package com.vannht2008110055.kiemtragiuaky;
import java.util.Scanner;
public class NhanVien extends Nguoi {
    private float hesoLuong;
    private float setHeSoLuong;
    
    Scanner sc = new Scanner(System.in);

    public void setHeSoluong(float heSoluong) {
        this.hesoLuong = heSoluong;
    }
    public float getHeSoluong() {
        if(hesoLuong > 0 && hesoLuong <= 10)
        {
            this.hesoLuong = hesoLuong;
        }
        return hesoLuong;
    }

    protected float tinhLuong(){
        System.out.println("SỐ TIỀN LƯƠNG : "+(1500000*hesoLuong));
        return hesoLuong;

    }

    
    public String toString(){
        String s ; 
        s = "\nTên nhân viên : "+getHoTen() + "\n" +"Địa chỉ : "+getDiaChi() +"\nHệ số lương nhân viên : " + getHeSoluong() + "\n" +"Lương nhân viên : " + tinhLuong();
        return s; 
    }
}
