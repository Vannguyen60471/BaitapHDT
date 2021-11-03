/*
* ngày tạo: Nov 03, 2021
* tên tác giả: Nguyễn Hoàng Trọng văn
*/
package com.vannht2008110055.lab8;

public class SinhVienGD {
    private String hoTen ;
    private String nganh ;
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getNganh() {
        return nganh;
    }
    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
     SinhVienGD(String hoTen , String nganh , Double diem  ){
        this.hoTen = hoTen ;
        this.nganh = nganh ;
        this.diem = diem ;
  
    }

    private Double diem ;
    public Double getDiem() {
        return diem;
    }
    private String hocluc ;
    public String getHocluc() {
        if (getDiem() < (double) 5){
            this.hocluc = " Yếu " ;
            return this.hocluc ;  }
        if (getDiem() >= (double) 5 && getDiem() < 6.5 ){
            this.hocluc = " Trung Bình ";
            return this.hocluc ;  
        }
         if (getDiem() >= 6.5 && getDiem() < 7.5 ){
            this.hocluc = " Khá ";
            return this.hocluc ; 
            }
        if (getDiem() >= 7.5 && getDiem() < (double) 9 ){
            this.hocluc = " Giỏi ";
            return this.hocluc ;  
            }
         if (getDiem() >= (double) 9 && getDiem() <= (double) 10 ){
            this.hocluc = " Xuất Sắc ";
            return this.hocluc ; 
      
        }else 
            System.out.println("Số điểm vượt quá quy định");
            return this.hocluc ; 
        }
    
    protected void xuat (){
        System.out.println("Họ và Tên : "+getHoTen());
        System.out.println("Ngành học : "+getNganh());
        System.out.println("Điểm      : "+getDiem());
        System.out.println("Học lực   : "+getHocluc());
    }
    
}
